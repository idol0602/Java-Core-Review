package NguyenNhatQuan.designPattern.FactoryMethod;

public class DocFactory {
    Doc createDoc(String type) {
        switch (type) {
            case "WORD" -> {
                return new Word();
            }
            case "PDF" -> {
                return new PDF();
            }
            default -> {
                throw new RuntimeException();
            }
        }
    }
}
