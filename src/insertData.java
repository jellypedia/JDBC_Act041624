import com.mysql.cj.MysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertData {
    public static void main(String[] args) {
        try(Connection c = mySQLConnection.getConnection();
            PreparedStatement stmt = c.prepareStatement(
                    "INSERT INTO users (name,email) VALUES (?,?)"
            )){
            String name = "Charlene Repuesto";
            String email = "charlie@real.com";

            stmt.setString(1,name);
            stmt.setString(2,email);

            int rowsInsert = stmt.executeUpdate();
            System.out.println("Rows Inserted: " + rowsInsert);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
