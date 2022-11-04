package ExceptionHandling;

public class F1 {
    public static void main(String[] args) {
        int i,j,k=0;
        try {
            i = 10;
            j = 2;
            k = i / j;
            int[] numbers = {1,2,3,4,5,6};
            System.out.println(numbers[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is invalid");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of bounds");
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("Exiting the code//Releasing the memory");
        }
        System.out.println(k);
    }
}
