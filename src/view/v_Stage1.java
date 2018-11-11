/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import static sun.audio.AudioPlayer.player;
import model.m_Koordinat;
import model.m_Tembok;
/**
 *
 * @author Habibullah
 */
public class v_Stage1 extends javax.swing.JFrame {

    int Px, Py, a, b;
    
    public v_Stage1() {
        initComponents();
        pemain.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JButton();
        pemain = new javax.swing.JLabel();
        bendera10 = new javax.swing.JLabel();
        lahan = new javax.swing.JLabel();
        lahan1 = new javax.swing.JLabel();
        lahan2 = new javax.swing.JLabel();
        lahan3 = new javax.swing.JLabel();
        lahan4 = new javax.swing.JLabel();
        lahan5 = new javax.swing.JLabel();
        lahan6 = new javax.swing.JLabel();
        lahan7 = new javax.swing.JLabel();
        lahan8 = new javax.swing.JLabel();
        lahan9 = new javax.swing.JLabel();
        lahan10 = new javax.swing.JLabel();
        lahan11 = new javax.swing.JLabel();
        lahan12 = new javax.swing.JLabel();
        lahan13 = new javax.swing.JLabel();
        lahan14 = new javax.swing.JLabel();
        lahan15 = new javax.swing.JLabel();
        lahan16 = new javax.swing.JLabel();
        lahan17 = new javax.swing.JLabel();
        lahan18 = new javax.swing.JLabel();
        lahan19 = new javax.swing.JLabel();
        lahan20 = new javax.swing.JLabel();
        lahan21 = new javax.swing.JLabel();
        lahan22 = new javax.swing.JLabel();
        lahan23 = new javax.swing.JLabel();
        lahan24 = new javax.swing.JLabel();
        lahan25 = new javax.swing.JLabel();
        lahan26 = new javax.swing.JLabel();
        lahan27 = new javax.swing.JLabel();
        lahan28 = new javax.swing.JLabel();
        lahan29 = new javax.swing.JLabel();
        lahan30 = new javax.swing.JLabel();
        lahan31 = new javax.swing.JLabel();
        lahan32 = new javax.swing.JLabel();
        lahan33 = new javax.swing.JLabel();
        yamato = new javax.swing.JLabel();
        gbr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.menu.png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setFocusPainted(false);
        menu.setVerifyInputWhenFocusTarget(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 72, 50));

