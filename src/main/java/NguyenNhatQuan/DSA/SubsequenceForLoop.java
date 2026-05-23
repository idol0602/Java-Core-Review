package NguyenNhatQuan.DSA;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceForLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : arr) {
            int currentSize = result.size();
            for (int i = 0; i < currentSize; i++) {
                List<Integer> newSub = new ArrayList<>(result.get(i));
                newSub.add(num);
                result.add(newSub);
            }
        }
        System.out.println("Tất cả dãy con (Subsequences):");
        for (List<Integer> s : result) {
            System.out.println(s);
        }
    }
}
