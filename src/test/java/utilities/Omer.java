package utilities;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Omer {
    public Omer() {
    }

public  static void swicthYazdir(String path, String sheet,String switchData,String caseData,int k){
        ExcelUtil excelUtil = new ExcelUtil(path,sheet);
    switch (switchData) {
        case "10g":
            excelUtil.setCellData(caseData, k, 1);
            break;
        case "25g":
        case "25 g (Pack of 1)":
            excelUtil.setCellData(caseData, k, 2);
            break;
        case "50g":
            excelUtil.setCellData(caseData, k, 3);
            break;
        case "75g":
            excelUtil.setCellData(caseData, k, 4);
            break;
        case "100g":
            excelUtil.setCellData(caseData, k, 5);
            break;
        case "250 g (Pack of 1)":
        case "250g":
            excelUtil.setCellData(caseData, k, 6);
            break;
        case "500 g (Pack of 1)":
        case "500g":
            excelUtil.setCellData(caseData, k, 7);
            break;
        case "1 kg (Pack of 1)":
        case "1kg":
            excelUtil.setCellData(caseData, k, 8);
            break;
        case "2kg":
            excelUtil.setCellData(caseData, k, 9);
            break;
        case "3kg":
            excelUtil.setCellData(caseData, k, 10);
            break;
        case "5kg":
            excelUtil.setCellData(caseData, k, 11);
            break;
        case "6kg":
            excelUtil.setCellData(caseData, k, 12);
            break;
        case "8kg":
            excelUtil.setCellData(caseData, k, 13);
            break;
        case "10kg":
            excelUtil.setCellData(caseData, k, 14);
            break;
        case "12.50kg":
            excelUtil.setCellData(caseData, k, 15);
            break;
        case "25kg":
            excelUtil.setCellData(caseData, k, 16);
            break;


    }

}
    public static String yaziDuzenle(String string) {
        int parantezYeri = string.indexOf('(') - 1;
        List<Integer> list = new ArrayList<Integer>();
        if (string.contains("/")) {
            String stringSlashsiz = string.replaceFirst("/", "");
            if (stringSlashsiz.contains("(")) {
                for (int i = 0; i < string.length(); i++) {
                    if (string.charAt(i) == '(') {
                        list.add(i);
                    }
                }
                if (list.size() > 1) {
                    int ikincichar = list.get(1);
                    String parantezOlmadan = stringSlashsiz.substring(0, ikincichar);
                    String trekalkti = parantezOlmadan.replace("- ", "");
                    String degisimOldu = trekalkti.replace(" ", "-");
                    String readyToGo = degisimOldu + "-Free-Delivery-Epsom-Halal-Organic";
                    return readyToGo;
                } else {
                    String parantezOlmadan = stringSlashsiz.substring(0, parantezYeri);
                    String trekalkti = parantezOlmadan.replace("- ", "");
                    String degisimOldu = trekalkti.replace(" ", "-");
                    String readyToGo = degisimOldu + "-Free-Delivery-Epsom-Halal-Organic";
                    return readyToGo;
                }
            }
        }
        if (!string.contains("/") && string.contains("(")) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '(') {
                    list.add(i);
                }
            }
            if (list.size() > 1) {
                int ikincichar = list.get(1);
                String parantezOlmadan = string.substring(0, ikincichar);
                String trekalkti = parantezOlmadan.replace("- ", "");
                String degisimOldu = trekalkti.replace(" ", "-");
                String readyToGo = degisimOldu + "-Free-Delivery-Epsom-Halal-Organic";
                return readyToGo;
            } else {
                String parantezOlmadan = string.substring(0, parantezYeri);
                String trekalkti = parantezOlmadan.replace("- ", "");
                String degisimOldu = trekalkti.replace(" ", "-");
                String readyToGo = degisimOldu + "-Free-Delivery-Epsom-Halal-Organic";
                return readyToGo;
            }
        } else {
            String trekalkti = string.replace("- ", "");
            String degisimOldu = trekalkti.replace(" ", "-");
            String readyToGo = degisimOldu + "-Free-Delivery-Epsom-Halal-Organic";
            return readyToGo;

        }
    }


    public static void saveAsPicture(String fileName, int x, int y) {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Driver.wait(1);
        assert robot != null;
        robot.mouseMove(x, y);
//sag tikladi
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(1000);
//iki defa asagi indi
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //benim ornekte save as ikinci siradaydi oraya enter dedi
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //urunun adini buraya yapistirdi ust tarafda kopyalamstik
        setClipboardData(fileName);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
    public static void Database_write(int ProductId, String Company, String Name, String Amount, String Price, LocalDate Date){
        String jdbcUrl = "jdbc:sqlite://C:/SQLiteStudio/organico.db";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("SQLITE DB connected");
            String data1= "INSERT INTO products VALUES ('"+ProductId+"','"+Company+"','"+Name +"','"+Amount+"','"+Price+"','"+Date+"')";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(data1);
            System.out.println("Data eklendi");
//            while (result.next()) {
//                String name = result.getString("ProductId");
//                String email = result.getString("ProductName");
//                String email2 = result.getString("Price");
//                // String email = result.getString("email");
//                System.out.println(name + " | " + email + " | " + email2);
//            }


        } catch (Exception e) {
            System.out.println(e);

        }
    }


}
