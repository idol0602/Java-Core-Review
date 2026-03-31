package NguyenNhatQuan.Bai14;

import java.io.*;
import java.util.Scanner;

public class TodoApp {
    public static void writeToDo(String filePath, Scanner sc) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            System.out.println("Enter your to-do items (type 'exit' to finish):");
            while(true) {
                String line = sc.nextLine();
                if(line.trim().equalsIgnoreCase("exit")) break;
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Đã lưu vào file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readToDo(String filePath) {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
