package www.test.com;

public class demo3 {

    public static void main(String[] args) throws Exception{
        String a = "1";
        Integer b = Integer.parseInt(a);
        System.out.println(b);

        Object object = new Integer(1);
        String name = object.getClass().getName();
        String superName = object.getClass().getSuperclass().getName();
        System.out.println(superName);

        long i = 922337203;
        System.out.println(i);

        Long start = System.currentTimeMillis();
        Thread.sleep(1000);
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
