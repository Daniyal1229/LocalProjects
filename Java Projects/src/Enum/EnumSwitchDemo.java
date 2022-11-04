package Enum;
enum Level {
    LOW,
    HIGH,
    MEDIUM
}
public class EnumSwitchDemo {
    public static void main(String[] args) {
        Level var1 = Level.MEDIUM;

        switch (var1){
            case HIGH:
                System.out.println("High Priority");
                break;
            case LOW:
                System.out.println("Low Priority");
                break;
            case MEDIUM:
                System.out.println("Medium Priority");
                break;
            default:
                System.out.println("Invalid Priority");
        }
    }
}
