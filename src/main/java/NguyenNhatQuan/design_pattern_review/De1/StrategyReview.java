package NguyenNhatQuan.design_pattern_review.De1;

public class StrategyReview {

    interface Payment {
        void pay(double amount);
    }

    static class CODPayemnt implements Payment{
        @Override
        public void pay(double amount) {
            System.out.println("Paywith COD " + amount);
        }
    }

    static class VisaPayemnt implements Payment{
        @Override
        public void pay(double amount) {
            System.out.println("Paywith Visa " + amount);
        }
    }

    static class MomoPayemnt implements Payment{
        @Override
        public void pay(double amount) {
            System.out.println("Paywith Momo " + amount);
        }
    }

    static class ZaloPayemnt implements Payment{
        @Override
        public void pay(double amount) {
            System.out.println("Paywith Zalo " + amount);
        }
    }

    static class PaymentService {
        Payment payment;

        public PaymentService(Payment payment) {
            this.payment = payment;
        }

        public void checkOut(double amount) {
            payment.pay(amount);
        }
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new ZaloPayemnt());
        paymentService.checkOut(1000);
    }
}
