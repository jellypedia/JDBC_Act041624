import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args) {
        Connection c = mySQLConnection.getConnection();
        String query = "CREATE TABLE IF NOT EXISTS crudUsers (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50) NOT NULL," +
                "email VARCHAR(100) NOT NULL)";
        try {
            Statement stmt = c.createStatement();
            stmt.execute(query);
            System.out.println("Table has been created!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
