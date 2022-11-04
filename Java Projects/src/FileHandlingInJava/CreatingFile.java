package FileHandlingInJava;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File obj = new File("D:\\projects\\java projects\\Java Projects\\resources\\java//demo.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("file created sucussfully " + obj.getName());
            }
                else {
                System.out.println("file already exist");
            }
            } catch (IOException e) {
            System.out.println("something unexpected happen");
        }
    }
}
