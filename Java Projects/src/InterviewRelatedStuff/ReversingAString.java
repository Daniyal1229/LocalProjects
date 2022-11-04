package InterviewRelatedStuff;

import java.util.Scanner;

public class ReversingAString {
        public static void main(String[] args) {
            System.out.println("Reversing A String");
            System.out.println("enter the string");
            Scanner sc = new Scanner(System.in);
            String str =sc.nextLine();
            String nstr=" ";
            char ch;
            System.out.println("original word "+ str);
            for (int i=0; i<str.length();i++)
            {

                ch = str.charAt(i);
                nstr = ch+nstr;
            }
            System.out.println("Reverse sword is : "+nstr);
            if (str.equalsIgnoreCase(nstr)){
                System.out.println("the string is palandrome");
            }
        }


}
