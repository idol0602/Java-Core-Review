package NguyenNhatQuan.JavaCore.IO.Character;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamFileDemo {
    public static void main(String[] args) {
        String fileName = "my_text_file.txt";
        String content = "Hello, Java I/O!\nThis is a test line.";
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try(FileReader reader = new FileReader(fileName)){
            int charRead;

            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
