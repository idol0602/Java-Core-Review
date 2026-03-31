package NguyenNhatQuan.Bai14;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("1. write to do");
            System.out.println("2. read to do");
            System.out.println("3. exit");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> TodoApp.writeToDo("todo.txt", sc);
                case 2 -> TodoApp.readToDo("todo.txt");
                case 3 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
