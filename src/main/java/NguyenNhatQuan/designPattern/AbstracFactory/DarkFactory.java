package NguyenNhatQuan.designPattern.AbstracFactory;

public class DarkFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
