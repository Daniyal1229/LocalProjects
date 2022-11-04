package Enum;

public class EnumDemo {
    enum TrafficSignal {
        RED,
        GREEN,
        YELLOW
    }

    public static void main(String[] args) {
        TrafficSignal l1 = TrafficSignal.GREEN;
        TrafficSignal l2 = TrafficSignal.YELLOW;
        TrafficSignal l3 = TrafficSignal.RED;

        System.out.println("The signal is: " + l1);

        for (TrafficSignal colour : TrafficSignal.values()){
            System.out.println(colour);
        }
    }
}
