package Learning;

public class Tables {
    public static void main(String[] args) {

        for (int i = 1; i<11;i++) {
            for (int j = 1; j < 11; j++) {

                System.out.print(i +" * "+j+" = "+ i*j);
                System.out.print("\t\t");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
