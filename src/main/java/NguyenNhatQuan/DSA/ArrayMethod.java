package NguyenNhatQuan.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMethod {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        int[] a = {4,5,6,3};
        Arrays.sort(a);
        for(int i : a) {
            System.out.print(i + "");
        }
        System.out.println();
        System.out.println("Max: " + Arrays.stream(a).max().getAsInt());
        System.out.println("Min: " + Arrays.stream(a).min().getAsInt());
        System.out.println("Avg: " + Arrays.stream(a).average().getAsDouble());

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);

        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println("Max: " + Collections.max(numbers));
        Collections.shuffle(numbers);

        System.out.println(Collections.frequency(numbers,20));

        int x = 5;
        int y = 10;
        System.out.println(Math.max(x,y));
    }
}
