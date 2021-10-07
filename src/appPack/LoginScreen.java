
package appPack;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginScreen extends JFrame {
    
    public LoginScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1_blue = new javax.swing.JPanel();
        pnl2_white = new javax.swing.JPanel();
        pnl3_border = new javax.swing.JPanel();
        lbl_user_icon = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        lbl_userName = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_createAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));
        setResizable(false);

        pnl1_blue.setBackground(new java.awt.Color(41, 170, 227));

        pnl2_white.setBackground(new java.awt.Color(255, 255, 255));
        pnl2_white.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pnl3_border.setBackground(new java.awt.Color(255, 255, 255));
        pnl3_border.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 170, 227), 4, true));

        lbl_user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_login_icon.png"))); // NOI18N

        txt_userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_userNameKeyReleased(evt);
            }
        });

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        lbl_userName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_userName.setForeground(new java.awt.Color(41, 170, 227));
        lbl_userName.setText("Kullanıcı Adı");
        lbl_userName.setToolTipText("");

        lbl_password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(41, 170, 227));
        lbl_password.setText("Şifre");

        btn_login.setBackground(new java.awt.Color(47, 170, 227));
        btn_login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Giriş Yap");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_createAccount.setBackground(new java.awt.Color(41, 170, 221));
        btn_createAccount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_createAccount.setForeground(new java.awt.Color(255, 255, 255));
        btn_createAccount.setText("Hesap Oluştur");
        btn_createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl3_borderLayout = new javax.swing.GroupLayout(pnl3_border);
        pnl3_border.setLayout(pnl3_borderLayout);
        pnl3_borderLayout.setHorizontalGroup(
            pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_borderLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_borderLayout.createSequentialGroup()
                        .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_password)
                            .addComponent(lbl_userName)
                            .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_userName)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_borderLayout.createSequentialGroup()
                        .addComponent(lbl_user_icon)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_borderLayout.createSequentialGroup()
                        .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_createAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))))
        );
        pnl3_borderLayout.setVerticalGroup(
            pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_borderLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lbl_user_icon)
                .addGap(18, 18, 18)
                .addComponent(lbl_userName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(pnl2_white, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pnl1_blueLayout.setVerticalGroup(
            pnl1_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1_blueLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(pnl2_white, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
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

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        String username = txt_userName.getText().trim().toLowerCase();
        char[] password = txt_password.getPassword();
        
        String stPassword = String.valueOf(password).trim().toLowerCase();
        
        if( username.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Lütfen kullanıcı adınızı giriniz");
            txt_userName.requestFocus();
        }
        else if( stPassword.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Lütfen şifrenizi giriniz");
            txt_password.requestFocus();
        }
        else{
            
            dataBase db = new dataBase();
            
            if( db.userLogin(username, stPassword) ){
                homePage page = new homePage();
                page.setVisible(true);
                dispose();
                db.close();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı adı ya da şifre hatalı!!");
                db.close();
            }
            
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createAccountActionPerformed
        
        CreateAccount createAccount = new CreateAccount();
        createAccount.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_createAccountActionPerformed

    private void txt_userNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userNameKeyReleased
        if( KeyEvent.VK_ENTER == evt.getKeyCode() ){
            btn_loginActionPerformed(null);
        }
    }//GEN-LAST:event_txt_userNameKeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        if( KeyEvent.VK_ENTER == evt.getKeyCode() ){
            btn_loginActionPerformed(null);
        }
    }//GEN-LAST:event_txt_passwordKeyReleased

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_createAccount;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JLabel lbl_user_icon;
    private javax.swing.JPanel pnl1_blue;
    private javax.swing.JPanel pnl2_white;
    private javax.swing.JPanel pnl3_border;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
