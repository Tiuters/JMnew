package a.concurrencies.metodichka;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        AnotherRun anotherRun = new AnotherRun();
        Thread childTread = new Thread(anotherRun);
        childTread.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("m" + i);
            Thread.sleep(1000);
        }
        childTread.join();
        System.out.println("End");
    }
}

class AnotherRun implements Runnable {
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