package BufferBuildPerformance;

public class StringBufferExample {
    public void stringAppend() {
        StringBuffer sb = new StringBuffer("Ghousia");
        System.out.println("Old String: " + sb); // Ghousia
        sb.append(" College");
        System.out.println("New String: " + sb); // Ghousia College
    }
    public void stringInsert(){
        StringBuffer sb = new StringBuffer("JA");
        System.out.println("Before Insertion: " + sb);
        sb.insert(1, "AV"); // JAVA
        System.out.println("After Insertion: " + sb);
    }
    public void stringReverse(){
        StringBuffer sb = new StringBuffer("AISUOHG");
        System.out.println("Before reversing: " + sb);
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBufferExample bufferExample = new StringBufferExample();
        bufferExample.stringAppend();
        bufferExample.stringInsert();
        bufferExample.stringReverse();
    }
}
