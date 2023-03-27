package www.io.com;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo5 {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("E:\\www\\test2.txt");
            String content = "test content";
            byte[] bytes = content.getBytes(); //转成字节
            fileOutputStream.write(bytes);
            fileOutputStream.flush(); //写完之后一定要刷新
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (! fileOutputStream.equals(null)) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
