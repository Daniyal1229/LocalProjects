package Learning;

public class Surface_area {
    void surface_area (int l ,int b,int h) {
        int fom = 2*(l*h+l*b+b*h);
        System.out.println("the surface area is  " + fom+ "sq.units");
    }
    int mysum (int n) {
        int sum = (n*(n+1))/2;
   //     System.out.println(sum);
         return sum;
    }
    int mysum2  (int n) {
        int sum=0;
                for(int i=0;i<=n;i++){
                    sum=sum+i;
        }
                return  sum;

    }

    public static void main(String[] args) {
        Surface_area obj = new Surface_area();
        obj.surface_area(3,5,7);
        int res = obj.mysum2(10);
        System.out.println("the sum of  is "+res);
      //  obj.mysum(10);
    }
}
