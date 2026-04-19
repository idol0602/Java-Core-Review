package NguyenNhatQuan.designPattern.FactoryMethod;

public class PDF implements Doc{
    @Override
    public void print() {
        System.out.println("PDF");
    }
}
