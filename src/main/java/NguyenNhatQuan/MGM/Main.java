package NguyenNhatQuan.MGM;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "aabbbc";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<input.length(); i++) {
            char x = input.charAt(i);
            if(!map.containsKey(x)) {
                map.put(x,1);
            }else {
                map.put(x,map.get(x) + 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
