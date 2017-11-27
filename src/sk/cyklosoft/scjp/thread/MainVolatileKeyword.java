package sk.cyklosoft.scjp.thread;

import sk.cyklosoft.scjp.data.SharedObject;

public class MainVolatileKeyword {
    public static void main(String[] args) throws InterruptedException {
        SharedObject sharedObject = new SharedObject();
        new MyVolatileThread_3(sharedObject).start();
        new MyVolatileThread_4(sharedObject).start();
    }
}



