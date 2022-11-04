package FileHandlingInJava;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("D:\\projects\\java projects\\Java Projects\\resources\\java\\demo.txt",true);
        writer.append("\ni am from bangalore" );
        writer.close();
        System.out.println("sucessfully written into the file");
    }
}
