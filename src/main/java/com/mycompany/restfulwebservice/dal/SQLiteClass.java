package com.mycompany.restfulwebservice.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mevsim
 */
public class SQLiteClass {
    private static Connection conn;
    private static boolean hasdata = false;
    /*
    public ResultSet displayHomes() throws SQLException{
        if(conn == null){
            //getConnection();
        }
        
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery("SELECT evIl, evFiyat from tblEV");
        
    }*/
}
