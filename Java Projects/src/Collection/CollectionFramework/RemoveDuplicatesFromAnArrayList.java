package Collection.CollectionFramework;

import java.util.ArrayList;

public class RemoveDuplicatesFromAnArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Gokul");
        arrayList.add("Prem");
        arrayList.add("Gokul");
        arrayList.add("Prem");
        arrayList.add("Shashank");

        System.out.println("Before removing duplicates: " + arrayList);

        for (int i=0; i<arrayList.size(); i++){
            for (int j=i+1; j< arrayList.size(); j++){
                if (arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                }
            }
        }
        System.out.println("After removing duplicates: " + arrayList);
    }
}
