package Collection.CollectionFramework;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Porsche");
        cars.add("Beetle");
        cars.add(0, "VOLVO");
        System.out.println(cars);
        for (String car : cars){
            System.out.print(car + " ");
        }
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(0, 4);

        System.out.println(numbers);
        for (Integer number : numbers){
            System.out.print(number + " ");
        }
    }
}
