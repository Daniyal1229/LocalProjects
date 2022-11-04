package Learning;

import java.util.Arrays;

public class HelloWorld {
    /*
    class naem should be always a camelcase
    variables should not begin with number
    */
    public static void main(String[] args){ //here string is array of arguments used to pass command line arguments to your program which helps in debuging the program
        System.out.println("\n Testing Program");
        int a1 = 10;
        int a2 =11;
        int max = (a1> a2)?a1 : a2; //ternary operators
        System.out.println(max);
        System.out.println(a1);
        a1+=6;//assignment operators
        System.out.println(a1);
        System.out.println(++a1 + a2 ++);
        System.out.println(10&5);
        System.out.println(10|5);
        System.out.println(10^11);
        System.out.println(10<<2);;
        System.out.println(10<<2==40);
        float b = a1;// widening casting (automatically)
        float d = 20.6f;
        int c = (int)  d; // narrowing casting (manually)
        int p = 10;
        int q = 12;
        int r = 13;
        if(p>q && p>r) {
            System.out.println(p+"p is greatest");
        }
        else if (q>p && q>r) {
            System.out.println(q+"q is greatest");
        }
        else {
            System.out.println(r+" r is greatest");
        }

        int day = 8;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid number");
        }


    }
}
