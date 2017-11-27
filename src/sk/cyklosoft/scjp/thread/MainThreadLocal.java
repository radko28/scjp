package sk.cyklosoft.scjp.thread;

public class MainThreadLocal {
    

    public MainThreadLocal() {
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnableThreadLocal sharedRunnableInstance = new MyRunnableThreadLocal("One");
        MyRunnableThreadLocal sharedRunnableInstance2 = new MyRunnableThreadLocal("Two");
        Thread thread1 = new Thread(sharedRunnableInstance,"One");
        Thread thread2 = new Thread(sharedRunnableInstance,"Two");

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate

    }
    
    

}
