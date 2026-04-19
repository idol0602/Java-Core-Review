package NguyenNhatQuan.designPattern.Strategy;

public class NoDiscount implements Discount{
    @Override
    public double apply(double amount) {
        return amount;
    }
}
