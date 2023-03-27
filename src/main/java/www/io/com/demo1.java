package www.io.com;

import java.io.File;
import java.io.IOException;

public class demo1 {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\www\\test2.txt");
        if (! file.exists()) {
            file.createNewFile();
        } else {
            file.delete();
        }

    }

}
