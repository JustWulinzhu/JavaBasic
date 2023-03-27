package www.test.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date1 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String now = sdf.format(date);
        System.out.println(now);

//        (new date1()).sleep();
        (new date1()).diff();
    }

    /**
     * 暂停程序
     */
    public void sleep() {
        try {
            System.out.println(new Date());
            Thread.sleep(2000);
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * 计算时间差
     */
    public void diff() {
        try {
            long start = System.currentTimeMillis();
            Thread.sleep(1000);
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println(diff);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}