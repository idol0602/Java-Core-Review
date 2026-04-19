package NguyenNhatQuan.designPattern.Strategy;

public class OrderService {
    private Discount discount;

    OrderService(Discount discount) {
        this.discount = discount;
    }

    public double checkOut(double amount) {
        return discount.apply(amount);
    }
}
