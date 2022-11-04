package Wrapper;
import java.util.ArrayList;
public class WrapperClass {
        public static void main(String[] args) {
            int a = 10;
            Integer integer = 128;
            Double newDouble = 3.14;
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            Character ch = 'A';
            System.out.println(integer.intValue());
            System.out.println(newDouble.doubleValue());
            System.out.println(ch.charValue());
            String newString = integer.toString(); // 128 -> "128"
            System.out.println(newString);
            System.out.println(newString.length());

        }
    }


