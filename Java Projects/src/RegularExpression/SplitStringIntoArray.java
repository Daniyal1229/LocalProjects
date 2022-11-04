package RegularExpression;

public class SplitStringIntoArray {
    public static void main(String[] args) {
        String data = "Hello1we1are1learning1core1java";
        String[] message =data.split("1");
        System.out.println(message[4]);
    }
}
