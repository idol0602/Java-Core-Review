package NguyenNhatQuan.DSA;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println(list.contains(4));
        System.out.println(list.size());

        Collections.sort(list);
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
