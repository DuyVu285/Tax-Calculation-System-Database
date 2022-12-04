package Login;

import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class MyCNX {

    private static String url = "jdbc:sqlserver://LAPTOP-473DJ6NK\\SQLEXPRESS;"
            + "databaseName=taxcal;"
            + "integratedSecurity=true;"
            + "encrypt=true;"
            + "trustServerCertificate=true";
    private static String username = "duyvu285";
    private static String password = "123456";
    private Connection conn = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
