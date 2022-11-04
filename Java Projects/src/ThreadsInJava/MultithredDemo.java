package ThreadsInJava;

public class MultithredDemo {
    public static void main(String[] args) {
        MultiThread thread1 = new MultiThread();
        MultiThread thread2 = new MultiThread();
        //  when we use run method it runs one after the other  thread1.run();
        thread1.start();//when we use start method it runs Symaltiniously
       // thread2.run();
        thread2.start();
    }
}
