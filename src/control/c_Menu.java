/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_Menu;
import view.v_Loading;
import view.v_Mulai;
import view.v_Nilai;
import view.v_Bantuan;
import view.v_Tentang;
/**
 *
 * @author Habibullah
 */
public class c_Menu {
    v_Menu mn;
    v_Loading l;
    v_Mulai m;
    v_Nilai n;
    v_Bantuan b;
    v_Tentang t;
    public c_Menu(){
        mn = new v_Menu();
        l = new v_Loading();
        m = new v_Mulai();
        n = new v_Nilai();
        b = new v_Bantuan();
        t = new v_Tentang();
        
        mn.setVisible(true);
        
        mn.getMulai().addActionListener(new mulai());
        mn.getNilai().addActionListener(new nilai());
        mn.getBantuan().addActionListener(new bantuan());
        mn.getTentang().addActionListener(new tentang());
//        mn.getKeluar().addActionListener(new keluar());
    }
    private class mulai implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            m.dispose();
        }
    }
    private class nilai implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            n.dispose();
        }
    }
    private class bantuan implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            b.dispose();
        }
    }
    private class tentang implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            t.setVisible(true);
            mn.dispose();
        }
        
    }
}

