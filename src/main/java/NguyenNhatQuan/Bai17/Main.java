package NguyenNhatQuan.Bai17;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static boolean isPrime(int n) {
        if(n <= 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Nhap n");
        int n = Integer.parseInt(sc.nextLine());
        if(isPrime(n)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
