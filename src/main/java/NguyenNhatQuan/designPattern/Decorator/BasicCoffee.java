package NguyenNhatQuan.designPattern.Decorator;

public class BasicCoffee implements Coffee{
    @Override
    public String printDetail() {
        return "Coffee";
    }
    @Override
    public double cost() {
        return 10;
    }
}
