package Learning;

public class Whileloop {
    public static void main(String[] args) {
        int a=10;
        while (a<=20){
            System.out.println(a);
            a++;
        }
   do {
       System.out.println(a);
       a++;
   }
   while(a<5);
   for (int i=0;i<=4;i++)
        for (int j=0;j<=10;j++)
   {
       if (i*j<+24){
           break;//come out of the loop when it reads  24
       }
       System.out.println(i*j);
   }
        for (int i=0;i<=4;i++)
            {
                if (i<=2) {
                    continue;//skips the condition and jumps to the next value
                }
                System.out.println(i);
                }
        System.out.println("i study \t in Ghousia  \nCollege");
    }
}
