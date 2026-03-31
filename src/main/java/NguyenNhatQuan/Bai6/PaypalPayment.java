package NguyenNhatQuan.Bai6;

public class PaypalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
