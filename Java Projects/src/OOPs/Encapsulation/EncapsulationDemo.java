package OOPs.Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // use of setters
        Student s1 = new Student();
         s1.setName("Daniyal");
         s1.setRoll_no(72);
         s1.setAge(21);
// use of getters
        System.out.println("name " + s1.getName());
        System.out.println("Roll numbe r" + s1.getRoll_no());
        System.out.println("Age " + s1.getAge());
// we can only access the private members of the file without modifining them
    }
}
