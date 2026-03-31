package NguyenNhatQuan.Bai1;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = Integer.parseInt(sc.nextLine());
        if(isPrime(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
