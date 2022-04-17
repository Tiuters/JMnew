package a.concurrencies.alishev;

import java.util.Scanner;

public class lesson18_volatile {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hey");
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
