package Arrays;

public class Array {
    public static void main(String[] args) {
        String[] names = {"syed","Daniyal","bokhari"};
        System.out.println(names[0]);
        System.out.println(names[1].charAt(0));
        System.out.println(names[1].toUpperCase());
        System.out.println(names[1].compareTo(names[2]));
        /*
        for (int i=0;i< names.length;i++){
            System.out.print(names[i] +" ");
        }
        System.out.println("\n");
        */
   int[] num = {1,2,3,4,5,};
        System.out.println(num[2]);

        for(int j=0;j< num.length;j++){
            System.out.println(num[j]);
        }

        System.out.println(num.length);

        for(String i : names)
        {
            System.out.print(i+" ");
        }
        for(int  j : num)
        {
            System.out.print(j+" ");
        }
    }
}
