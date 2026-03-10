import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/book_management";
            String user = "library_user";
            String password = "1234";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully");

        } 
        catch (Exception e) {
            System.out.println("Database Connection Failed");
            e.printStackTrace();
        }

        return con;
    }
}