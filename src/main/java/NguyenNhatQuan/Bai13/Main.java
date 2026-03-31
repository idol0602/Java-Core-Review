package NguyenNhatQuan.Bai13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double grade = Double.parseDouble(parts[2].trim());
                list.add(new Student(id,name,grade));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        list.stream().filter((sv) -> sv.getGrade() >= 8.0).forEach(System.out::println);
    };
}
