package NguyenNhatQuan.Bai28;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(list.contains(nums[i])) {
                return true;
            }
            else {
                list.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
