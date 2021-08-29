/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.SQLException;

/**
 *
 * @author Hidden Treasure
 */
public class DataBaseHelper {
    
    public DataBaseHelper(String username, String password) throws SQLException {
        myInit(username, password);
    }
    
    public boolean login(String username, String password) throws SQLException {
        if(username != null && password != null) {
             myInit(username, password);
             return true;
        }           
        return false;
    }
    
    public static void myInit(String username, String password) throws SQLException {
      OracleConnector.setUpConnection("fei-sql1.upceucebny.cz", 1521, "IDAS", username, password);
     
    }
   
}
