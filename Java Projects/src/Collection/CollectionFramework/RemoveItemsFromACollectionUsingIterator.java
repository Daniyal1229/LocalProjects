package Collection.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItemsFromACollectionUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(3);
        numbers.add(31);
        numbers.add(42);
        numbers.add(6);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if (i>10){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
/*
Note: Trying to remove items from a collection using
for loop or for-each loop will not work because the collection is
changing size at the same time when the code is trying to loop.
 */
