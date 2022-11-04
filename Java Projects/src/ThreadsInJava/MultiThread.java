package ThreadsInJava;

public class MultiThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {

            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

        }
    }
}
