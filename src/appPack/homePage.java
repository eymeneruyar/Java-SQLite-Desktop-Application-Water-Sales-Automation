package appPack;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class homePage extends javax.swing.JFrame {

    //Global Variables
    //cid : customer ID
    //oid : order ID
    int cid = 0;
    int oid = 0;
    String state = "";

    public homePage() {
        initComponents();
        refreshCustomerTable();
        refreshOrderTable();
        lbl_username.setText(dataBase.users.getName()); //Hatalı çalışıyor
    }

    private void refreshCustomerTable() {
        dataBase db = new dataBase();
        tbl_customer.setModel(db.allCustomer());
        db.close();
    }

    private void refreshOrderTable() {
        dataBase db = new dataBase();
        tbl_order.setModel(db.allOrder());
        db.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1_blue = new javax.swing.JPanel();
        pnl2_white = new javax.swing.JPanel();
        pnl3_customer = new javax.swing.JPanel();
        pnl_search = new javax.swing.JPanel();
        txt_customerName = new javax.swing.JTextField();
        txt_customerSurname = new javax.swing.JTextField();
        lbl_customerName = new javax.swing.JLabel();
        lbl_customerSurname = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        pnl_customerInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        btn_addCustomer = new javax.swing.JButton();
        btn_editCustomer = new javax.swing.JButton();
        btn_deleteCustomer = new javax.swing.JButton();
        lbl_addCustomer = new javax.swing.JLabel();
        lbl_editCustomer = new javax.swing.JLabel();
        lbl_deleteCustomer = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        lbl_refresh = new javax.swing.JLabel();
        pnl4_order = new javax.swing.JPanel();
        pnl_orderProcess = new javax.swing.JPanel();
        btn_deleteOrder = new javax.swing.JButton();
        btn_deleteAllOrder = new javax.swing.JButton();
        lbl_delete = new javax.swing.JLabel();
        lbl_deleteAll = new javax.swing.JLabel();
        pnl_orderInfo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_order = new javax.swing.JTable();
        btn_newOrder = new javax.swing.JButton();
        lbl_newOrder = new javax.swing.JLabel();
        btn_roadOrder = new javax.swing.JButton();
        lbl_roadOrder = new javax.swing.JLabel();
        btn_delivered = new javax.swing.JButton();
        lbl_delivered = new javax.swing.JLabel();
        pnl_account = new javax.swing.JPanel();
        lbl_userIcon = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        btn_changePassword = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnl1_blue.setBackground(new java.awt.Color(41, 170, 221));

        pnl2_white.setBackground(new java.awt.Color(255, 255, 255));

        pnl3_customer.setBackground(new java.awt.Color(255, 255, 255));
        pnl3_customer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 170, 221), 3));

        pnl_search.setBackground(new java.awt.Color(255, 255, 255));
        pnl_search.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(41, 170, 221))); // NOI18N

        txt_customerName.setOpaque(false);
        txt_customerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_customerNameKeyReleased(evt);
            }
        });

        txt_customerSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_customerSurnameKeyReleased(evt);
            }
        });

        lbl_customerName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_customerName.setForeground(new java.awt.Color(41, 170, 221));
        lbl_customerName.setText("Müşterinin Adı");

        lbl_customerSurname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_customerSurname.setForeground(new java.awt.Color(41, 170, 221));
        lbl_customerSurname.setText("Müşterinin Soyadı");

        btn_search.setBackground(new java.awt.Color(255, 255, 255));
        btn_search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(41, 170, 221));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_icon.png"))); // NOI18N
        btn_search.setText("Ara");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_searchLayout = new javax.swing.GroupLayout(pnl_search);
        pnl_search.setLayout(pnl_searchLayout);
        pnl_searchLayout.setHorizontalGroup(
            pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_customerName)
                    .addComponent(txt_customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_customerSurname)
                    .addComponent(txt_customerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_searchLayout.setVerticalGroup(
            pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_searchLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_searchLayout.createSequentialGroup()
                        .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_customerName)
                            .addComponent(lbl_customerSurname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_customerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addComponent(btn_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnl_customerInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_customerInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(41, 170, 221))); // NOI18N

        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_customerMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_customer);

        btn_addCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btn_addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_icon.png"))); // NOI18N
        btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCustomerActionPerformed(evt);
            }
        });

        btn_editCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btn_editCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_icon.png"))); // NOI18N
        btn_editCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editCustomerActionPerformed(evt);
            }
        });

        btn_deleteCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteAll_icon.png"))); // NOI18N
        btn_deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCustomerActionPerformed(evt);
            }
        });

        lbl_addCustomer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_addCustomer.setForeground(new java.awt.Color(41, 170, 221));
        lbl_addCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_addCustomer.setText("Müşteri Ekle");

        lbl_editCustomer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_editCustomer.setForeground(new java.awt.Color(41, 170, 221));
        lbl_editCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_editCustomer.setText("Düzenle");

        lbl_deleteCustomer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_deleteCustomer.setForeground(new java.awt.Color(41, 170, 221));
        lbl_deleteCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_deleteCustomer.setText("Sil");

        btn_refresh.setBackground(new java.awt.Color(255, 255, 255));
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh_icon.png"))); // NOI18N
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        lbl_refresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_refresh.setForeground(new java.awt.Color(41, 170, 221));
        lbl_refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_refresh.setText("Yenile");

        javax.swing.GroupLayout pnl_customerInfoLayout = new javax.swing.GroupLayout(pnl_customerInfo);
        pnl_customerInfo.setLayout(pnl_customerInfoLayout);
        pnl_customerInfoLayout.setHorizontalGroup(
            pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_customerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnl_customerInfoLayout.createSequentialGroup()
                        .addGroup(pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_addCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_editCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_editCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnl_customerInfoLayout.setVerticalGroup(
            pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_customerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnl_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_customerInfoLayout.createSequentialGroup()
                        .addComponent(lbl_refresh)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_customerInfoLayout.createSequentialGroup()
                        .addComponent(lbl_deleteCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_customerInfoLayout.createSequentialGroup()
                        .addComponent(lbl_editCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_customerInfoLayout.createSequentialGroup()
                        .addComponent(lbl_addCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_addCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl3_customerLayout = new javax.swing.GroupLayout(pnl3_customer);
        pnl3_customer.setLayout(pnl3_customerLayout);
        pnl3_customerLayout.setHorizontalGroup(
            pnl3_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl3_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_customerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl3_customerLayout.setVerticalGroup(
            pnl3_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_customerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl4_order.setBackground(new java.awt.Color(255, 255, 255));
        pnl4_order.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 170, 221), 3));
        pnl4_order.setPreferredSize(new java.awt.Dimension(471, 610));

        pnl_orderProcess.setBackground(new java.awt.Color(255, 255, 255));
        pnl_orderProcess.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sipariş İşlemleri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(41, 170, 221))); // NOI18N
        pnl_orderProcess.setPreferredSize(new java.awt.Dimension(215, 110));

        btn_deleteOrder.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_icon.png"))); // NOI18N
        btn_deleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteOrderActionPerformed(evt);
            }
        });

        btn_deleteAllOrder.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteAllOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteAll_icon.png"))); // NOI18N
        btn_deleteAllOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteAllOrderActionPerformed(evt);
            }
        });

        lbl_delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_delete.setForeground(new java.awt.Color(41, 170, 221));
        lbl_delete.setText("Sil");

        lbl_deleteAll.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_deleteAll.setForeground(new java.awt.Color(41, 170, 221));
        lbl_deleteAll.setText("Tümünü Sil");

        javax.swing.GroupLayout pnl_orderProcessLayout = new javax.swing.GroupLayout(pnl_orderProcess);
        pnl_orderProcess.setLayout(pnl_orderProcessLayout);
        pnl_orderProcessLayout.setHorizontalGroup(
            pnl_orderProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_orderProcessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_orderProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_orderProcessLayout.createSequentialGroup()
                        .addComponent(btn_deleteOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btn_deleteAllOrder))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_orderProcessLayout.createSequentialGroup()
                        .addComponent(lbl_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_deleteAll)))
                .addContainerGap())
        );
        pnl_orderProcessLayout.setVerticalGroup(
            pnl_orderProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_orderProcessLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_orderProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_deleteAll, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_delete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_orderProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_deleteOrder, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_deleteAllOrder, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pnl_orderInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_orderInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sipariş Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(41, 170, 221))); // NOI18N
        pnl_orderInfo.setPreferredSize(new java.awt.Dimension(32, 461));

        tbl_order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_orderMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_order);

        btn_newOrder.setBackground(new java.awt.Color(255, 255, 255));
        btn_newOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_order_icon.png"))); // NOI18N
        btn_newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newOrderActionPerformed(evt);
            }
        });

        lbl_newOrder.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_newOrder.setForeground(new java.awt.Color(41, 170, 221));
        lbl_newOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_newOrder.setText("Yeni Sipariş");

        btn_roadOrder.setBackground(new java.awt.Color(255, 255, 255));
        btn_roadOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/road_icon.png"))); // NOI18N
        btn_roadOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_roadOrderActionPerformed(evt);
            }
        });

        lbl_roadOrder.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_roadOrder.setForeground(new java.awt.Color(41, 170, 221));
        lbl_roadOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_roadOrder.setText("Yolda");

        btn_delivered.setBackground(new java.awt.Color(255, 255, 255));
        btn_delivered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delivered_icon.png"))); // NOI18N
        btn_delivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deliveredActionPerformed(evt);
            }
        });

        lbl_delivered.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_delivered.setForeground(new java.awt.Color(41, 170, 221));
        lbl_delivered.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_delivered.setText("Teslim Edildi");

        javax.swing.GroupLayout pnl_orderInfoLayout = new javax.swing.GroupLayout(pnl_orderInfo);
        pnl_orderInfo.setLayout(pnl_orderInfoLayout);
        pnl_orderInfoLayout.setHorizontalGroup(
            pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_orderInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnl_orderInfoLayout.createSequentialGroup()
                        .addGroup(pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_newOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_newOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_roadOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_roadOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delivered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_delivered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_orderInfoLayout.setVerticalGroup(
            pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_orderInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_newOrder)
                    .addComponent(lbl_roadOrder)
                    .addComponent(lbl_delivered))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_orderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_roadOrder)
                    .addComponent(btn_newOrder)
                    .addComponent(btn_delivered))
                .addContainerGap())
        );

        pnl_account.setBackground(new java.awt.Color(255, 255, 255));
        pnl_account.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hesap", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(41, 170, 221))); // NOI18N
        pnl_account.setPreferredSize(new java.awt.Dimension(215, 110));

        lbl_userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_login_icon.png"))); // NOI18N

        btn_exit.setBackground(new java.awt.Color(41, 170, 221));
        btn_exit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("Çıkış");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_changePassword.setBackground(new java.awt.Color(41, 170, 221));
        btn_changePassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_changePassword.setForeground(new java.awt.Color(255, 255, 255));
        btn_changePassword.setText("Şifre Değiştir");
        btn_changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changePasswordActionPerformed(evt);
            }
        });

        lbl_username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_username.setText("Admin");

        javax.swing.GroupLayout pnl_accountLayout = new javax.swing.GroupLayout(pnl_account);
        pnl_account.setLayout(pnl_accountLayout);
        pnl_accountLayout.setHorizontalGroup(
            pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accountLayout.createSequentialGroup()
                .addGroup(pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_accountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_userIcon)
                        .addGap(18, 18, 18)
                        .addGroup(pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_accountLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_username)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_accountLayout.setVerticalGroup(
            pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accountLayout.createSequentialGroup()
                .addGroup(pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_accountLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(pnl_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_userIcon)
                            .addComponent(btn_changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl4_orderLayout = new javax.swing.GroupLayout(pnl4_order);
        pnl4_order.setLayout(pnl4_orderLayout);
        pnl4_orderLayout.setHorizontalGroup(
            pnl4_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4_orderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl4_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_orderInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(pnl4_orderLayout.createSequentialGroup()
                        .addComponent(pnl_orderProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_account, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl4_orderLayout.setVerticalGroup(
            pnl4_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4_orderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl4_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_orderProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(pnl_account, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(pnl_orderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl2_whiteLayout = new javax.swing.GroupLayout(pnl2_white);
        pnl2_white.setLayout(pnl2_whiteLayout);
        pnl2_whiteLayout.setHorizontalGroup(
            pnl2_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2_whiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl3_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(pnl4_order, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl2_whiteLayout.setVerticalGroup(
            pnl2_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2_whiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl2_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl4_order, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addComponent(pnl3_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(21, 21, 21)
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

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed

        String name = txt_customerName.getText().trim().toLowerCase();
        String surname = txt_customerSurname.getText().trim().toLowerCase();
        
        dataBase db = new dataBase();
        DefaultTableModel dtm = db.findChooseCustomer(name, surname);
        boolean status = db.findCustomer(name, surname);
        db.close();
        
        if (name.equals("") || surname.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen aramak istediğiniz kişinin adını ve soyadını giriniz.");
        } else if(!status){
            JOptionPane.showMessageDialog(rootPane, "Aradığınız kişi bulunamadı.");
        }
        else{
            tbl_customer.setModel(dtm);
            txt_customerName.setText("");
            txt_customerSurname.setText("");
            txt_customerName.requestFocus();
        }

    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
        addCustomer customer = new addCustomer();
        customer.setVisible(true);
        dispose();
        refreshCustomerTable();
    }//GEN-LAST:event_btn_addCustomerActionPerformed

    private void btn_editCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editCustomerActionPerformed

        if (cid > 0) {
            dataBase db = new dataBase();
            db.selectCustomerInfo(cid);
            db.close();
            editCustomer customer = new editCustomer();
            customer.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen düzenleme yapmak istediğiniz müşteriyi seçiniz.");
        }

    }//GEN-LAST:event_btn_editCustomerActionPerformed

    private void btn_deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCustomerActionPerformed

        if (cid > 0) {

            int select = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinize emin misiniz?", "Sil", JOptionPane.YES_NO_OPTION);

            if (select == 0) {
                dataBase db = new dataBase();
                int status = db.deleteCustomer(cid);
                db.close();
                if (status > 0) {
                    refreshCustomerTable();
                }
                cid = 0;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        }
    }//GEN-LAST:event_btn_deleteCustomerActionPerformed

    private void btn_deleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteOrderActionPerformed

        if (oid > 0) {

            int select = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinize emin misiniz?", "Sil", JOptionPane.YES_NO_OPTION);

            if (select == 0) {
                dataBase db = new dataBase();
                int status = db.deleteOrder(oid);
                db.close();
                if (status > 0) {
                    refreshOrderTable();
                }
                oid = 0;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        }

    }//GEN-LAST:event_btn_deleteOrderActionPerformed

    private void btn_deleteAllOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteAllOrderActionPerformed

        int selectWarning = JOptionPane.showConfirmDialog(rootPane, "Bu işlem tüm verilerinizi silecektir."
                + "Devam etmek isitiyor musunuz?", "Uyarı", JOptionPane.YES_NO_OPTION);

        if (selectWarning == 0) {
            dataBase db = new dataBase();
            int status = db.deleteAllOrder();
            db.close();
            if (status > 0) {
                refreshOrderTable();
            }
            oid = 0;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        }


    }//GEN-LAST:event_btn_deleteAllOrderActionPerformed

    private void btn_changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changePasswordActionPerformed

        changePassword password = new changePassword();
        password.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_changePasswordActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newOrderActionPerformed

        if (cid > 0) {

            //Add name, surname, id and address information 
            dataBase db = new dataBase();
            db.selectCustomerInfo(cid);
            db.close();

            newOrder order = new newOrder();
            order.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen bir müşteri seçiniz");
        }

    }//GEN-LAST:event_btn_newOrderActionPerformed

    private void btn_roadOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_roadOrderActionPerformed

        state = "Yolda";
        dataBase db1 = new dataBase();
        db1.selectOrdersInfo(oid);
        db1.close();
        String presentState = dataBase.ordersVariable.getState();

        if (presentState.equals("Teslim Edildi")) {
            JOptionPane.showMessageDialog(rootPane, "Sipariş teslim edilmiştir.");
        } else if (oid > 0) {
            dataBase db = new dataBase();
            db.orderUpdateRoad(state, oid);
            db.close();
            refreshOrderTable();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen bir sipariş seçiniz.");
        }
        oid = 0;
    }//GEN-LAST:event_btn_roadOrderActionPerformed

    private void btn_deliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deliveredActionPerformed

        state = "Teslim Edildi";

        if (oid > 0) {
            dataBase db = new dataBase();
            db.orderUpdateDelivered(state, oid);
            db.close();
            refreshOrderTable();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen bir sipariş seçiniz.");
        }
        oid = 0;
    }//GEN-LAST:event_btn_deliveredActionPerformed

    private void tbl_customerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseReleased

        int row = tbl_customer.getSelectedRow();
        cid = (int) tbl_customer.getValueAt(row, 0);
        String name = (String) tbl_customer.getValueAt(row, 1);
        String surname = (String) tbl_customer.getValueAt(row, 2);
        String phone = (String) tbl_customer.getValueAt(row, 3);
        String address = (String) tbl_customer.getValueAt(row, 4);

    }//GEN-LAST:event_tbl_customerMouseReleased

    private void tbl_orderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_orderMouseReleased

        int row = tbl_order.getSelectedRow();
        oid = (int) tbl_order.getValueAt(row, 0);
        String name = (String) tbl_order.getValueAt(row, 1);
        String surname = (String) tbl_order.getValueAt(row, 2);
        String state = (String) tbl_order.getValueAt(row, 3);
        String address = (String) tbl_order.getValueAt(row, 4);
        int amount = (int) tbl_order.getValueAt(row, 5);

    }//GEN-LAST:event_tbl_orderMouseReleased

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        refreshCustomerTable();
        refreshOrderTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txt_customerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_customerNameKeyReleased
        if( KeyEvent.VK_ENTER == evt.getKeyCode() ){
            btn_searchActionPerformed(null);
        }
    }//GEN-LAST:event_txt_customerNameKeyReleased

    private void txt_customerSurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_customerSurnameKeyReleased
        if( KeyEvent.VK_ENTER == evt.getKeyCode() ){
            btn_searchActionPerformed(null);
        }
    }//GEN-LAST:event_txt_customerSurnameKeyReleased

    
    
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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCustomer;
    private javax.swing.JButton btn_changePassword;
    private javax.swing.JButton btn_deleteAllOrder;
    private javax.swing.JButton btn_deleteCustomer;
    private javax.swing.JButton btn_deleteOrder;
    private javax.swing.JButton btn_delivered;
    private javax.swing.JButton btn_editCustomer;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_newOrder;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_roadOrder;
    private javax.swing.JButton btn_search;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_addCustomer;
    private javax.swing.JLabel lbl_customerName;
    private javax.swing.JLabel lbl_customerSurname;
    private javax.swing.JLabel lbl_delete;
    private javax.swing.JLabel lbl_deleteAll;
    private javax.swing.JLabel lbl_deleteCustomer;
    private javax.swing.JLabel lbl_delivered;
    private javax.swing.JLabel lbl_editCustomer;
    private javax.swing.JLabel lbl_newOrder;
    private javax.swing.JLabel lbl_refresh;
    private javax.swing.JLabel lbl_roadOrder;
    private javax.swing.JLabel lbl_userIcon;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPanel pnl1_blue;
    private javax.swing.JPanel pnl2_white;
    private javax.swing.JPanel pnl3_customer;
    private javax.swing.JPanel pnl4_order;
    private javax.swing.JPanel pnl_account;
    private javax.swing.JPanel pnl_customerInfo;
    private javax.swing.JPanel pnl_orderInfo;
    private javax.swing.JPanel pnl_orderProcess;
    private javax.swing.JPanel pnl_search;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTable tbl_order;
    private javax.swing.JTextField txt_customerName;
    private javax.swing.JTextField txt_customerSurname;
    // End of variables declaration//GEN-END:variables
}
