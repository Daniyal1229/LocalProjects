package OOPs.Polymorphism.ForOverriding;

public class Banking {
    int rateOfIntrest() {return  5;}
}
class ICIC extends Banking {
    int rateOfIntrest() {return  6;}
}
class AXIS extends Banking {
    int rateOfIntrest() {return  7;}
}
class HDFC extends Banking {
  int rateOfIntrest() {return 8;}
}
class BankingExample {
    public static void main(String[] args) {
        ICIC icic = new ICIC();
        AXIS axis = new AXIS();
        HDFC hdfc = new HDFC();
        System.out.println("the ROi of ICIC bank is "+icic.rateOfIntrest() +"%");
        System.out.println("the ROi of AXIS bank is "+axis.rateOfIntrest() +"%");
        System.out.println("the ROi of HDFC  bank is "+hdfc.rateOfIntrest() +"%");
    }
}
