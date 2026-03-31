package NguyenNhatQuan.Bai4;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("123456", 1000);
        BankAccount b = new BankAccount("654321", 500);

        try {
            BankAccount.transfer(a, b, 200);
            System.out.println("Transfer successful");
            System.out.println("Account a balance: " + a.getBalance());
            System.out.println("Account b balance: " + b.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
