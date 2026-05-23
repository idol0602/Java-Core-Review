package NguyenNhatQuan.DSA;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new TreeMap<>(Collections.reverseOrder());
        Map<String, Integer> scores2 = new TreeMap<>((k1, k2) -> k1.length() - k2.length());
        scores.put("Zoe", 85);
        scores.put("Alex", 92);
        scores.put("Milan", 78);
        scores.put("Duy", 95);

        for(Map.Entry<String,Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
