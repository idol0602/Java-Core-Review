package NguyenNhatQuan.DSA;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("D",2);
        System.out.println(map.get("A"));
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.remove("A");
        System.out.println(map.containsKey("D"));
    }
}
