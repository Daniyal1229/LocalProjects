package FileHandlingInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RadingDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("D:\\projects\\java projects\\Java Projects\\resources./java//demo.txt");
        Scanner Reader = new Scanner(obj);
        while (Reader.hasNextLine()){
            String data = Reader.nextLine();
            System.out.println(data);
        }

        Reader.close();

    }
}
