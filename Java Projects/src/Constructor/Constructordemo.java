package Constructor;

public class Constructordemo {
    int x;
    int y;
    public Constructordemo(){
        x = 12;
        y =29;
    }
    public Constructordemo(int a,int b,int c) {
        a=10;
        b=12;
        c=30;
    }
    public Constructordemo(double a,double b) {
        a=(int)10;
        b=(int)20;
    }
    class Constructor {
        public static void main(String[] args) {
            Constructordemo obj = new Constructordemo();
            System.out.println(obj.x);
            System.out.println(obj.y);

            Constructordemo obj1 = new Constructordemo(2,4);
            System.out.println(obj.x);
            System.out.println(obj.y);

            Constructordemo obj2 = new Constructordemo(5,8);
            System.out.println(obj2.x);
            System.out.println(obj2.y);

        }
    }


}
