package Collection.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new LinkedHashSet<>();
        names.add("Sachin");
        names.add("Rahul");
        names.add("Sachin");
        names.add("Raman");
        names.add("Rahul");

        HashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1000);
        numbers.add(2000);
        numbers.add(1000);
        numbers.add(4000);

        System.out.println(names);
        System.out.println(numbers);
        System.out.println(names.contains("Raman"));
        names.clear();
        System.out.println(names.isEmpty());
    }
}
