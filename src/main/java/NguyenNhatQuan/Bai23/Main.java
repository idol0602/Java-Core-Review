package NguyenNhatQuan.Bai23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);

        if(numbers.contains(20)) {
            System.out.println("có");
        }else {
            System.out.println("không");
        }

        numbers.remove(1);
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
