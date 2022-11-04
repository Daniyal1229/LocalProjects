package LinearSearch;

public class LinearSearch {
    private int linearSearch(int[] numbers,int key){
for (int i=0;i< numbers.length;i++){
    if (key==numbers[i]){
        return i;
    }
}
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {99,87,83,72,61,1,5,7,100};
        int key = 100;
        int index =new LinearSearch().linearSearch(numbers,key);
        System.out.println("index of key:"+" is at " +index);
        System.out.println("position of the key: "+" is at "+(index+1));
    }
}
