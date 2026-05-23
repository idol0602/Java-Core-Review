package NguyenNhatQuan.JavaCore.IO.Binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamCopyExample {
    public static void main(String[] args) {
        String sourceFile = "data/input.txt";
        String destinationFile = "data/output.txt";

        try(FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);
        ) {
            int byteData;
            while((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Ghi Du Lieu Thanh Cong");
        } catch (Exception e) {
            System.out.println("Ghi Du Lieu That Bai");
            throw new RuntimeException(e);
        }
    }
}
