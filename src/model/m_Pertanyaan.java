/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Habibullah
 */
public class m_Pertanyaan {
    m_Koneksi konek = new m_Koneksi();
    
    public String getPertanyaan(int id){
        String query="SELECT pertanyaan FROM pertanyaan where id=? ";
        String pertanyaan = "";
        try {
            PreparedStatement statement = konek.getKoneksi().prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            rs.next();
            pertanyaan = rs.getString(1);
           
            statement.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(m_Pertanyaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pertanyaan;
    }
    
    public ArrayList<Integer> getId(){
        ArrayList<Integer> idPertanyaan = new ArrayList<>();
        String query="SELECT id FROM pertanyaan";
        try {
            PreparedStatement statement = konek.getKoneksi().prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                idPertanyaan.add(rs.getInt(1));
            }
        }catch (SQLException ex) {
            Logger.getLogger(m_Pertanyaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPertanyaan;
    }
}
