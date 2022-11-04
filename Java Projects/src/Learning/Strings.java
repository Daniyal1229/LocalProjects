package Learning;


import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String message = "hello";
        char[]chars={'h','e','l','l','o' ,'w'};
        String newString=new String(chars);
        System.out.println(message);
        System.out.println(newString);
        String m1 = "Daniyal";
        String m2 = "Syed";
        System.out.println(m1==m2); //string compare
        System.out.println(m1.compareTo(m2));
        System.out.println(m1+" "+m2);
        System.out.println(m1+  m2);
         String m3 ="12";
         String m4 = "29";
        System.out.println(m3+m4);
        //Accessing array elements
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(1));
        System.out.println(message.charAt(2));
        System.out.println(message.charAt(3));
        System.out.println(message.charAt(4));
        System.out.println("\n");
        //Accessing last element of array
        System.out.println(message.charAt(message.length()-1) );
        System.out.println("length is " + message.length());
        Scanner sc = new Scanner(System.in);//to read user input
     /*   System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("String is "+ str); */
        String a = "java";
         a =  a.concat(" programming");

        System.out.println(a);
        String  d ="Daniyal";
        System.out.println(d.toLowerCase());
        System.out.println(d.toUpperCase());
        String e ="              syed          ";
        System.out.println(e);
        System.out.println(e.trim());//trim is used to remove white space


    }
}
