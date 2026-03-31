package NguyenNhatQuan.Bai5;

public class FullTimeEmployee extends Employee{
    private final double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return this.monthlySalary;
    }
}
