/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import model.m_Tembok;

/**
 *
 * @author Habibullah
 */
public class v_Pertanyaan extends javax.swing.JFrame {

    m_Tembok pemain;
    
    public v_Pertanyaan(m_Tembok p) {
        initComponents();
        this.pemain = p;
        soal1.setBorder(null);
    }

    public JTextArea getSoal() {
        return soal1;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jawab1 = new javax.swing.JLabel();
        jawab2 = new javax.swing.JLabel();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        soal = new javax.swing.JScrollPane();
        soal1 = new javax.swing.JTextArea();
        gbr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jawab1.setText("Jawab");
        getContentPane().add(jawab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jawab2.setText("Jawab");
        getContentPane().add(jawab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.pt.png"))); // NOI18N
        j1.setBorder(null);
        j1.setBorderPainted(false);
        j1.setContentAreaFilled(false);
        j1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        j1.setDisabledIcon(null);
        j1.setDisabledSelectedIcon(null);
        j1.setFocusPainted(false);
        j1.setVerifyInputWhenFocusTarget(false);
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 298, 175, 40));

        j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.pt.png"))); // NOI18N
        j2.setBorder(null);
        j2.setBorderPainted(false);
        j2.setContentAreaFilled(false);
        j2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        j2.setDisabledIcon(null);
        j2.setDisabledSelectedIcon(null);
        j2.setFocusPainted(false);
        j2.setVerifyInputWhenFocusTarget(false);
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 298, 175, 40));

        soal1.setEditable(false);
        soal1.setColumns(20);
        soal1.setRows(5);
        soal1.setText("Soal");
        soal1.setBorder(null);
        soal1.setCaretColor(new java.awt.Color(255, 255, 255));
        soal1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        soal1.setFocusCycleRoot(true);
        soal1.setFocusTraversalPolicy(null);
        soal.setViewportView(soal1);

        getContentPane().add(soal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 350, -1));

        gbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pertanyaan1.png"))); // NOI18N
        getContentPane().add(gbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        v_Stage s = new v_Stage(pemain);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2ActionPerformed

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
            java.util.logging.Logger.getLogger(v_Pertanyaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_Pertanyaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_Pertanyaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_Pertanyaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new v_Pertanyaan(m_Tembok p).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gbr;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JLabel jawab1;
    private javax.swing.JLabel jawab2;
    private javax.swing.JScrollPane soal;
    private javax.swing.JTextArea soal1;
    // End of variables declaration//GEN-END:variables
}
