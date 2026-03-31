package NguyenNhatQuan.Bai5;

public class Main {
    public static void main(String[] args) {
        Employee e = new FullTimeEmployee("Alice", 3000);
        Employee p = new PartTimeEmployee("Bob", 15, 120);

        System.out.println(e.getName() + " salary: " + e.calculateSalary());
        System.out.println(p.getName() + " salary: " + p.calculateSalary());
    }
}
