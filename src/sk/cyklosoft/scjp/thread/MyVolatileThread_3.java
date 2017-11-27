package sk.cyklosoft.scjp.thread;

import sk.cyklosoft.scjp.data.SharedObject;

public class MyVolatileThread_3 extends Thread {
    private SharedObject sharedObject;
    
    public MyVolatileThread_3(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }
    
    public void run() {
        int local_value = sharedObject.age;
        while (local_value < 5){
            if( local_value!= sharedObject.age){
                System.out.printf("Got Change for %d %s\n", sharedObject.age, this.getName());
                 local_value= sharedObject.age;
            }
        }
    }
}
