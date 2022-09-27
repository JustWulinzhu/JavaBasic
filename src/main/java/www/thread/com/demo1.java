package www.thread.com;

public class demo1 {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start(); //启动新线程
    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("start new thread");
    }
}