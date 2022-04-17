package a.concurrencies.alishev;

public class Lesson19_synchronized {
    private int counter;

    public static void main(String[] args) {
        Lesson19_synchronized lesson19 = new Lesson19_synchronized();
        lesson19.doWork();
    }

    private void count() {
        synchronized(this) {counter++;}
    }

    public void doWork() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }

}
