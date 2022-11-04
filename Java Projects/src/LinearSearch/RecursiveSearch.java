package LinearSearch;

public class RecursiveSearch {
    public int binarySearch(int[] numbers, int first, int last, int key){
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        int mid = first + (last-first)/2; // Avoid ArrayIndexOutOfBoundsException
        if (numbers[mid] == key){
            return mid;
        }else if (numbers[mid]<key){
            first = mid + 1;
            return binarySearch(numbers, first, last, key);
        }else {
            last = mid - 1;
            return binarySearch(numbers, first, last, key);
        }
    }

    public static void main(String[] args) {
        int[] sortedNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(sortedNumbers.length);
        int key = 2;
        int first = 0;
        int last = sortedNumbers.length-1;
        int index = new RecursiveSearch().binarySearch(sortedNumbers, first, last, key);
        System.out.println("Index of key: " + key + " is at index " + index);
        System.out.println("Position of key: " + key + " is at " + (index+1));

    }
}
