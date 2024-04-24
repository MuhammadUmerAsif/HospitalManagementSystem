/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Umar Asif
 */
public class connect {
      private static Connection koneksi;
    public static Connection getkoneksi() {
        if (koneksi==null) {  
            
          try {
           String url = new String();
           String user = new String();
           String password = new String();
           url ="jdbc:mysql://localhost:3306/hms";
           user = "root";
           password = "";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           koneksi = DriverManager.getConnection(url,user,password);
           JOptionPane.showMessageDialog(null,"Connection Successfuly");
                }
          catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Connection Failed" +e);
                }       
        }
        return koneksi;
    }

    static com.mysql.jdbc.Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}