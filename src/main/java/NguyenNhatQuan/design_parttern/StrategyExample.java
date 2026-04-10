package NguyenNhatQuan.design_parttern;

public class StrategyExample {

    interface DiscountStrategy {
        double apply(double amount);
    }

    static class NoDiscount implements DiscountStrategy {
        @Override
        public double apply(double amount) {
            return amount;
        }
    }

    static class TenPercentDiscount implements DiscountStrategy {
        @Override
        public double apply(double amount) {
            return amount * 0.9;
        }
    }

    static class OrderService {
        private final DiscountStrategy strategy;

        public OrderService(DiscountStrategy strategy) {
            this.strategy = strategy;
        }

        public double checkOut (double amount) {
            return strategy.apply(amount);
        }
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService(new TenPercentDiscount());
        System.out.println(orderService.checkOut(100));
    }
}
