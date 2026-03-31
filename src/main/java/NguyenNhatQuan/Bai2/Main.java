package NguyenNhatQuan.Bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(1,"one");
        mp.put(2,"two");
        for(Map.Entry<Integer,String> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
