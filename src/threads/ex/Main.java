package threads.ex;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);

        new Thread() {
            public void run() {
                for (int i =0; i < 10; i++) {
                    try {
                        queue.put("Java" + i);
                        System.out.println("Element " + i + " added");
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                for (int i = 0; i < 7; i++) {
                    try {
                        Thread.sleep(3000);
                        System.out.println(queue.poll() + " has been polled");
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }.start();
    }
}