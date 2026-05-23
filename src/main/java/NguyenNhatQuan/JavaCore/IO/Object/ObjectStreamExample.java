package NguyenNhatQuan.JavaCore.IO.Object;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExample {
    public static void main(String[] args) {
        String filePath = "data/product_data.dat";
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("P05", "Laptop Gaming", 25000000, "Hàng dễ vỡ"));
        productList.add(new Product("P06", "Chuột không dây", 500000, "Màu đen"));

        File file = new File(filePath);

        boolean isAppend = file.exists() && file.length() > 0;
        try (FileOutputStream fos = new FileOutputStream(filePath,true);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = isAppend ? new AppendableObjectOutputStream(bos) : new ObjectOutputStream(bos);
        ) {
            oos.writeObject(productList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try(FileInputStream fis = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
        ) {
            List<Product> result = new ArrayList<>();
            while(true) {
                try {
                    List<Product> readList = (List<Product>) ois.readObject();
                    for (Product p : readList) {
                        result.add(p);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
            for(Product p : result) {
                System.out.println(p);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
