package listWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println(list);
        System.out.println("---------------");
        list.remove("banana");
        System.out.println(list);
        System.out.println("----------------");
        System.out.println(list.size());
        System.out.println("----------------");
        System.out.println(list.contains("a"));
        System.out.println("----------------");
        System.out.println(list.isEmpty());
        System.out.println("----------------");
        System.out.println(list.indexOf("apple"));
        System.out.println("----------------");
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println("----------------");




    }
}
