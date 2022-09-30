package www.thread.com;

/**
 * 两个线程互相争抢cpu资源
 */

public class demo6 {

    public static void main(String[] args) {

        Thread thread = new demo5();
        thread.setName("子线程");
        thread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("demo6---" + i);
        }
    }

}
