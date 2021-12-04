/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_SistemaInterno;

/**
 *
 * @author jessi
 */
public class UI_ModalDocumentoInvalido extends javax.swing.JDialog {

    /**
     * Creates new form UI_ModalComRestricao
     */
    public UI_ModalDocumentoInvalido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        txtTitulo = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        imgHeader = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JLabel();
        imgBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(891, 301));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(891, 301));
        getContentPane().setLayout(null);

        txtTitulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        txtTitulo.setText("Atenção!");
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(330, 30, 201, 60);

        btnFechar.setBorderPainted(false);
        btnFechar.setContentAreaFilled(false);
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar);
        btnFechar.setBounds(810, 30, 70, 56);

        imgHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HEADER MODAL.png"))); // NOI18N
        getContentPane().add(imgHeader);
        imgHeader.setBounds(0, 0, 890, 116);

        txtMensagem.setFont(new java.awt.Font("sansserif", 0, 40)); // NOI18N
        txtMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMensagem.setText("CPF/CNPJ inválido, digite novamente por favor.");
        getContentPane().add(txtMensagem);
        txtMensagem.setBounds(20, 160, 850, 100);

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG BACKGROUND MODAL.png"))); // NOI18N
        getContentPane().add(imgBackground);
        imgBackground.setBounds(0, 20, 890, 280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(UI_ModalDocumentoInvalido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_ModalDocumentoInvalido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_ModalDocumentoInvalido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_ModalDocumentoInvalido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UI_ModalDocumentoInvalido dialog = new UI_ModalDocumentoInvalido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JLabel imgHeader;
    private javax.swing.JLabel txtMensagem;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
