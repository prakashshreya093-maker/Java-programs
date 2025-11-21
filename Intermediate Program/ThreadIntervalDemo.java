class MyThread implements Runnable {
    private String threadName;
    private int delay;
    MyThread(String name, int delay) {
        this.threadName = name;
        this.delay = delay;
    }
    public void run() {
        try {
            while (true) {
                System.out.println(threadName + " is running");
                Thread.sleep(delay); 
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
    }
}
public class ThreadIntervalDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1", 2000);
        MyThread t2 = new MyThread("Thread 2", 4000);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
