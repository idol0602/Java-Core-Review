package NguyenNhatQuan.designPattern.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        DocFactory docFactory = new DocFactory();
        Doc doc = docFactory.createDoc("WORD");
        doc.print();
    }
}
