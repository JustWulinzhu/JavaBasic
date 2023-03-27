package www.io.com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流，字节流转换成字符流 InputStreamReader
 */
public class demo9 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("e:\\www\\test.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String content = bufferedReader.readLine();
                if (null == content) {
                    break;
                }
                System.out.println(content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bufferedReader) {
                try {
                    bufferedReader.close(); //只需要关闭最外层就行
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
