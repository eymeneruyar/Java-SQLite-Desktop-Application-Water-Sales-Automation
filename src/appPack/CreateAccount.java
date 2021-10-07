package appPack;

import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    public CreateAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1_blue = new javax.swing.JPanel();
        pnl2_white = new javax.swing.JPanel();
        pnl3_border = new javax.swing.JPanel();
        txt_userName = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_rePassword = new javax.swing.JPasswordField();
        lbl_userName = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_confirmPassword = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        btn_createAccount = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnl1_blue.setBackground(new java.awt.Color(41, 170, 227));

        pnl2_white.setBackground(new java.awt.Color(255, 255, 255));

        pnl3_border.setBackground(new java.awt.Color(255, 255, 255));
        pnl3_border.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 170, 221), 4, true));

        lbl_userName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_userName.setForeground(new java.awt.Color(41, 170, 221));
        lbl_userName.setText("Kullanıcı Adı:");

        lbl_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(41, 170, 221));
        lbl_email.setText("E-Mail");

        lbl_confirmPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_confirmPassword.setForeground(new java.awt.Color(41, 170, 221));
        lbl_confirmPassword.setText("Şifre (Tekrar)");

        lbl_password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(41, 170, 221));
        lbl_password.setText("Şifre");

        btn_createAccount.setBackground(new java.awt.Color(255, 255, 255));
        btn_createAccount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_createAccount.setForeground(new java.awt.Color(41, 170, 221));
        btn_createAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/create_icon.png"))); // NOI18N
        btn_createAccount.setText("Kaydol");
        btn_createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createAccountActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(41, 170, 211));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel_icon.png"))); // NOI18N
        btn_cancel.setText("İptal");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 170, 221));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Yeni Hesap");

        javax.swing.GroupLayout pnl3_borderLayout = new javax.swing.GroupLayout(pnl3_border);
        pnl3_border.setLayout(pnl3_borderLayout);
        pnl3_borderLayout.setHorizontalGroup(
            pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_borderLayout.createSequentialGroup()
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl3_borderLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl3_borderLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_userName)
                            .addComponent(lbl_email)
                            .addComponent(lbl_confirmPassword)
                            .addComponent(lbl_password))
                        .addGap(18, 18, 18)
                        .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_rePassword)
                                .addComponent(txt_password)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl3_borderLayout.setVerticalGroup(
            pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_borderLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_userName))
                .addGap(18, 18, 18)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email))
                .addGap(18, 18, 18)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_password))
                .addGap(18, 18, 18)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirmPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_createAccount)
                    .addComponent(btn_cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl2_whiteLayout = new javax.swing.GroupLayout(pnl2_white);
        pnl2_white.setLayout(pnl2_whiteLayout);
        pnl2_whiteLayout.setHorizontalGroup(
            pnl2_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2_whiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl3_border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl2_whiteLayout.setVerticalGroup(
            pnl2_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2_whiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl3_border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl1_blueLayout = new javax.swing.GroupLayout(pnl1_blue);
        pnl1_blue.setLayout(pnl1_blueLayout);
        pnl1_blueLayout.setHorizontalGroup(
            pnl1_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1_blueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl2_white, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl1_blueLayout.setVerticalGroup(
            pnl1_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_blueLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl2_white, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1_blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1_blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createAccountActionPerformed

        String username = txt_userName.getText().trim().toLowerCase();
        String email = txt_email.getText().trim().toLowerCase();
        char[] password = txt_password.getPassword();
        char[] rePassword = txt_rePassword.getPassword();

        String stPassword = String.valueOf(password).trim().toLowerCase();
        String stRePassword = String.valueOf(rePassword).trim().toLowerCase();

        if (username.equals("") || email.equals("") || stPassword.equals("") || stRePassword.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen tüm alanları doldurunuz");
            txt_userName.requestFocus();
        } else {
            if (stPassword.equals(stRePassword)) {
                
                dataBase db = new dataBase();
                int status = db.userInsert(email, convertMD5.fncMD5(stPassword, 2), username);
                db.close();
                
                if (status == -1) {
                    JOptionPane.showMessageDialog(rootPane, "Bu E-Mail adresi veya Kullanıcı adına ait bir hesap bulunmaktadır.");
                }
                
                if (status > 0) {
                    //Text field box is cleared.
                    txt_email.setText("");
                    txt_password.setText("");
                    txt_rePassword.setText("");
                    txt_userName.setText("");
                    // Process is success and go to the login screen.
                    JOptionPane.showMessageDialog(rootPane, "Hesabınız başarıyla oluşturuldu");
                    LoginScreen loginScreen = new LoginScreen();
                    loginScreen.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Şifrenizi kontrol ediniz");
                txt_password.requestFocus();
            }
        }

    }//GEN-LAST:event_btn_createAccountActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed

        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_createAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_confirmPassword;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JPanel pnl1_blue;
    private javax.swing.JPanel pnl2_white;
    private javax.swing.JPanel pnl3_border;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_rePassword;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
