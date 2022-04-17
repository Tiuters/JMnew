package a.concurrencies.alishev;

import java.nio.file.NoSuchFileException;
import java.util.stream.Stream;

public class lesson17 {
    public static void main(String[] args) {
        MyThred myThred1 = new MyThred();
        myThred1.start();
//        MyThred myThred2 = new MyThred();
//        myThred2.start();
        MyThreddd myThreddd = new MyThreddd();
        myThreddd.run();

        Thread thread = new Thread(new Runner());
        thread.start();

//        Runner runner = new Runner();
//        runner.run();
        System.out.println("runner.run: " + Thread.currentThread().getName());

        System.out.println("main");
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class MyThred  extends Thread{
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThred: " + Thread.currentThread().getName());
        }

    }
}

class MyThreddd  extends Thread{
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThreddd: " + Thread.currentThread().getName());
        }

    }
}
