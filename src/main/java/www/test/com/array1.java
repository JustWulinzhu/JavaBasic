package www.test.com;

import java.util.Arrays;

public class array1 {

    public static void main(String[] args) {
        int[] myInt = new int[3];
        myInt[0] = 1;
        myInt[1] = 3;
        myInt[2] = 2;

        Arrays.sort(myInt);
        String array = Arrays.toString(myInt);
        System.out.println(array);
    }

}
