package NguyenNhatQuan.Bai22;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        int j = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
        }
        for(int num: nums) {
            System.out.println(num);
        }
    }
}
