package NguyenNhatQuan.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        List<int[]> allSubarrays = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int[] sub = Arrays.copyOfRange(arr, i, j + 1);
                allSubarrays.add(sub);
            }
        }

        System.out.println("Tổng số dãy con: " + allSubarrays.size());

        for (int[] sub : allSubarrays) {
            System.out.println(Arrays.toString(sub));
        }
    }
}
