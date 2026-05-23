package NguyenNhatQuan.JavaCore.IO.Object;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVesionUID = 1L;

    private String id;
    private String name;
    private double price;

    private transient String temporaryNote;

    public Product(String id, String name, double price, String temporaryNote) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.temporaryNote = temporaryNote;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", temporaryNote='" + temporaryNote + '\'' +
                '}';
    }
}
