package threads.ex;

public class TalkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Think about it");
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                System.err.print(ex);
            }
        }
    }
}