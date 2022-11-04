package OOPs.Abstraction.Interface;

    interface AnimalInterface {
        public void size();

        public void sound();
    }
 class Lion implements AnimalInterface {

    @Override
    public void size() {
        System.out.println("lLion is huge is size");
    }

    @Override
    public void sound() {
        System.out.println("lion sounds louder");
    }
}
class Squral implements AnimalInterface {

    @Override
    public void size() {
        System.out.println("squral is small in size");
    }

    @Override
    public void sound() {
        System.out.println("squral sounds low");
    }
}
class InterfaceDemo {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.size();
        l.sound();
        Squral s = new Squral();
        s.size();s.sound();
    }
}
