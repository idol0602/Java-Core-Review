package NguyenNhatQuan.Bai21;

public class Main {
    public static void rotate(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums,0,nums.length - 1);
        rotate(nums,0,k - 1);
        rotate(nums, k, nums.length - 1);
        for(int num : nums) {
            System.out.println(num);
        }
    }
}
