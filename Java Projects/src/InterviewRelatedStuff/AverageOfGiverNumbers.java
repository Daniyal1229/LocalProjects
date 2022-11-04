package InterviewRelatedStuff;

public class AverageOfGiverNumbers {
    public static void main(String[] args) {
        System.out.println("To add all array elements");
        int[] num = {1,2,3,4,5,6,7,8,9};
        for (int i=0;i<num.length;i++) {
            System.out.print("+"+num[i]);
        }
        System.out.println("");
        int sum=0;
        for (int i=0;i<num.length;i++) {
            sum = sum + num[i];
            System.out.println(sum);
        }
    }
}
