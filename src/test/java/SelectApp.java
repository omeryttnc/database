import java.sql.*;

public class SelectApp {

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect(String path) {
        // SQLite connection string
        String url = "jdbc:sqlite:" + path;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    /**
     * select all rows in the warehouses table
     */
    public void selectAll(String path, String tableName) {
        String sql = "SELECT * FROM " + tableName;

        try (Connection conn = this.connect(path);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("url") + "\t" +
                        rs.getString("ProductName") + "\t" +
                        rs.getInt("price"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String path, String tableName, String url, String ProductName, int price) {
        String sql = "INSERT INTO " + tableName + "(url,ProductName,price) VALUES(?,?,?)";

        try (Connection conn = this.connect(path);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, url);
            pstmt.setString(2, ProductName);
            pstmt.setInt(3, price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void insert2(String path, String tableName, int id, String url, String ProductName, int price) {
        String sql = "INSERT INTO " + tableName + "(id,url,ProductName,price) VALUES(?,?,?,?)";

        try (Connection conn = this.connect(path);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, url);
            pstmt.setString(3, ProductName);
            pstmt.setInt(4, price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
