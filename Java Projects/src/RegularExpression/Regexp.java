package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("core java");//,CASE_INSENSITIVE
        Matcher matcher = pattern.matcher("we are learning core Java");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
        if (matchFound){
            System.out.println("match has been found");
        }
        else {
            System.out.println("match has not been found");
        }
    }
}
