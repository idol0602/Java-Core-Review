package NguyenNhatQuan.Bai19;

import java.util.HashMap;
import java.util.Map;

public class Bai19 {
    public static void main(String[] args) {
        int[] res = {-1,-1};
        Map<Integer,Integer> map = new HashMap<>();
        int target = 9;
        int[] inputs = {2, 11, 15, 18};
        for(int i=0; i<inputs.length; i++) {
            if(map.isEmpty()) {
                map.put(inputs[i],i);
            }
            int sub = target - inputs[i];
            if(map.containsKey(sub)) {
                res[0] = map.get(sub);
                res[1] = i;
            }else {
                map.put(inputs[i],i);
            }
        }

        System.out.println(res[0] + "," + res[1]);
    }
}
