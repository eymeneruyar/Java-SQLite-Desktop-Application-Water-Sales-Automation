/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPack;

import javax.swing.JOptionPane;

/**
 *
 * @author Eymen
 */
public class addCustomer extends javax.swing.JFrame {

    /**
     * Creates new form addCustomer
     */
    public addCustomer() {
        initComponents();
    }

    //Check phone number
    public static boolean isValidPhoneNumber(String phone_number) {
        boolean isValid = phone_number.matches("\\d{11}");
        System.out.println(phone_number + " : " + isValid);
        return isValid;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1_blue = new javax.swing.JPanel();
        pnl2_white = new javax.swing.JPanel();
        pnl3_border = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        lbl_surname = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        lbl_phone1 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        lbl_insertCustomer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1_blue.setBackground(new java.awt.Color(41, 170, 221));

        pnl2_white.setBackground(new java.awt.Color(255, 255, 255));

        pnl3_border.setBackground(new java.awt.Color(255, 255, 255));
        pnl3_border.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 170, 221), 4, true));

        lbl_surname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_surname.setForeground(new java.awt.Color(41, 170, 221));
        lbl_surname.setText("Soyadı");

        lbl_name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(41, 170, 221));
        lbl_name.setText("Adı");

        lbl_phone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(41, 170, 221));
        lbl_phone.setText("Telefon");

        lbl_phone1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_phone1.setForeground(new java.awt.Color(41, 170, 221));
        lbl_phone1.setText("Adres");

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(41, 170, 221));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel_icon.png"))); // NOI18N
        btn_cancel.setText("İptal");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(41, 170, 221));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save_icon.png"))); // NOI18N
        btn_save.setText("Kaydet");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        lbl_insertCustomer.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_insertCustomer.setForeground(new java.awt.Color(41, 170, 221));
        lbl_insertCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_insertCustomer.setText("Müşteri Ekle");

        javax.swing.GroupLayout pnl3_borderLayout = new javax.swing.GroupLayout(pnl3_border);
        pnl3_border.setLayout(pnl3_borderLayout);
        pnl3_borderLayout.setHorizontalGroup(
            pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_borderLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addComponent(lbl_surname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_phone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_insertCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl3_borderLayout.createSequentialGroup()
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btn_save))
                    .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_surname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_name)
                    .addComponent(txt_address))
                .addGap(33, 33, 33))
        );
        pnl3_borderLayout.setVerticalGroup(
            pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_borderLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lbl_insertCustomer)
                .addGap(18, 18, 18)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl3_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
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
            .addGroup(pnl1_blueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl2_white, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl1_blueLayout.setVerticalGroup(
            pnl1_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_blueLayout.createSequentialGroup()
                .addGap(19, 19, 19)
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

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        homePage page = new homePage();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        String name = txt_name.getText().trim().toLowerCase();
        String surname = txt_surname.getText().trim().toLowerCase();
        String phone = txt_phone.getText().trim().toLowerCase();
        String address = txt_address.getText().trim().toLowerCase();
        boolean isValid = false;

        isValid = isValidPhoneNumber(phone);

        try {

            if (name.equals("") || surname.equals("") || phone.equals("") || address.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen tüm alanları doldurunuz");
                txt_name.requestFocus();
            } else if (isValid) {

                dataBase db = new dataBase();
                int status = db.customerInsert(name, surname, phone, address);
                db.close();

                //Check unique state phone number.
                if (status == -1) {
                    JOptionPane.showMessageDialog(rootPane, "Bu telefona ait bir hesap zaten bulunmaktadır.");
                }

                if (status > 0) {
                    //Text fields are cleared.
                    txt_name.setText("");
                    txt_surname.setText("");
                    txt_phone.setText("");
                    txt_address.setText("");
                    //Information Message
                    JOptionPane.showMessageDialog(rootPane, "Müşteri bilgileri başarıyla kaydedildi.");
                    txt_name.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Lütfen telefon numaranızı formata uygun giriniz: 05*********");
            }

        } catch (Exception e) {
            System.err.println("Save Customer Error: " + e);
        }

    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel lbl_insertCustomer;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_phone1;
    private javax.swing.JLabel lbl_surname;
    private javax.swing.JPanel pnl1_blue;
    private javax.swing.JPanel pnl2_white;
    private javax.swing.JPanel pnl3_border;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
