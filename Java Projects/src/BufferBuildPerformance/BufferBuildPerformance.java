package BufferBuildPerformance;

public class BufferBuildPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Placement");
        for (int i = 0; i < 10000; i++) {
            sbf.append(" Training");
        }
        System.out.println("Time taken by SBF: " + (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("Placement");
        for (int i = 0; i < 10000; i++) {
            sbl.append(" Training");
        }
        System.out.println("Time taken by SBL: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}