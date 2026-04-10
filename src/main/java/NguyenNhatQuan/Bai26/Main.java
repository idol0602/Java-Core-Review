package NguyenNhatQuan.Bai26;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        List<String> list = new ArrayList<>(Arrays.asList("Java","Python","C++","JS"));
        list.replaceAll(s -> s.toUpperCase());
        list.forEach(item -> System.out.println(item));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,4,2));
        Collections.sort(list2,Collections.reverseOrder());
        list2.forEach(item -> System.out.println(item));
        System.out.println(Collections.max(list2));
    }
}
