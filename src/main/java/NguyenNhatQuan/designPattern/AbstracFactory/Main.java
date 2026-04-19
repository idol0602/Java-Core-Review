package NguyenNhatQuan.designPattern.AbstracFactory;

public class Main {
    public static void main(String[] args) {
        DarkFactory darkFactory = new DarkFactory();
        Button button = darkFactory.createButton();
        button.render();
    }
}
