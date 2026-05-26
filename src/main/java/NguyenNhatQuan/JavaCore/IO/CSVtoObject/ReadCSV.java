package NguyenNhatQuan.JavaCore.IO.CSVtoObject;

import java.io.*;

public class ReadCSV {
    public static void main(String[] args) {
        String path1 = "data/input.csv";
        String splitRegex = ",";

        try(FileReader fr = new FileReader(path1);
            BufferedReader br = new BufferedReader(fr);
        ) {

            String line = "";
            br.readLine();
            while((line = br.readLine()) != null) {
                String[] data = line.split(splitRegex);
                String id = data[0];
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String city = data[3];
                String jobName = data[4];
                Person person = new Person(id,name,age,city,jobName);
                System.out.println(person);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
