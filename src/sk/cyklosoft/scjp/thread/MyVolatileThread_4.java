package sk.cyklosoft.scjp.thread;

import sk.cyklosoft.scjp.data.SharedObject;

public class MyVolatileThread_4 extends Thread {
    
    private SharedObject sharedObject;
    
    public MyVolatileThread_4(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    
    public void run() {
        int local_value = sharedObject.age;
        while (sharedObject.age <5){
            System.out.printf("Incrementing %d %s\n", local_value + 1, this.getName());
            sharedObject.age = ++local_value;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}