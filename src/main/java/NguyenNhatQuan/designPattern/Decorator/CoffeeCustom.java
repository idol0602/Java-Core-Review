package NguyenNhatQuan.designPattern.Decorator;

public abstract class CoffeeCustom implements Coffee {
    Coffee coffee;
    CoffeeCustom(Coffee coffee) {
        this.coffee = coffee;
    }
}
