package NguyenNhatQuan.JavaCore.IO.Binary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamReadExample {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("data/input.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("data/output.txt", true);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int byteData;
            while((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
