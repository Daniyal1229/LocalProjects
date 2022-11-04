package Collection.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> itemPrices = new HashMap<>();
        itemPrices.put("Chicken Biryani", 130);
        itemPrices.put("Chicken Kebab", 80);
        //System.out.println(itemPrices);
        // Accessing only keys
        for (String x : itemPrices.keySet()){
            System.out.println(x);
        }
        // Accessing only values
        for (Integer y : itemPrices.values()){
            System.out.println(y);
        }
        // Accessing both key-values
        for (String z : itemPrices.keySet()){
            System.out.println("key " + z + " value " + itemPrices.get(z));
        }
    }
}
