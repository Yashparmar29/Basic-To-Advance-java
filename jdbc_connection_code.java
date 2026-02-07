import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_connection_code {

    private static Connection con = null;

    public static Connection getConnection() {

        try {
            if (con == null || con.isClosed()) {

                // MySQL JDBC Driver (optional in Java 8+, safe to keep)
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Database details
                String url = "jdbc:mysql://localhost:3306/food_delivery";
                String user = "root";
                String password = "yash";

                con = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Database Connected Successfully");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Database connection failed");
            e.printStackTrace();
        }

        return con;
    }
}
