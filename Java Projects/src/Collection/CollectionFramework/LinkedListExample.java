package Collection.CollectionFramework;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Porsche");
        cars.add("Beetle");
        System.out.println("Before Adding: First: " + cars.getFirst());
        System.out.println("Before Adding: Last: " + cars.getLast());
        System.out.println(cars);
        cars.addFirst("VOLVO");
        cars.addLast("LAMBORGHINI");
        System.out.println("After Adding: First: " + cars.getFirst());
        System.out.println("After Adding: Last: " + cars.getLast());
        System.out.println(cars);
    }
}
