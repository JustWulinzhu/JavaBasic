package www.io.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo6 {

    public static void main(String[] args) {
        Boolean flag = demo6.copy("E:\\www\\test.txt", "E:\\www\\test3.txt");
        System.out.println(flag);
    }

    /**
     * 文件复制
     * @param sourceFile 源文件
     * @param targetFile 目标文件
     * @return
     */
    public static Boolean copy(String sourceFile, String targetFile) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        Boolean flag = false;
        try {
            fileInputStream = new FileInputStream(sourceFile);
            fileOutputStream = new FileOutputStream(targetFile);

            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);

            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (! fileInputStream.equals(null)) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (! fileOutputStream.equals(null)) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return flag;
    }

}
