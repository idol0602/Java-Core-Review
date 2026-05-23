package NguyenNhatQuan.DSA;

import java.util.*;

public class ModExample{
    public static void listElement(int N, int X, int Y, int Z) {
        long MOD = 1000000000L;
        long[] list = new long[N];
        list[0] = X;
        System.out.print(list[0] + " ");
        for (int i = 1; i < N; i++) {
            long value = ((((long)list[i-1] % MOD) *
                    ((long)Y)%MOD)%MOD + 5L * ((long)Z)%MOD)%MOD;
            list[i] = value;

            System.out.print(list[i] + (i == N - 1 ? "" : " "));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = 12;
            // Gán biến theo đúng logic Test Case 3
            int X = 73;
            int Y = 65;
            int Z = 5;

            listElement(N, X, Y, Z);
    }
}