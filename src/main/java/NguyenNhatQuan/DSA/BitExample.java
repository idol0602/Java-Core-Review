package NguyenNhatQuan.DSA;

public class BitExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("a & b: " + (a & b) );

        System.out.println(Integer.toBinaryString(a));
        System.out.println((Integer.toBinaryString(b)));

        // AND
        System.out.println("AND " + Integer.toBinaryString(a & b));

        //OR
        System.out.println("OR " + Integer.toBinaryString(a | b));

        //XOR
        System.out.println("XOR " + Integer.toBinaryString(a ^ b));

        //NOT
        System.out.println("NOT " + Integer.toBinaryString(~ a));

        String binary = "11";

        System.out.println("Binary to Integer " + Integer.parseInt(binary,2));
    }
}
