package NguyenNhatQuan.JavaCore.IO.CSVtoObject;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteCSV {
    public static void main(String[] args) {
        String csvFile = "data/output.csv";
        try(FileWriter fw = new FileWriter(csvFile);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            fw.append("Tên,Tuổi,Thành phố\n");
            fw.append("Nguyễn Văn A,25,Hà Nội\n");
            fw.append("Trần Thị B,30,Hồ Chí Minh\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
