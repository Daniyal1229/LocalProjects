package OOPs.Abstraction.Interface;
// for abstract class we use abstract keyword
abstract class Animals {
    public abstract void sound();
    public void run() {
        System.out.println("i am running");
    }
}
class  Tiger extends Animals {

    @Override
    public void sound() {
        System.out.println("i am a tiger and i have a very loud voice");
    }
}

class  Tertle extends Animals{

    @Override
    public void sound() {
        System.out.println("i am a tertle and i have a very low voice");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sound();
        tiger.run();
        Tertle tertle = new Tertle();
        tertle.sound();
        tertle.run();
    }
}