package Login;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyCNX {
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
            //Logger.getLogger("Get Connection -> " + MyCNX.class.getName()).Log(Level.SEVERE,null, e);
        }
        return cnx;
    }
}
