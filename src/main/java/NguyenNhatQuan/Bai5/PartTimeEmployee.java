package NguyenNhatQuan.Bai5;

public class PartTimeEmployee extends Employee {
    private final double hourlyRate;
    private final double hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
}