        pemain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/karakter1.png"))); // NOI18N
        pemain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pemainKeyPressed(evt);
            }
        });
        getContentPane().add(pemain, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 565, 25, 30));

        bendera10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bendera1.png"))); // NOI18N
        getContentPane().add(bendera10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 257, -1, -1));
        getContentPane().add(lahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 295, 115, 305));
        getContentPane().add(lahan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 295, 155, 155));
        getContentPane().add(lahan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 115, 255));
        getContentPane().add(lahan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 255, 105));
        getContentPane().add(lahan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 254, 55, 100));
        getContentPane().add(lahan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 55, 105));
        getContentPane().add(lahan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 300, 50));
        getContentPane().add(lahan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 48, 258, 60));
        getContentPane().add(lahan8, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 52, 410, 56));
        getContentPane().add(lahan9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 208, 56));
        getContentPane().add(lahan10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 58, 56));
        getContentPane().add(lahan11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 246, 56, 106));
        getContentPane().add(lahan12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 395, 58, 56));
        getContentPane().add(lahan13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 248, 56, 202));
        getContentPane().add(lahan14, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 395, 100, 56));
        getContentPane().add(lahan15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 295, 208, 58));
        getContentPane().add(lahan16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 394, 208, 56));
        getContentPane().add(lahan17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 107, 50));
        getContentPane().add(lahan18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 491, 407, 56));
        getContentPane().add(lahan19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 546, 236, 50));
        getContentPane().add(lahan20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 491, 58, 95));
        getContentPane().add(lahan21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 491, 156, 56));
        getContentPane().add(lahan22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 96, 50));
        getContentPane().add(lahan23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 248, 56, 202));
        getContentPane().add(lahan24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 492, 118, 110));
        getContentPane().add(lahan25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 118, 56));
        getContentPane().add(lahan26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 118, 108));
        getContentPane().add(lahan27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 357, 56, 140));
        getContentPane().add(lahan28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 55, 40));
        getContentPane().add(lahan29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 18, 150));
        getContentPane().add(lahan30, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 588, 270, 10));
        getContentPane().add(lahan31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 500, 10));
        getContentPane().add(lahan32, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 588, 160, 10));
        getContentPane().add(lahan33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 247, 200, 8));

        yamato.setText("Hotel Yamato");
        getContentPane().add(yamato, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 168, -1, -1));

        gbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stage1.1.png"))); // NOI18N
        getContentPane().add(gbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        v_Menu mn = new v_Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void pemainKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pemainKeyPressed
        
//        int Px = (int) pemain.getLocation().getX();
//        int Py = (int) pemain.getLocation().getY();
        m_Tembok p = new m_Tembok(pemain.getWidth(),pemain.getHeight(),(int) pemain.getLocation().getX(),(int) pemain.getLocation().getY());
        this.Px = Px;
        this.Py = Py;
        boolean nabrak = false;
//        int Wx[] = new int[34];
//        int Wy[] = new int[34];
        m_Tembok t[] = new m_Tembok[34];
        
        t[0] = new m_Tembok(lahan.getWidth(),lahan.getHeight(),(int) lahan.getLocation().getX(),(int) lahan.getLocation().getY());
        t[1] = new m_Tembok(lahan1.getWidth(),lahan1.getHeight(),(int) lahan1.getLocation().getX(),(int) lahan1.getLocation().getY());
        t[2] = new m_Tembok(lahan2.getWidth(),lahan2.getHeight(),(int) lahan2.getLocation().getX(),(int) lahan2.getLocation().getY());
        t[3] = new m_Tembok(lahan3.getWidth(),lahan3.getHeight(),(int) lahan3.getLocation().getX(),(int) lahan3.getLocation().getY());
        t[4] = new m_Tembok(lahan4.getWidth(),lahan4.getHeight(),(int) lahan4.getLocation().getX(),(int) lahan4.getLocation().getY());
        t[5] = new m_Tembok(lahan5.getWidth(),lahan5.getHeight(),(int) lahan5.getLocation().getX(),(int) lahan5.getLocation().getY());
        t[6] = new m_Tembok(lahan6.getWidth(),lahan6.getHeight(),(int) lahan6.getLocation().getX(),(int) lahan6.getLocation().getY());
        t[7] = new m_Tembok(lahan7.getWidth(),lahan7.getHeight(),(int) lahan7.getLocation().getX(),(int) lahan7.getLocation().getY());
        t[8] = new m_Tembok(lahan8.getWidth(),lahan8.getHeight(),(int) lahan8.getLocation().getX(),(int) lahan8.getLocation().getY());
        t[9] = new m_Tembok(lahan9.getWidth(),lahan9.getHeight(),(int) lahan9.getLocation().getX(),(int) lahan9.getLocation().getY());
        t[10] = new m_Tembok(lahan10.getWidth(),lahan10.getHeight(),(int) lahan10.getLocation().getX(),(int) lahan10.getLocation().getY());
        t[11] = new m_Tembok(lahan11.getWidth(),lahan11.getHeight(),(int) lahan11.getLocation().getX(),(int) lahan11.getLocation().getY());
        t[12] = new m_Tembok(lahan12.getWidth(),lahan12.getHeight(),(int) lahan12.getLocation().getX(),(int) lahan12.getLocation().getY());
        t[13] = new m_Tembok(lahan13.getWidth(),lahan13.getHeight(),(int) lahan13.getLocation().getX(),(int) lahan13.getLocation().getY());
        t[14] = new m_Tembok(lahan14.getWidth(),lahan14.getHeight(),(int) lahan14.getLocation().getX(),(int) lahan14.getLocation().getY());
        t[15] = new m_Tembok(lahan15.getWidth(),lahan15.getHeight(),(int) lahan15.getLocation().getX(),(int) lahan15.getLocation().getY());
        t[16] = new m_Tembok(lahan16.getWidth(),lahan16.getHeight(),(int) lahan16.getLocation().getX(),(int) lahan16.getLocation().getY());
        t[17] = new m_Tembok(lahan17.getWidth(),lahan17.getHeight(),(int) lahan17.getLocation().getX(),(int) lahan17.getLocation().getY());
        t[18] = new m_Tembok(lahan18.getWidth(),lahan18.getHeight(),(int) lahan18.getLocation().getX(),(int) lahan18.getLocation().getY());
        t[19] = new m_Tembok(lahan19.getWidth(),lahan19.getHeight(),(int) lahan19.getLocation().getX(),(int) lahan19.getLocation().getY());
        t[20] = new m_Tembok(lahan20.getWidth(),lahan20.getHeight(),(int) lahan20.getLocation().getX(),(int) lahan20.getLocation().getY());
        t[21] = new m_Tembok(lahan21.getWidth(),lahan21.getHeight(),(int) lahan21.getLocation().getX(),(int) lahan21.getLocation().getY());
        t[22] = new m_Tembok(lahan22.getWidth(),lahan22.getHeight(),(int) lahan22.getLocation().getX(),(int) lahan22.getLocation().getY());
        t[23] = new m_Tembok(lahan23.getWidth(),lahan23.getHeight(),(int) lahan23.getLocation().getX(),(int) lahan23.getLocation().getY());
        t[24] = new m_Tembok(lahan24.getWidth(),lahan24.getHeight(),(int) lahan24.getLocation().getX(),(int) lahan24.getLocation().getY());
        t[25] = new m_Tembok(lahan25.getWidth(),lahan25.getHeight(),(int) lahan25.getLocation().getX(),(int) lahan25.getLocation().getY());
        t[26] = new m_Tembok(lahan26.getWidth(),lahan26.getHeight(),(int) lahan26.getLocation().getX(),(int) lahan26.getLocation().getY());
        t[27] = new m_Tembok(lahan27.getWidth(),lahan27.getHeight(),(int) lahan27.getLocation().getX(),(int) lahan27.getLocation().getY());
        t[28] = new m_Tembok(lahan28.getWidth(),lahan28.getHeight(),(int) lahan28.getLocation().getX(),(int) lahan28.getLocation().getY());
        t[29] = new m_Tembok(lahan29.getWidth(),lahan29.getHeight(),(int) lahan29.getLocation().getX(),(int) lahan29.getLocation().getY());
        t[30] = new m_Tembok(lahan30.getWidth(),lahan30.getHeight(),(int) lahan30.getLocation().getX(),(int) lahan30.getLocation().getY());
        t[31] = new m_Tembok(lahan31.getWidth(),lahan31.getHeight(),(int) lahan31.getLocation().getX(),(int) lahan31.getLocation().getY());
        t[32] = new m_Tembok(lahan32.getWidth(),lahan32.getHeight(),(int) lahan32.getLocation().getX(),(int) lahan32.getLocation().getY());
        t[33] = new m_Tembok(lahan33.getWidth(),lahan33.getHeight(),(int) lahan33.getLocation().getX(),(int) lahan33.getLocation().getY());
        
//        Wx[0] = (int) lahan.getLocation().getX();
//        Wy[0] = (int) lahan.getLocation().getY();
//
//        Wx[1] = (int) lahan1.getLocation().getX();
//        Wy[1] = (int) lahan1.getLocation().getY();
//
//        Wx[2] = (int) lahan2.getLocation().getX();
//        Wy[2] = (int) lahan2.getLocation().getY();
//
//        Wx[3] = (int) lahan3.getLocation().getX();
//        Wy[3] = (int) lahan3.getLocation().getY();
//
//        Wx[4] = (int) lahan4.getLocation().getX();
//        Wy[4] = (int) lahan4.getLocation().getY();
//
//        Wx[5] = (int) lahan5.getLocation().getX();
//        Wy[5] = (int) lahan5.getLocation().getY();
//
//        Wx[6] = (int) lahan6.getLocation().getX();
//        Wy[6] = (int) lahan6.getLocation().getY();
//
//        Wx[7] = (int) lahan7.getLocation().getX();
//        Wy[7] = (int) lahan7.getLocation().getY();
//
//        Wx[8] = (int) lahan8.getLocation().getX();
//        Wy[8] = (int) lahan8.getLocation().getY();
//        
//        Wx[9] = (int) lahan9.getLocation().getX();
//        Wy[9] = (int) lahan9.getLocation().getY();
//        
//        Wx[10] = (int) lahan10.getLocation().getX();
//        Wy[10] = (int) lahan10.getLocation().getY();
//
//        Wx[11] = (int) lahan11.getLocation().getX();
//        Wy[11] = (int) lahan11.getLocation().getY();
//
//        Wx[12] = (int) lahan12.getLocation().getX();
//        Wy[12] = (int) lahan12.getLocation().getY();
//
//        Wx[13] = (int) lahan13.getLocation().getX();
//        Wy[13] = (int) lahan13.getLocation().getY();
//
//        Wx[14] = (int) lahan14.getLocation().getX();
//        Wy[14] = (int) lahan14.getLocation().getY();
//
//        Wx[15] = (int) lahan15.getLocation().getX();
//        Wy[15] = (int) lahan15.getLocation().getY();
//
//        Wx[16] = (int) lahan16.getLocation().getX();
//        Wy[16] = (int) lahan16.getLocation().getY();
//
//        Wx[17] = (int) lahan17.getLocation().getX();
//        Wy[17] = (int) lahan17.getLocation().getY();
//
//        Wx[18] = (int) lahan18.getLocation().getX();
//        Wy[18] = (int) lahan18.getLocation().getY();
//        
//        Wx[19] = (int) lahan19.getLocation().getX();
//        Wy[19] = (int) lahan19.getLocation().getY();
//        
//        Wx[20] = (int) lahan20.getLocation().getX();
//        Wy[20] = (int) lahan20.getLocation().getY();
//
//        Wx[21] = (int) lahan21.getLocation().getX();
//        Wy[21] = (int) lahan21.getLocation().getY();
//
//        Wx[22] = (int) lahan22.getLocation().getX();
//        Wy[22] = (int) lahan22.getLocation().getY();
//
//        Wx[23] = (int) lahan23.getLocation().getX();
//        Wy[23] = (int) lahan23.getLocation().getY();
//
//        Wx[24] = (int) lahan24.getLocation().getX();
//        Wy[24] = (int) lahan24.getLocation().getY();
//        Wx[24] = (int) lahan24.getWidth();
//
//        Wx[25] = (int) lahan25.getLocation().getX();
//        Wy[25] = (int) lahan25.getLocation().getY();
//
//        Wx[26] = (int) lahan26.getLocation().getX();
//        Wy[26] = (int) lahan26.getLocation().getY();
//
//        Wx[27] = (int) lahan27.getLocation().getX();
//        Wy[27] = (int) lahan27.getLocation().getY();
//
//        Wx[28] = (int) lahan28.getLocation().getX();
//        Wy[28] = (int) lahan28.getLocation().getY();
//        
//        Wx[29] = (int) lahan29.getLocation().getX();
//        Wy[29] = (int) lahan29.getLocation().getY();
//        
//        Wx[30] = (int) lahan30.getLocation().getX();
//        Wy[30] = (int) lahan30.getLocation().getY();
//
//        Wx[31] = (int) lahan31.getLocation().getX();
//        Wy[31] = (int) lahan31.getLocation().getY();
//        
//        Wx[32] = (int) lahan32.getLocation().getX();
//        Wy[32] = (int) lahan32.getLocation().getY();
//
//        Wx[33] = (int) lahan33.getLocation().getX();
//        Wy[33] = (int) lahan33.getLocation().getY();
        
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            for (int a = 0; a < t.length; a++) {
                if (t[a].tabrakKiri(p)) {
                    nabrak = true;
                }
            }
            if (nabrak == false) {
                int i = p.getX();
                p.setX(i -= 2); 
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            for (int a = 0; a < t.length; a++) {
                if (t[a].tabrakKanan(p)) {
                    nabrak = true;
                }
            }
            if (nabrak == false) {
                int i = p.getX();
                p.setX(i += 2); 
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            for (int a = 0; a < t.length; a++) {
                if (t[a].tabrakAtas(p)) {
                    nabrak = true;
                }
            }

            if (nabrak == false) {
                int i = p.getY();
                p.setY(i -= 2);
            }

        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            for (int a = 0; a < t.length; a++) {
                if (t[a].tabrakBawah(p)) {
                    nabrak = true;
                }
            }
            if (nabrak == false) {
                int i = p.getY();
                p.setY(i += 2);
            }
        }
        pemain.setLocation(p.getX(), p.getY());
    }//GEN-LAST:event_pemainKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(v_Stage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_Stage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_Stage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_Stage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_Stage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bendera10;
    private javax.swing.JLabel gbr;
    private javax.swing.JLabel lahan;
    private javax.swing.JLabel lahan1;
    private javax.swing.JLabel lahan10;
    private javax.swing.JLabel lahan11;
    private javax.swing.JLabel lahan12;
    private javax.swing.JLabel lahan13;
    private javax.swing.JLabel lahan14;
    private javax.swing.JLabel lahan15;
    private javax.swing.JLabel lahan16;
    private javax.swing.JLabel lahan17;
    private javax.swing.JLabel lahan18;
    private javax.swing.JLabel lahan19;
    private javax.swing.JLabel lahan2;
    private javax.swing.JLabel lahan20;
    private javax.swing.JLabel lahan21;
    private javax.swing.JLabel lahan22;
    private javax.swing.JLabel lahan23;
    private javax.swing.JLabel lahan24;
    private javax.swing.JLabel lahan25;
    private javax.swing.JLabel lahan26;
    private javax.swing.JLabel lahan27;
    private javax.swing.JLabel lahan28;
    private javax.swing.JLabel lahan29;
    private javax.swing.JLabel lahan3;
    private javax.swing.JLabel lahan30;
    private javax.swing.JLabel lahan31;
    private javax.swing.JLabel lahan32;
    private javax.swing.JLabel lahan33;
    private javax.swing.JLabel lahan4;
    private javax.swing.JLabel lahan5;
    private javax.swing.JLabel lahan6;
    private javax.swing.JLabel lahan7;
    private javax.swing.JLabel lahan8;
    private javax.swing.JLabel lahan9;
    private javax.swing.JButton menu;
    private javax.swing.JLabel pemain;
    private javax.swing.JLabel yamato;
    // End of variables declaration//GEN-END:variables
}
