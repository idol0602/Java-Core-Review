package NguyenNhatQuan.Bai6;

public class CryptoPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Processing crypto payment of $" + amount);
    }
}
