package BufferBuildPerformance;

public class StringBuilderExample {
    public void stringAppend() {
        StringBuilder sb = new StringBuilder("Ghousia");
        System.out.println("Old String: " + sb); // Ghousia
        sb.append(" College");
        System.out.println("New String: " + sb); // Ghousia College
    }
    public void stringInsert(){
        StringBuilder sb = new StringBuilder("JA");
        System.out.println("Before Insertion: " + sb);
        sb.insert(1, "AV"); // JAVA
        System.out.println("After Insertion: " + sb);
    }
    public void stringReverse(){
        StringBuilder sb = new StringBuilder("AISUOHG");
        System.out.println("Before reversing: " + sb);
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBuilderExample builderExample = new StringBuilderExample();
        builderExample.stringAppend();
        builderExample.stringInsert();
        builderExample.stringReverse();
    }
}
