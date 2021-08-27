import org.openqa.selenium.WebDriver;

import java.sql.*;

public class database_method {
    private database_method() {
    }

    public static void createNewDatabase(String fileName) {
        String url = "jdbc:sqlite:src/test/databases/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void connectDataBase(String path) {
        String jdbcUrl = "jdbc:sqlite:" + path;

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Database is connected");


    }

    public static void createNewTable(String databasePath, String tableName,
                                      String name_1, String type_1,
                                      String name_2, String type_2) {
        // SQLite connection string
        connectDataBase(databasePath);
        String url = "jdbc:sqlite:" + databasePath;
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + "(\n"
                + "	" + name_1 + " " + type_1.toUpperCase() + " PRIMARY KEY,\n"
                + " " + name_2 + " " + type_2.toUpperCase() + " \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTable(String databasePath, String tableName,
                                      String name_1, String type_1,
                                      String name_2, String type_2,
                                      String name_3, String type_3) {
        // SQLite connection string
        connectDataBase(databasePath);
        String url = "jdbc:sqlite:" + databasePath;
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + "(\n"
                + "	" + name_1 + " " + type_1.toUpperCase() + " PRIMARY KEY,\n"
                + " " + name_2 + " " + type_2.toUpperCase() + " ,\n"
                + " " + name_3 + " " + type_3.toUpperCase() + " \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTable(String databasePath, String tableName,
                                      String name_1, String type_1,
                                      String name_2, String type_2,
                                      String name_3, String type_3,
                                      String name_4, String type_4) {
        // SQLite connection string
        connectDataBase(databasePath);
        String url = "jdbc:sqlite:" + databasePath;
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + "(\n"
                + "	" + name_1 + " " + type_1.toUpperCase() + " PRIMARY KEY,\n"
                + " " + name_2 + " " + type_2.toUpperCase() + " ,\n"
                + " " + name_3 + " " + type_3.toUpperCase() + " ,\n"
                + " " + name_4 + " " + type_4.toUpperCase() + " \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            System.out.println("table is created");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void createNewTable(String databasePath, String tableName,
                                      String name_1, String type_1,
                                      String name_2, String type_2,
                                      String name_3, String type_3,
                                      String name_4, String type_4,
                                      String name_5, String type_5) {
        // SQLite connection string
        connectDataBase(databasePath);
        String url = "jdbc:sqlite:" + databasePath;
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + "(\n"
                + "	" + name_1 + " " + type_1.toUpperCase() + " PRIMARY KEY,\n"
                + " " + name_2 + " " + type_2.toUpperCase() + " ,\n"
                + " " + name_3 + " " + type_3.toUpperCase() + " ,\n"
                + " " + name_4 + " " + type_4.toUpperCase() + " ,\n"
                + " " + name_4 + " " + type_5.toUpperCase() + " \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            System.out.println("table is created");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
