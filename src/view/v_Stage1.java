/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import static sun.audio.AudioPlayer.player;
import model.m_Koordinat;
import model.m_Tembok;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;
import model.m_Pertanyaan;
import model.m_Player;

/**
 *
 * @author Habibullah
 */
public class v_Stage1 extends javax.swing.JFrame {
    //movement booleans
    private boolean right = false, left = false, jumping = false, falling = false;
    private boolean topCollision = false;
    
    //bounds
    private double x,y;
    private int width, height;
    
    //move speed
    private double moveSpeed = 2.5;
    
    //jump speed
    private double jumpSpeed = 20;
    private double currentJumpSpeed = jumpSpeed;
    
    //fall speed
    private double maxFallSpeed = 5;
    private double currentFallSpeed = 0.1;
    
    private int FPS = 60;
    
    int a, b;
    m_Player pl;
    m_Tembok flag;
    m_Tembok p;
    m_Pertanyaan tanya;
    Random acaklah = new Random();
    
    public v_Stage1() {
        initComponents();
        pemain.requestFocus();
//        bendera.setVisible(false);
//        bendera1.setVisible(false);
//        bendera2.setVisible(false);
//        bendera3.setVisible(false);
//        bendera4.setVisible(false);
        
        tanya = new m_Pertanyaan();

//        int randomNum = ThreadLocalRandom.current().nextInt(0, 4 + 1);
//        switch (randomNum) {
//            case 0:
//                bendera.setVisible(true);
//                flag = new m_Tembok(bendera.getWidth(), bendera.getHeight(), (int) bendera.getLocation().getX(), (int) bendera.getLocation().getY(), 0);
//                break;
//            case 1:
//                bendera1.setVisible(true);
//                flag = new m_Tembok(bendera1.getWidth(), bendera1.getHeight(), (int) bendera1.getLocation().getX(), (int) bendera1.getLocation().getY(), 1);
//                break;
//            case 2:
//                bendera2.setVisible(true);
//                flag = new m_Tembok(bendera2.getWidth(), bendera2.getHeight(), (int) bendera2.getLocation().getX(), (int) bendera2.getLocation().getY(), 2);
//                break;
//            case 3:
//                bendera3.setVisible(true);
//                flag = new m_Tembok(bendera3.getWidth(), bendera3.getHeight(), (int) bendera3.getLocation().getX(), (int) bendera3.getLocation().getY(), 3);
//                break;
//            case 4:
//                bendera4.setVisible(true);
//                flag = new m_Tembok(bendera4.getWidth(), bendera4.getHeight(), (int) bendera4.getLocation().getX(), (int) bendera4.getLocation().getY(), 4);
//                break;
//        }
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pemain = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        object = new javax.swing.JLabel();
        object1 = new javax.swing.JLabel();
        object2 = new javax.swing.JLabel();
        object3 = new javax.swing.JLabel();
        gbr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pemain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/karakter2.png"))); // NOI18N
        pemain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pemainKeyPressed(evt);
            }
        });
        getContentPane().add(pemain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.menu1.png"))); // NOI18N
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
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(object, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 574, 50));
        getContentPane().add(object1, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 550, 299, 50));
        getContentPane().add(object2, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 498, 50, 30));
        getContentPane().add(object3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 500, 50, 50));

        gbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stage1.2.png"))); // NOI18N
        getContentPane().add(gbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void pemainKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pemainKeyPressed
        
        p = new m_Tembok(pemain.getWidth(), pemain.getHeight(), (int) pemain.getLocation().getX(), (int) pemain.getLocation().getY());
        boolean nabrak = false;
        m_Tembok t[] = new m_Tembok[34];

        t[0] = new m_Tembok(object.getWidth(), object.getHeight(), (int) object.getLocation().getX(), (int) object.getLocation().getY());
        t[1] = new m_Tembok(object1.getWidth(), object1.getHeight(), (int) object1.getLocation().getX(), (int) object1.getLocation().getY());
        t[2] = new m_Tembok(object2.getWidth(), object2.getHeight(), (int) object2.getLocation().getX(), (int) object2.getLocation().getY());
        t[3] = new m_Tembok(object3.getWidth(), object3.getHeight(), (int) object3.getLocation().getX(), (int) object3.getLocation().getY());
        
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
//            for (int a = 0; a < t.length; a++) {
//                if (t[a].tabrakKiri(p)) {
//                    nabrak = true;
//                }
//            }
            if (nabrak == false) {
                int i = p.getX();
                p.setX(i -= moveSpeed);
                
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
//            for (int a = 0; a < t.length; a++) {
//                if (t[a].tabrakKanan(p)) {
//                    nabrak = true;
//                }
//            }
            if (nabrak == false) {
                int i = p.getX();
                p.setX(i += moveSpeed);
                
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
//            for (int a = 0; a < t.length; a++) {
//                if (t[a].tabrakAtas(p)) {
//                    nabrak = true;
//                }
//            }

            if (nabrak == false) {
                int i = p.getY();
                p.setY(i - 25);
//                currentJumpSpeed -= .1;
//                falling=true;
//                if (currentJumpSpeed <= 0) {
//                    currentJumpSpeed = jumpSpeed;
//                    jumping = false;
//                    falling = true;
//                    System.out.println(falling);
//                }

                if(p.getY() == i-25){
                    falling = true;
                }
                
                if (falling) {
                    for (int j = 0; j < 5; j++) {
                        p.setY(p.getY() + (j+1));
                    }
                    falling=false;
                }
            }

        } 
//        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
////            for (int a = 0; a < t.length; a++) {
////                if (t[a].tabrakBawah(p)) {
////                    nabrak = true;
////                }
////            }
//            if (nabrak == false) {
//                int i = p.getY();
//                p.setY(i += 3);
//                
//            }
//        }
        pemain.setLocation(p.getX(), p.getY());
    }//GEN-LAST:event_pemainKeyPressed
    
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        v_Menu mn = new v_Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed
    
//    public void init() {
//        pl = new m_Player(30, 30);
//    }
//    
//    public void tick() {
//        pl.tick();
//    }
//    
//    public void draw(Graphics g) {
//        pl.draw(g);
//    }
//    
//    public void keyPressed(int k) {
//        pl.keyPressed(k);
//    }
//
//    public void keyReleased(int k) {
//        pl.keyReleased(k);
//    }
    
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JLabel gbr;
    private javax.swing.JButton menu;
    private javax.swing.JLabel object;
    private javax.swing.JLabel object1;
    private javax.swing.JLabel object2;
    private javax.swing.JLabel object3;
    private javax.swing.JLabel pemain;
    // End of variables declaration//GEN-END:variables
}
