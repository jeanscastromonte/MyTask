/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Persintence;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import L_Persintence.SQL.SQL_Connection;
/**
 *
 * @author jean
 */
public class P_Connection {
    
   private Connection conection = null;
 
    public Connection getConnection() {
        if (conection == null) {
            try {
                Driver driver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);
                conection = DriverManager.getConnection(SQL_Connection.SERVER+SQL_Connection.DATABASE,SQL_Connection.DB_USER,SQL_Connection.DB_PASSWORD);
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(P_Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conection;
    }
}
