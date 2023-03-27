package www.set.com;

import java.util.HashMap;
import java.util.Set;

public class demo1 {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "张三");
        hashMap.put("age", "22");
        hashMap.put("certNo", "1401211991");

        Boolean isContainsKey = hashMap.containsKey("name");
        System.out.println(isContainsKey);
        Boolean isContainsValue = hashMap.containsValue("张三a");
        System.out.println(isContainsValue);
        String name = hashMap.get("name");
        System.out.println(name);

        HashMap<String, String> a = new HashMap<>();
        a.putAll(hashMap);
        System.out.println(a);
        String remove = a.remove("names");
        System.out.println(remove);
        String removes = a.remove("name2");
        System.out.println(removes);
        Boolean isEmpty = a.isEmpty();
        System.out.println(isEmpty);
        int size = a.size();
        System.out.println(size);

        //HashMap的遍历
        System.out.println(a);
        Set set = a.keySet();
        System.out.println(set);
        for (String key : a.keySet()) {
            System.out.println(key);
        }
    }

}
