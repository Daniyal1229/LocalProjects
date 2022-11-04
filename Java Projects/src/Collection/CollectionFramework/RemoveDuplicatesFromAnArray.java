package Collection.CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        String[] names = {"Tanzeem", "Mujaheed","Abdul","Tanzeem","Heena","Heena"};
        Set<String> uniqueNames = new LinkedHashSet<>();

        for (int i=0; i< names.length; i++){
            uniqueNames.add(names[i]);
        }
        System.out.println("After removing duplicates: ");
        //System.out.println(uniqueNames);
        // Lambda Expression
        uniqueNames.forEach(str -> System.out.println(str));
    }
}
