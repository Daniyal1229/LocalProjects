package Reference_variable;

public class Local_rv {
    public static void main(String[] args) {
        int count =10;
        String name ="DS";
        int number;//can access as it is not initialised
        System.out.println(count);
        System.out.println(name);
      //  System.out.println(number);
       //  System.out.println(num1); cannot access other class variables as it is defined locally
    }
    void display(){
        int num1 = 10;
        System.out.println(num1);

    }
}
