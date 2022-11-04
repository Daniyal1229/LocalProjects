package Arrays;

public class Jaggarray {
    public static void main(String[] args) {
        int[][] jaggarray ={{1,2,3,4,40,50,60},{
                5,6,7,8},
                {9,10,11,12}};
        for (int i=0;i< jaggarray.length;i++) {
            for (int j=0;j<jaggarray[i].length;j++) {
                System.out.print(jaggarray[i][j]);
            }
            System.out.println();
        }
    }
}
