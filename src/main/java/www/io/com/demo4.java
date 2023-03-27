package www.io.com;

import java.io.FileInputStream;
import java.io.IOException;

public class demo4 {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("E:\\www\\test.txt");
            byte[] bytes = new byte[fileInputStream.available()]; //available方法返回剩余的字节数，可以利用这个一次性读取文件
            int readLength = fileInputStream.read(bytes);
            if (readLength > 0) {
                String content = new String(bytes);
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
