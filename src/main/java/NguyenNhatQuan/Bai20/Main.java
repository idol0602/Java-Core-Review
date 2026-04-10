package NguyenNhatQuan.Bai20;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int sumActual = 0;
        for(int i=0; i<n; i++) {
            sumActual += nums[i];
        }
        System.out.println(sum - sumActual);
    }
}
