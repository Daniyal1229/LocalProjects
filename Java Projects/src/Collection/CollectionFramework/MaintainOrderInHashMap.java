package Collection.CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaintainOrderInHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("01", "aaaaa");
        hm1.put("03", "bbbbb");
        hm1.put("04", "zzzzz");
        hm1.put("02", "xxxxx");

        System.out.println("Iterating over HashMap: ");

        for (Map.Entry<String, String> entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " => " + ": " + entry.getValue());
        }

        HashMap<String, String> hm2 = new LinkedHashMap<>();
        hm2.put("01", "aaaaa");
        hm2.put("03", "bbbbb");
        hm2.put("04", "zzzzz");
        hm2.put("02", "xxxxx");

        System.out.println("Iterating over LinkedHashMap: ");

        for (Map.Entry<String, String> entry : hm2.entrySet()){
            System.out.println(entry.getKey() + " => " + ": " + entry.getValue());
        }

    }
}
