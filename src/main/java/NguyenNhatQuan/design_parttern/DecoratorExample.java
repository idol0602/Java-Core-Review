package NguyenNhatQuan.design_parttern;

public class DecoratorExample {
    interface Coffee {
        String printDetail();
        double cost();
    }

    static class BasicCoffe implements Coffee {
        @Override
        public String printDetail() {
            return "Basic Coffe";
        };
        @Override
        public double cost() {
            return 10;
        };
    }

    static abstract class CoffeeCustom implements Coffee{
        protected Coffee coffee;

        public CoffeeCustom(Coffee coffee) {
            this.coffee = coffee;
        }
    }

    static class MilkCoffee extends CoffeeCustom {

        public MilkCoffee(Coffee coffee) {
            super(coffee);
        }

        @Override
        public String printDetail() {
            return coffee.printDetail() + " add Milk";
        };

        @Override
        public double cost() {
            return coffee.cost() + 2;
        };
    }

    public static void main(String[] args) {
        Coffee coffee = new BasicCoffe();
        coffee = new MilkCoffee(coffee);

        System.out.println(coffee.printDetail());
        System.out.println(coffee.cost());
    }
}
