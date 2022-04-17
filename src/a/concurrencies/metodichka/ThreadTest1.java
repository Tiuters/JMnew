package a.concurrencies.metodichka;

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        AnotherTask thread = new AnotherTask();
        thread.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("m" + i);
            Thread.sleep(1000);
        }
        thread.join();
        System.out.println("End");
    }
}

class AnotherTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("r" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupt");
            }
        }
    }
}