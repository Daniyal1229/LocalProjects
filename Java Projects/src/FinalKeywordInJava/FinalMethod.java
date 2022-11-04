package FinalKeywordInJava;

public class FinalMethod {
    final void data(){
        System.out.println("Ghousia College");
    }
}

class College extends FinalMethod{
    /*
    void data(){
        System.out.println("RV College");
    }
    Cannot override final method()
     */
    public static void main(String[] args) {
        College c = new College();
        c.data();
    }
}
