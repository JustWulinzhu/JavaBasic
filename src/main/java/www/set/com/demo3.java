package www.set.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo3 {

    public enum  status {
        male, female;
    }

    public static void main(String[] args) {
        System.out.println(status.female);
        HashMap<String, String> a = new HashMap<>();
        a.put("name", "李四");
        a.put("age", "32");
        a.put("certNo", "140121199311112222");

        for (Map.Entry<String, String> entry : a.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

}
