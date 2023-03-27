package www.io.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo2 {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            // \\写成/也是可以的
            fileInputStream = new FileInputStream("E:\\www\\test.txt");
            int w = fileInputStream.read();
            System.out.println(w);
        } catch (IOException e) {
            e.printStackTrace();
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
