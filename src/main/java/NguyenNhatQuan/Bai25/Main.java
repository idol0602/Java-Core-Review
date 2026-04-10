package NguyenNhatQuan.Bai25;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("u001","Nguyen van A");
        map.put("u002","Nguyen van B");

        System.out.println(map.containsKey("u001"));
        System.out.println(map.containsValue("Nguyen van A"));

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
