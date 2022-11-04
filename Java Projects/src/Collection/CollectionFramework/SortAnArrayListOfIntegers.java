package Collection.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayListOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(3);
        numbers.add(31);
        numbers.add(42);
        numbers.add(6);

        Collections.sort(numbers); // Ascending Order
        Collections.reverse(numbers); // Descending Order

        for (int i : numbers){
            System.out.print(i + " ");
        }
    }
}
