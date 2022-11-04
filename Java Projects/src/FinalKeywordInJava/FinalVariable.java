package FinalKeywordInJava;

public class FinalVariable {
    final int parameter = 100;

    final int value; // final variables are initialised inside constructor
    static final int number;
    // Initialising static final variable in the static block
    static {number = 20;}
    FinalVariable(){ // this is a constructor
        value = 10;

        System.out.println(value);
        System.out.println(parameter);
    }
    void change(){
        // parameter = 200;  we cannot asign value to the final variable parameter
    }

    public static void main(String[] args) {
        new FinalVariable();
        System.out.println(number);
    }
}
