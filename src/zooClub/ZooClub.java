package zooClub;

import zooClub.models.Animal;
import zooClub.models.Person;

import java.util.*;

public class ZooClub {
    Map<Person, List<Animal>> personListMap = new HashMap<>();

    public ZooClub() {
        personListMap.put(new Person("Oleg", 23),
                new ArrayList<>(List.of(new Animal("Dog", "Sharik"),
                        new Animal("Cat", "Murzik"))));
    }

    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of person");
        String name = scanner.next();
        System.out.println("Write age of your " + name);
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        personListMap.put(person, new ArrayList<>());
    }

    public void addPetToPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of person");
        String name = scanner.next();

        if (isPersonExist(personListMap, name)) {
            System.out.println("Write down your animals type");
            String type = scanner.next();
            System.out.println("Write down name of your animal");
            String nameOfAnimal = scanner.next();

            Animal animal = new Animal(type, nameOfAnimal);

            Iterator<Map.Entry<Person, List<Animal>>> iterator = personListMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Person, List<Animal>> next = iterator.next();

                if (name.equalsIgnoreCase(next.getKey().getName())) {
                    List<Animal> animalList = next.getValue();
                    animalList.add(animal);
                }
            }
//            personListMap.entrySet().stream()
//                    .filter(e -> e.getKey().getName().equalsIgnoreCase(name))
//                    .findFirst()
//                    .ifPresent(e -> e.getValue().add(animal));
        }
    }

    public boolean isPersonExist(Map<Person, List<Animal>> personListMap, String name) {
//        for (Map.Entry<Person, List<Animal>> entry : personListMap.entrySet()) {
//            if (entry.getKey().getName().equalsIgnoreCase(name)){
//                return true;
//            }
//        }
//        return false;
        return personListMap.entrySet().stream().anyMatch(e -> e.getKey().getName().equalsIgnoreCase(name));
    }

}
