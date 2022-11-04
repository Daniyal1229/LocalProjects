package OOPs.Polymorphism.ForOverloading;
//by taking the name of the class by taking the . operator
public class Addition {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));
    }

/*
    class AdditionDemo {
        public static void main(String[] args) {
            System.out.println(Addition.add(12, 24, 36, 48));
        }
        */

    }

