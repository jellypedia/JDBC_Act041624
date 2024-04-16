import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateData {
    public static void main(String[] args) {
        try(Connection c = mySQLConnection.getConnection();
            PreparedStatement stmt = c.prepareStatement(
                    "UPDATE users SET name=?, email=? WHERE id=?"
            )) {
            String newName = "Summer Rodrigo";
            String newEmail = "summer@real.com";
            int id = 5;
            stmt.setString(1,newName);
            stmt.setString(2, newEmail);
            stmt.setInt(3,id);

            int rowsUpdated = stmt.executeUpdate();
            System.out.println("Rows Updated: " + rowsUpdated);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
