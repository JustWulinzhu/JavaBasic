package www.test.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date1 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String  now = sdf.format(date);
        System.out.println(now);
    }

}