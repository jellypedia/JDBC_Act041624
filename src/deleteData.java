import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteData {
    public static void main(String[] args) {
        try(Connection c = mySQLConnection.getConnection();
            PreparedStatement stmt = c.prepareStatement(
                    "DELETE FROM users WHERE ?<id AND ?>ID"
            )) {
            int startingID = 5;
            int endingID = 8;
            stmt.setInt(1,startingID);
            stmt.setInt(2,endingID);
            int rowsDeleted = stmt.executeUpdate();

            System.out.println("Rows Deleted: " + rowsDeleted);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
