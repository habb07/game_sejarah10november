/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Habibullah
 */
public class v_Mulai extends javax.swing.JFrame {

    /**
     * Creates new form v_Mulai
     */
    public v_Mulai() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbr = new javax.swing.JLabel();
        lanjut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prolog1.1.png"))); // NOI18N
        getContentPane().add(gbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/b.lanjut.png"))); // NOI18N
        lanjut.setBorder(null);
        lanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanjutActionPerformed(evt);
            }
        });
        getContentPane().add(lanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 560, 90, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanjutActionPerformed
        v_Mulai2 m2 = new v_Mulai2();
        m2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lanjutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        v_Mulai m = new v_Mulai();
//        v_Mulai2 m2 = new v_Mulai2();        
//        try {
//            for (int i = 0; i <= 100; i++) {
//                Thread.sleep(50);
//                if(i==100){
//                    m.setVisible(false);
//                    m2.setVisible(true);
//                }
//            }
//            } catch (InterruptedException e) {  
//            }
        
        
        
        
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
            java.util.logging.Logger.getLogger(v_Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_Mulai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gbr;
    private javax.swing.JButton lanjut;
    // End of variables declaration//GEN-END:variables
}
