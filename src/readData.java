import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readData {
    public static void main(String[] args) {
        try(Connection c = mySQLConnection.getConnection();
            Statement stmt = c.createStatement()) {
            String query = "SELECT * FROM users";
            ResultSet res = stmt.executeQuery(query);
                while(res.next()) {
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String email = res.getString("email");
                    System.out.println("\nID: " + id + "\nNAME: " + name + "\nEMAIL: " + email);
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
