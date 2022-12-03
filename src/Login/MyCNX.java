package Login;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyCNX {
    // get database
    private String servername = "localhost";
    private String username = "";
    private String dbname = "";
    private Integer portnumber = 3306;
    private String password = "";
    
    public static Connection getConnection(){
        Connection cnx = null;
        MysqlDataSource dataSource = new MysqlDataSource();
        
        dataSource.setServerName(servername);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setDescription(dbname);
        dataSource.setPortNumber(portnumber);
        
        try {
            cnx = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
        return cnx;
    }
}
