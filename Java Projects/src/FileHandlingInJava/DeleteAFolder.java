package FileHandlingInJava;

import javax.swing.*;
import java.io.File;

public class DeleteAFolder {
    public static void main(String[] args) {
        File obj = new File("D:\\projects\\java projects\\Java Projects\\resources./java");
        if (obj.delete()){
            System.out.println("deleted folder sucessfully"+obj.getName());
        }
        else {
            System.out.println("filed to delete the folder");
        }
    }
}
