import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database_calismalari {
    //    @Test
//    public void test1(){
//        String jdbcUrl = "jdbc:sqlite://C:/SQLiteStudio/organico.db";
//
////            Connection connection = DriverManager.getConnection(jdbcUrl);
////            System.out.println("SQLITE DB connected");
////            String data1= "INSERT INTO products VALUES ('"+ProductId+"','"+Company+"','"+Name +"','"+Amount+"','"+Price+"','"+Date+"')";
////            Statement statement = connection.createStatement();
////            ResultSet result = statement.executeQuery(data1);
////            System.out.println("Data eklendi");
////    }
////}


    @Test
    public void test02() {
        database_method.createNewDatabase("database_4.db");
    }

    @Test
    public void test03() {
        String path = "src/test/databases/database_1.db";
        //database_method.createNewTable(path, "table1", "id", "integer", "name", "String");
        //database_method.createNewTable(path, "table2", "id", "integer", "name", "String");
        database_method.createNewTable(
                path, "table4",
                "id", "integer",
                "url", "String",
                "ProductName", "String",
                "price", "Integer"
        );
    }

    @Test
    public void test04() {
        String path = "src/test/databases/database_1.db";
        SelectApp selectApp = new SelectApp();
        selectApp.selectAll(path, "table4");
        System.out.println("*********************");
//        selectApp.insert2(path,"table4", 4, "sss", "uzum", 5);
//        selectApp.selectAll(path, "table4");
        selectApp.insert(path,"table4",  "ss5s", "u5zum", 5);
        System.out.println("//////////////////");
        selectApp.selectAll(path, "table4");
    }

}