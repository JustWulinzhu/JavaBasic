package www.test.com;

public class demo2 {

    public static void main(String[] args) {
        double i = Math.random();
        int j = Math.abs(-2);

        String x = "aaa";
        int len = x.length();
        System.out.println(len);


        int a = 1;
        Integer b = 1;
        Integer c = new Integer(1);
        System.out.println(b);
        if (c.equals(b)) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

}
