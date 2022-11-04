package OOPs.Inheritance;
// SINGLE LEVEL CLASS
public class Animals {
    void eat() {
        System.out.println("i am eating something");
    }
    void run(){
        System.out.println("i am running");
    }
}
class Dog extends Animals {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.run();

    }
}
