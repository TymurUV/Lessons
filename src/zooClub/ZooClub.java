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

    public void removePetFromPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of person to remove from");
        String nameOfPerson = scanner.next();
        System.out.println("Write down age of person");
        int ageOfPerson = scanner.nextInt();
        if (isPersonExist(personListMap, nameOfPerson)) {
            System.out.println("Write down type of animal to remove");
            String typeOfAnimal = scanner.next();
            System.out.println("Write down name of animal");
            String nameOfAnimal = scanner.next();
            if (isAnimalExist(personListMap, nameOfPerson, ageOfPerson, typeOfAnimal, nameOfAnimal)) {
                personListMap.entrySet().stream()
                        .filter(e -> e.getKey().getName().equalsIgnoreCase(nameOfPerson) && e.getKey().getAge() == ageOfPerson)
                        .findFirst()
                        .ifPresent(e -> {
                            List<Animal> animalList = e.getValue();
                            animalList.removeIf(animal -> animal.getName().equalsIgnoreCase(nameOfAnimal) &&
                                    animal.getType().equalsIgnoreCase(typeOfAnimal));
                            System.out.println(nameOfAnimal.toUpperCase() + "Successfully deleted");
                        });
            }
        }
    }

    public void removePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of person to remove from");
        String nameOfPerson = scanner.next();
        System.out.println("Write down age of person");
        int ageOfPerson = scanner.nextInt();
        if (isPersonExist(personListMap, nameOfPerson)) {
            personListMap.entrySet().stream()
                    .filter(e -> e.getKey().getName().equalsIgnoreCase(nameOfPerson) && e.getKey().getAge() == ageOfPerson)
                    .findFirst()
                    .ifPresent(e -> {
                        personListMap.remove(e.getKey());
                        System.out.println(e.getKey() + "Successfully deleted");
                    });
        }
    }

    public void removeCertainAnimalFromAllPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down type of animal to remove");
        String typeOfAnimal = scanner.next();
        personListMap.entrySet().forEach(e -> {
            List<Animal> animalList = e.getValue();
            animalList.removeIf(animal -> animal.getType().equalsIgnoreCase(typeOfAnimal));

            animalList.forEach(animal -> System.out.println(animal.toString() + "successfully deleted"));
        });
    }

    public void getZooClub() {
//        for (Map.Entry<Person, List<Animal>> entry : personListMap.entrySet()) {
//            System.out.println("Member " + entry.getKey().getName() + " has " + entry.getValue());
//        }
        personListMap.forEach((p, a) -> System.out.println("Member " + p.getName() + " has " + a));
    }
    public void getExit(){
        System.exit(0);
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

    public boolean isAnimalExist(Map<Person, List<Animal>> animalListMap, String nameOfPerson, int ageOfPerson, String type, String nameOfAnimal) {
        return animalListMap.entrySet()
                .stream()
                .filter(e -> e.getKey().getName().equalsIgnoreCase(nameOfPerson) && e.getKey().getAge() == ageOfPerson)
                .flatMap(e -> e.getValue().stream())
                .anyMatch(e -> e.getType().equalsIgnoreCase(type) && e.getName().equalsIgnoreCase(nameOfAnimal));

    }

}
