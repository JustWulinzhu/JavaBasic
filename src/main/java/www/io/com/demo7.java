package www.io.com;

import java.io.FileReader;
import java.io.IOException;

/**
 * 纯文本操作优先采取本方案，不需要自定义char[]数组
 */
public class demo7 {

    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("e:\\www\\test.txt");

            char[] chars = new char[8];
            while (true) {
                int w = fileReader.read(chars);
                if (-1 == w) {
                    break;
                }
                String content = new String(chars, 0, w);
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileReader) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
