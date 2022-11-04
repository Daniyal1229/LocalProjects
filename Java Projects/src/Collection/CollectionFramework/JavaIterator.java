package Collection.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Volkswagen");

        Iterator<String> it = cars.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
