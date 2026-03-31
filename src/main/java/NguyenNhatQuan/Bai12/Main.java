package NguyenNhatQuan.Bai12;

public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("Hello");
        System.out.println(stringStorage.getItem()); // Hello
    }
}
