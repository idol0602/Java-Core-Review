package NguyenNhatQuan.designPattern.Strategy;

public class TenPercentDiscount implements Discount{
    @Override
    public double apply(double amount) {
        return amount * 0.9;
    }

}
