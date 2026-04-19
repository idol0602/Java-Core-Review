package NguyenNhatQuan.designPattern.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkCoffee(coffee);

        System.out.println(coffee.printDetail());
        System.out.println(coffee.cost());
    }
}
