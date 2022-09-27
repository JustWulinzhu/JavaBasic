package www.thread.com;

/**
 * 创建守护线程
 */

import java.util.Random;

public class demo4 {

    public static void main(String[] args) {
        Thread thread = new MyThread2();
        thread.setDaemon(true);
        thread.start();
    }

}

class MyThread2 extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("111");
        }
    }
}