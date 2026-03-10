import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class BookDAO {

    public static void addBook(Book book) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO books(title,author,price,quantity) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());
            ps.setInt(4, book.getQuantity());

            ps.executeUpdate();

            System.out.println("Book Added Successfully");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void viewBooks() {

    try {

        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM books";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        System.out.println("ID\tTitle\t\tAuthor\t\tPrice\tQuantity");
        System.out.println("-----------------------------------------------------------");

        while(rs.next())
        {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String author = rs.getString("author");
            double price = rs.getDouble("price");
            int quantity = rs.getInt("quantity");

            System.out.println(id + "\t" + title + "\t" + author + "\t" + price + "\t" + quantity);
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public static void deleteBook(int id) {

    try {

        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM books WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if(rows > 0)
        {
            System.out.println("Book Deleted Successfully");
        }
        else
        {
            System.out.println("Book Not Found");
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public static void updateBook(int id, double price, int quantity) {

    try {

        Connection con = DBConnection.getConnection();

        String query = "UPDATE books SET price = ?, quantity = ? WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setDouble(1, price);
        ps.setInt(2, quantity);
        ps.setInt(3, id);

        int rows = ps.executeUpdate();

        if(rows > 0)
        {
            System.out.println("Book Updated Successfully");
        }
        else
        {
            System.out.println("Book Not Found");
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

}

}