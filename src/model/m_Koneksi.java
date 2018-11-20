/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;
import model.m_Konfigurasi;

/**
 *
 * @author Adifia
 */
public class m_Koneksi implements m_Konfigurasi {  //koneksi antara java dengan database
    
    public m_Koneksi(){
    }
    
    private static Connection konekdb;   //konekdb sebagai variable untuk mengkoneksikan db dengan koding
    public Connection getKoneksi() throws SQLException{
        if (konekdb == null){
            try {  //koneksi berhasil
                String DB = "jdbc:mysql://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME; //
                String user = DB_USERNAME; //user database
                String pass = DB_PASSWORD; 
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konekdb = DriverManager.getConnection(DB,user,pass);
            } catch (Exception e) {  //database tidak terhubung 
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        }
    
        return konekdb;
    }
    
}
