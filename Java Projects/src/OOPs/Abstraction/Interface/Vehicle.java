package OOPs.Abstraction.Interface;

abstract  class Vehicle {
    abstract  void start();
    }
    class Car extends Vehicle {

        @Override
        void start() {
            System.out.println("car starts with keys");
        }
    }
    class Scooter extends Vehicle{

        @Override
        void start() {
            System.out.println("Scooter starts with keys or kick");
        }
    }
    class VehicalDemo {
        public static void main(String[] args) {
            Car c = new Car();
            c.start();

            Scooter s = new Scooter();
            s.start();

        }
    }
