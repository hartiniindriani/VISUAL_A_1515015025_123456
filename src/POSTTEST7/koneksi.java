/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST7;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection con;
    public static Connection getConnection (){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratikumvisual","root","");
             JOptionPane.showMessageDialog(null, "KONEKSI BERHASIL");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "KONEKSI GAGAL" +e.getMessage());
        }
       return con;
    }
    
}
