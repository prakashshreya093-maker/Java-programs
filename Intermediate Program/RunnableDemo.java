class MyThread implements Runnable {
    private String threadName;
    MyThread(String name) {
        threadName = name;
    }
    public void run() {
        System.out.println(threadName + " is starting...");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " has finished execution.");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        System.out.println("Main thread is running...");
    }
}
