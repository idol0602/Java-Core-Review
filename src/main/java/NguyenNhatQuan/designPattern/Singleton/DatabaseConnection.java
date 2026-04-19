package NguyenNhatQuan.designPattern.Singleton;

public class DatabaseConnection {
    static DatabaseConnection instance;

    DatabaseConnection() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }
    }

    static DatabaseConnection getInstance() {
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Execute " + sql);
    }
}
