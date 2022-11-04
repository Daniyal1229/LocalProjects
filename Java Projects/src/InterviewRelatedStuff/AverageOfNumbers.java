package InterviewRelatedStuff;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;
        double sum = 0.0;
        double avg = 0.0;
        System.out.println("enter the first number");
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        sum=n1+n2;
        avg=sum/2;
        System.out.println("Average"+avg);
    }
}
