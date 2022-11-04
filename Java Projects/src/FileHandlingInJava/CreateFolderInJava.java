package FileHandlingInJava;

import java.io.File;

public class CreateFolderInJava {
    public static void main(String[] args) {
        File obj = new File("D:\\projects\\java projects\\Java Projects\\resources./java");
        if (obj.mkdir()) {
            System.out.println("created one new folder: " + obj.getName());
        }

        else
            System.out.println("folder already exist");
        }
    }

