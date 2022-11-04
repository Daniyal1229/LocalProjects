package Learning;

import java.sql.SQLOutput;

public class Functions {
    void my_sum(int a , int b) {
        int sum = a+b;
        System.out.println("sum is "+sum);
    }
    void my_diff(int a, int b) {
        int diff = a-b;
        System.out.println("diff is "+diff);
    }
    static void my_mul(int a, int b){
        int mul = a*b;
        System.out.println("mul is "+mul);
    }
    void my_div(int a,int b) {
        int div = a/b;
        System.out.println("div is "+div);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 29;
        int sum = a + b;
        System.out.println("sum is"+sum);
        Functions  obj  = new Functions();
        obj.my_sum(2,5);
        obj.my_diff(5,2); //create a new object to acess the class functions
        //objects are called as key of the class since the function is not static we create new objects
        my_mul(3,5); // since static function
        obj.my_div(10,5);
    }
}
