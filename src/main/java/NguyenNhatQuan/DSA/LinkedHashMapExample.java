package NguyenNhatQuan.DSA;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String,String> fruitColors = new LinkedHashMap<>();
        fruitColors.put("Apple","Red");
        fruitColors.put("Banana","Yellow");
        fruitColors.put("Grape","Purple");
        fruitColors.put("Orange","Orange");

        for(Map.Entry<String,String> entry : fruitColors.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
