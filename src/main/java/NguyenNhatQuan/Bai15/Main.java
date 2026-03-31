package NguyenNhatQuan.Bai15;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World!");
        sb.insert(5,"oke");
        sb.replace(0,5,"Hi");
        sb.append(" 123");
        sb.delete(0,2);
        sb.reverse();
        String s = sb.toString();
        System.out.println(sb);
        System.out.println(s);
    }
}
