package NguyenNhatQuan.designPattern.Decorator;

public class MilkCoffee extends CoffeeCustom{

    public MilkCoffee(Coffee coffee) {super(coffee);}

    @Override
    public String printDetail() {
        return coffee.printDetail() + " Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2;
    }
}
