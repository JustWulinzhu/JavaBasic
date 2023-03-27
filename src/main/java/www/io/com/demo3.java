package www.io.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class demo3 {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("E:\\www\\test.txt");
            byte[] bytes = new byte[5]; //装数据的装载车

            Set set = new HashSet();
            while (true) {
                int w = fileInputStream.read(bytes); //read把读出来的数据放到bytes里面，方法返回读了的字节数，到达文件末尾返回-1
                if (w > 0) {
                    String content = new String(bytes, 0, w); //bytes转换String
                    set.add(content);
                } else {
                    break;
                }
            }
            System.out.println(set);
        } catch (IOException IOe) {
            IOe.printStackTrace();
        } finally {
            if (null != fileInputStream) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
