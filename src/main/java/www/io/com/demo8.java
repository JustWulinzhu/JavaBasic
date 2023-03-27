package www.io.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo8 {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        //当一个流的参数是另一个流时，这个流是传进来流的包装流，也叫处理流，传进来的流叫做节点流。
        try {
            fileReader = new FileReader("e:\\www\\test.txt");
            bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (null == line) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
