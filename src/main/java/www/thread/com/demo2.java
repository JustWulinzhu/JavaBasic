package www.thread.com;

/**
 * thread.join() 方法可以使其他线程等待自己执行完毕再执行。
 */

public class demo2 {

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(
                ()->{
                    System.out.println("t hello");
                }
        );
        System.out.println("start");
        thread.start();
        thread.join(); //主线程main将会等待thread线程先执行，然后再执行main
        System.out.println("end");
    }

}