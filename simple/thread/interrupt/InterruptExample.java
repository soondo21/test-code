package simple.thread.interrupt;

import simple.thread.interrupt.PrintThread;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}