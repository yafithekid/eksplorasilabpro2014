/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.db;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yafithekid
 */
public class DBConnector {
    public static java.sql.Connection con;
    public static void initConnection() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        DBConnector.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/labpro_bioskop", "root", "akuganteng");
    }
}
