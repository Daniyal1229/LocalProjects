package LocalDateTime;
// to display local date and time
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import  java.time.format.DateTimeFormatter;

public class Localdate {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("the date and time is " + obj);
        System.out.println("\n");
        LocalTime obj2 = LocalTime.now();
        System.out.println(obj2);
        LocalDate obj3 = LocalDate.now();
        System.out.println("");
        System.out.println(obj3);
        // TO FORMATE DATE AND TIME
        System.out.println("\n\n");
        LocalDateTime ob5j = LocalDateTime.now();
        System.out.println("Date / Time before formating\n :" +ob5j);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E,MMM,DD,YYYY");
        String formatteDateTime =obj.format(format);
        System.out.println("Date / Time After Formating\n " +formatteDateTime+obj2);

    }
}
