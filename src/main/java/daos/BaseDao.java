package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDao {
    public Connection getConnection() throws SQLException {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/lab10_telecom?serverTimezone=America/Lima";
        String user = "root";
        String password = "12345678";

        return DriverManager.getConnection(url, user, password);
    }
}
