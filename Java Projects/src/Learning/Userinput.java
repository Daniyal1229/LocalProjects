package Learning;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :\n");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){
            if(i%2==0){
                System.out.println(i+" is even");
            }
            else if (i==6*n-1){
                System.out.println(i+ " is prime");
            }


            else {
                System.out.println(i+" is odd");
            }

        }

    }
}
