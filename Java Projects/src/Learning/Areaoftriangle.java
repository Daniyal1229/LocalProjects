package Learning;

import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base");
        int base = sc.nextInt();
        System.out.println("enter the height");
        int height = sc.nextInt();
        double formula = 0.5 * (base * height);
        System.out.println(formula);
    }
}
