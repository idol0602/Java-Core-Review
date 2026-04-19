package NguyenNhatQuan.Bai30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 1, 3, 2, 2, 3, 2};
        Map<Integer,Integer> map = new LinkedHashMap();
        for(int i=0; i<input.length; i++) {
            if(!map.containsKey(input[i])) {
                map.put(input[i],1);
            }else {
                map.put(input[i], map.get(input[i]) + 1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        for(Map.Entry<Integer,Integer> i : list) {
            for(int j=0; j<i.getValue(); j++) {
                System.out.println(i.getKey() + " ");
            }
        }
    }
}
