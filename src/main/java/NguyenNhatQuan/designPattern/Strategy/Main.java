package NguyenNhatQuan.designPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new TenPercentDiscount());
        System.out.println(orderService.checkOut(100));
    }
}
