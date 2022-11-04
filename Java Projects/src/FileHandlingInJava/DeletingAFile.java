package FileHandlingInJava;

import java.io.File;

public class DeletingAFile {
    public static void main(String[] args) {
        File obj = new File("D:\\projects\\java projects\\Java Projects\\resources\\java//demo.txt");

        if (obj.delete()) {
            System.out.println("file deleted  sucussfully " + obj.getName());
        } else {
            System.out.println("failed to delete ");
        }

    }
}
