package InterviewRelatedStuff;

public class Patients {
    String name;
    int age;
    int reg_num;
    String disease;

    public Patients(String name, int age, int reg_num, String disease){
        this.name = name;
        this.age = age;
        this.reg_num = reg_num;
        this.disease = disease;
    }
    public void patientDetails(){
        System.out.println("Patient details are: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Registration Number: " + this.reg_num);
        System.out.println("Category of Disease: " + this.disease);
        System.out.println();
    }

}
class PatientDetails {
    public static void main(String[] args) {
        Patients p1 = new Patients("P1", 21, 1001, "Malaria");
        Patients p2 = new Patients("P2", 22, 1002, "Jaundice");
        Patients p3 = new Patients("P3", 35, 1003, "Corona");

        p1.patientDetails();
        p2.patientDetails();
        p3.patientDetails();
    }
}
