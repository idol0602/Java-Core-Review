package NguyenNhatQuan.design_parttern;

public class FactoryExample {

    enum PaymentType {
        MOMO , VNPAY
    }

    interface Payment {
        void pay();
    }

    static class MomoPayment implements Payment {
        @Override
        public void pay() {
            System.out.println("Momo payment");
        }
    }

    static class VNPayPayment implements Payment {
        @Override
        public void pay() {
            System.out.println("VNPay paymemt");
        }
    }

    static class PaymentFactory {
        public static Payment create(PaymentType type) {
            return switch (type) {
                case MOMO -> new MomoPayment();
                case VNPAY -> new VNPayPayment();
                default -> throw new RuntimeException("Invalid Type");
            };
        }
    }

    public static void main(String[] args) {
        Payment momoPayment = PaymentFactory.create(PaymentType.MOMO);
        Payment vnpayPayment = PaymentFactory.create(PaymentType.VNPAY);
        momoPayment.pay();
        vnpayPayment.pay();
    }
}
