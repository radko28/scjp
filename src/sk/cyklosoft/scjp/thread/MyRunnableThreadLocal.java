package sk.cyklosoft.scjp.thread;

public class MyRunnableThreadLocal implements Runnable {
    private ThreadLocal<Integer> threadLocal =
                    new ThreadLocal<Integer>();
    private volatile int age;
    private String name;

    public MyRunnableThreadLocal(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int value = (int) (Math.random() * 100D);
        System.out.printf("value = %d\n", value);
        threadLocal.set( value);
        age = value;
        System.out.printf("age = %d\n", age);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.printf("value = %d\n", threadLocal.get());
        System.out.printf("age = %d\n", age);
        
    }

}
