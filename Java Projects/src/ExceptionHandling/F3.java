package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            String str;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter data: ");
            str = br.readLine();
            System.out.println(str);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            br.close();
        }
    }
}
