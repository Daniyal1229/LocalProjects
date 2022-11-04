package InterviewRelatedStuff;

public class ThisKeywordDemo {
    int i; // Instance variable

    void setValue(int i){
        this.i = i;
    }
    void display(){
        System.out.println(i);
    }

}
class ThisDemo {
    public static void main(String[] args) {
        ThisKeywordDemo tk = new ThisKeywordDemo();
        ThisKeywordDemo tk1 = new ThisKeywordDemo();
        tk.setValue(10);
        tk1.setValue(11);
        tk.display();
        tk1.display();
    }
}
