package NguyenNhatQuan.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final  List<Student> ls = new ArrayList<>();
    public static void printMenu() {
        System.out.println("---MENU---");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Hien thi sinh vien");
        System.out.println("3. Thoat");
        System.out.println("4.Max GPA");
        System.out.println("5. Sort Order By GPA");
    }

    public static void printStudent(Student s) {
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Address: " + s.getAddress());
        System.out.println("GPA: " + s.getGpa());
    }

    public static void printListStudent() {
        for(Student s : ls) {
            printStudent(s);
            System.out.println("-------------");
        }
    }

    public static void insertStudent() {
        System.out.println("Nhap ten sinh vien");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi sinh vien");
        String address = sc.nextLine();
        System.out.println("Nhap GPA");
        float gpa = Float.parseFloat(sc.nextLine());
        Student s = new Student(name, age, address,gpa);
        ls.add(s);
    }

    public static Student maxGPA() {
        if(ls.isEmpty()) return null;
        Student max = ls.get(0);
        for(Student s : ls) {
            if(s.getGpa() > max.getGpa()) {
                max = s;
            }
        }
        return max;
    }

    public static List<Student> sortByGPA() {
        List<Student> sortedList = new ArrayList<>(ls);
        sortedList.sort((s1,s2) -> Float.compare(s1.getGpa(), s2.getGpa()));
        return sortedList;
    }

    public static void main(String[] args) {
        while(true) {
            printMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    insertStudent();
                    break;
                }
                case 2: {
                        printListStudent();
                        break;
                }
                case 3: {
                    System.out.println("Thoat chuong trinh");
                    sc.close();
                    return;
                }
                case 4: {
                    Student max = maxGPA();
                    if(max != null) {
                        System.out.println("Sinh vien co GPA cao nhat:");
                        printStudent(max);
                    } else {
                        System.out.println("Danh sach sinh vien rong");
                    }
                    break;
                }
                case 5: {
                    List<Student> res = sortByGPA();
                    System.out.println("Danh sach sinh vien sau khi sap xep theo GPA:");
                    for(Student s : res) {
                        printStudent(s);
                        System.out.println("-------------");
                    }
                }
            }
        }
    }
}
