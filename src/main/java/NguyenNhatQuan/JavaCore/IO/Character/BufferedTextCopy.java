package NguyenNhatQuan.JavaCore.IO.Character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedTextCopy {
    public static void main(String[] args) {
        String sourceFile = "data/input.txt";
        String destFile = "data/output.txt";
        try(
                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(destFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String line;
            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Ghi thất bai");
            throw new RuntimeException(e);
        }
    }
}
