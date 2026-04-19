package NguyenNhatQuan.designPattern.AbstracFactory;

public class DarkCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("Dark CheckBox");
    }
}
