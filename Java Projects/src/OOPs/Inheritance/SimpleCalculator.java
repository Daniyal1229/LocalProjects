package OOPs.Inheritance;

public class SimpleCalculator {
    float addition(float a, float b) {
        return a + b;
    }
}

    class AdvanceCalculator extends SimpleCalculator {
        float Subtraction(float a, float b) {
            return a - b;
        }
    }
    class SuprtAdvanceCalculato extends AdvanceCalculator {
            float Multiplication(float a, float b) {
                return a * b;
            }
            float Division(float a, float b) {
                return a / b;
            }
        }
        class Calculator {


            public static <SuprtAdvanceCalculator> void main(String[] args) {
                System.out.println("***************************************");
                SimpleCalculator s1 = new SimpleCalculator();
                float r1 = s1.addition(2,4);
                System.out.println(r1);
                System.out.println("****************************************");
                AdvanceCalculator s2 = new AdvanceCalculator();
                float r2 = s2.Subtraction(9,3);
                float r3 = s2.addition(2,8);
                System.out.println(r2);
                System.out.println(r3);
                System.out.println("************************************");
                SuprtAdvanceCalculato s3 = new SuprtAdvanceCalculato();
                float r33 = s3.Multiplication(2,4);
                System.out.println(r33);
                float r4 = s3.Division(5,10);
                System.out.println(r4);
                float r5 = s3.Subtraction(4,2);
                System.out.println(r5);
                float r6 = s3.addition(2,4);
                System.out.println(r5);
            }

}
