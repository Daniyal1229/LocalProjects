package ThreadsInJava;

public class ThreadWithPriority extends Thread{
    @Override
    public void run() {
        System.out.println("inside run metthod");
    }

    public static void main(String[] args) {
        ThreadWithPriority t1 =new ThreadWithPriority();
        ThreadWithPriority t2 =new ThreadWithPriority();
        ThreadWithPriority t3 =new ThreadWithPriority();

        System.out.println("t1: priority -->"+t1.getPriority());
        System.out.println("t1: priority -->"+t2.getPriority());
        System.out.println("t1: priority -->"+t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(8);
        t3.setPriority(4);
        System.out.println("t1: priority -->"+t1.getPriority());
        System.out.println("t1: priority -->"+t2.getPriority());
        System.out.println("t1: priority -->"+t3.getPriority());

        System.out.println("current thread "+ currentThread().getName());
        System.out.println("curerent thread priority "+ currentThread().getPriority());
      //  currentThread().setPriority(11); maximum thread priority in java is 10
          // least priority is 1
        t1.start();
        t2.start();
        t3.start();


    }
}
