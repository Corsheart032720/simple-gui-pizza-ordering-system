package pospizza_3a_sombrero;

import javax.swing.JOptionPane;

public class TransactionFrame extends javax.swing.JFrame {

    private double priceSize, totalPrice, priceQTY, priceCrustType, total;
    private double cumulativeTotal = 0.0;

    public TransactionFrame() {
        initComponents();
        lblUsername.setText(LoginFrame.setUsername);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbSize = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        chkPepperoni = new javax.swing.JCheckBox();
        chkHam = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblChange = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        btnComputeChange = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        chkExtraCheese = new javax.swing.JCheckBox();
        chkMushroom = new javax.swing.JCheckBox();
        cmbCrustType = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSaveTransaction = new javax.swing.JButton();
        btnClearSales = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblSales = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCompute = new javax.swing.JButton();
        txtQTY = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(245, 240, 225));

        jPanel1.setBackground(new java.awt.Color(30, 61, 89));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 240, 225));
        jLabel2.setText("Pizza Ordering System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Pizza Size:");

        cmbSize.setBackground(new java.awt.Color(255, 110, 64));
        cmbSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbSize.setForeground(new java.awt.Color(30, 61, 89));
        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        cmbSize.setBorder(null);
        cmbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSizeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Toppings:");

        chkPepperoni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkPepperoni.setForeground(new java.awt.Color(30, 61, 89));
        chkPepperoni.setText("Pepperoni");
        chkPepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPepperoniActionPerformed(evt);
            }
        });

        chkHam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkHam.setForeground(new java.awt.Color(30, 61, 89));
        chkHam.setText("Ham");
        chkHam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHamActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Quantity:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("TOTAL:");

        lblChange.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblChange.setForeground(new java.awt.Color(255, 0, 0));
        lblChange.setText("0.00");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("CASH:");

        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });

        btnComputeChange.setBackground(new java.awt.Color(255, 193, 59));
        btnComputeChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnComputeChange.setText("COMPUTE CHANGE");
        btnComputeChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeChangeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("CHANGE:");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setText("0.00");

        btnCancel.setBackground(new java.awt.Color(255, 193, 59));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setText("Hello: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Hello: ");

        btnLogout.setBackground(new java.awt.Color(255, 193, 59));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        chkExtraCheese.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkExtraCheese.setForeground(new java.awt.Color(30, 61, 89));
        chkExtraCheese.setText("Extra Cheese");
        chkExtraCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExtraCheeseActionPerformed(evt);
            }
        });

        chkMushroom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkMushroom.setForeground(new java.awt.Color(30, 61, 89));
        chkMushroom.setText("Mushroom");
        chkMushroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMushroomActionPerformed(evt);
            }
        });

        cmbCrustType.setBackground(new java.awt.Color(255, 110, 64));
        cmbCrustType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbCrustType.setForeground(new java.awt.Color(30, 61, 89));
        cmbCrustType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Cheesy", "Sausage" }));
        cmbCrustType.setBorder(null);
        cmbCrustType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCrustTypeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Crust Type:");

        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("DISCOUNT:");

        btnSaveTransaction.setBackground(new java.awt.Color(255, 193, 59));
        btnSaveTransaction.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSaveTransaction.setText("SAVE TRANSACTION");
        btnSaveTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTransactionActionPerformed(evt);
            }
        });

        btnClearSales.setBackground(new java.awt.Color(255, 193, 59));
        btnClearSales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearSales.setText("CLEAR SALES");
        btnClearSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSalesActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("TOTAL SALES:");

        lblSales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSales.setForeground(new java.awt.Color(255, 0, 0));
        lblSales.setText("0.00");

        jPanel3.setBackground(new java.awt.Color(255, 110, 64));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 110, 64));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 193, 59));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 193, 59));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );

        btnCompute.setBackground(new java.awt.Color(255, 193, 59));
        btnCompute.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCompute.setText("COMPUTE");
        btnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeActionPerformed(evt);
            }
        });

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("______________________________________________________________________________________________________________________________");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("______________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCrustType, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkExtraCheese)
                                            .addComponent(chkPepperoni))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkHam)
                                            .addComponent(chkMushroom)))
                                    .addComponent(txtQTY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(225, 225, 225))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSaveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnClearSales, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblUsername)
                                                .addGap(399, 399, 399)
                                                .addComponent(lblSales)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblTotal))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(358, 358, 358)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblChange))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(btnComputeChange, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(btnCompute, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbCrustType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(chkPepperoni)
                            .addComponent(chkHam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkExtraCheese)
                            .addComponent(chkMushroom))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnCompute)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(21, 21, 21)
                        .addComponent(btnComputeChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChange)
                            .addComponent(jLabel10))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout)
                            .addComponent(btnSaveTransaction)
                            .addComponent(btnCancel))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(jLabel13)
                            .addComponent(lblSales)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addComponent(btnClearSales, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSizeActionPerformed

    }//GEN-LAST:event_cmbSizeActionPerformed

    private void chkPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPepperoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPepperoniActionPerformed

    private void chkHamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHamActionPerformed

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashActionPerformed

    private void btnComputeChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeChangeActionPerformed
        double getChange, getCash, getDiscount;

        getCash = Double.parseDouble(txtCash.getText());
        total = Double.parseDouble(lblTotal.getText());
        getDiscount = Double.parseDouble(txtDiscount.getText());

        getChange = getCash + getDiscount - total;

        lblChange.setText(Double.toString(getChange));

    }//GEN-LAST:event_btnComputeChangeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int cancelAnswer;

        cancelAnswer = JOptionPane.showConfirmDialog(null, "Clear Transaction?");
        if (cancelAnswer == JOptionPane.YES_OPTION) {
            setClear();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int cancelAnswer;

        cancelAnswer = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?");
        if (cancelAnswer == JOptionPane.YES_OPTION) {
            LoginFrame LF = new LoginFrame();
            LF.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void chkExtraCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExtraCheeseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkExtraCheeseActionPerformed

    private void chkMushroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMushroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMushroomActionPerformed

    private void cmbCrustTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCrustTypeActionPerformed

    }//GEN-LAST:event_cmbCrustTypeActionPerformed

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

    private void btnSaveTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTransactionActionPerformed

        double getAmount;

        int saveTransaction = JOptionPane.showConfirmDialog(null, "Save Transaction?");

        if (saveTransaction == JOptionPane.YES_OPTION) {
            try {
                getAmount = Double.parseDouble(lblTotal.getText());
                cumulativeTotal += getAmount;
                lblSales.setText(Double.toString(cumulativeTotal));
                setClear();
            } catch (NumberFormatException e) {
                BrokenFrame BF = new BrokenFrame();
                BF.setVisible(true);
                dispose();
            }

        }
    }//GEN-LAST:event_btnSaveTransactionActionPerformed

    private void btnClearSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSalesActionPerformed
        int clearSalesAnswer = JOptionPane.showConfirmDialog(null, "Clear Sales?");

        if (clearSalesAnswer == JOptionPane.YES_OPTION) {
            // Reset the cumulativeTotal to zero
            cumulativeTotal = 0.0;

            // Update the sales label to reflect the cleared total
            lblSales.setText(Double.toString(cumulativeTotal));
        }
    }//GEN-LAST:event_btnClearSalesActionPerformed

    private void btnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeActionPerformed

        if (cmbSize.getSelectedItem().equals("Small")) {
            priceSize = 100;
        } else if (cmbSize.getSelectedItem().equals("Medium")) {
            priceSize = 200;
        } else if (cmbSize.getSelectedItem().equals("Large")) {
            priceSize = 300;
        }

        if (cmbCrustType.getSelectedItem().equals("Normal")) {
            priceCrustType = 0;
        } else if (cmbCrustType.getSelectedItem().equals("Cheesy")) {
            priceCrustType = 50;
        } else if (cmbCrustType.getSelectedItem().equals("Sausage")) {
            priceCrustType = 120;
        }

        getTotal();
    }//GEN-LAST:event_btnComputeActionPerformed

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    private void getTotal() {
        String qtyText = txtQTY.getText();

        if (!qtyText.isEmpty()) {
            priceQTY = Double.parseDouble(qtyText);

            if (chkPepperoni.isSelected() && chkHam.isSelected()) {
                totalPrice = (priceCrustType + priceSize + 60 + 50) * priceQTY;
            } else if (chkPepperoni.isSelected()) {
                totalPrice = (priceCrustType + priceSize + 60) * priceQTY;
            } else if (chkHam.isSelected()) {
                totalPrice = (priceCrustType + priceSize + 50) * priceQTY;
            } else if (chkExtraCheese.isSelected() || chkMushroom.isSelected()) {
                totalPrice = (priceCrustType + priceSize) * priceQTY;
            }

            lblTotal.setText(Double.toString(totalPrice));
        } else {
            // Handle the case where txtQTY is empty
            lblTotal.setText("Please enter a quantity");
        }
    }

    private void setClear() {
        txtQTY.setText(" ");
        txtCash.setText(" ");
        txtDiscount.setText(" ");
        lblTotal.setText("0.00");
        lblChange.setText("0.00");
        chkPepperoni.setSelected(false);
        chkHam.setSelected(false);
        chkExtraCheese.setSelected(false);
        chkMushroom.setSelected(false);
        cmbSize.setSelectedItem("Small");
        cmbCrustType.setSelectedItem("Normal");
    }

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
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClearSales;
    private javax.swing.JButton btnCompute;
    private javax.swing.JButton btnComputeChange;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSaveTransaction;
    private javax.swing.JCheckBox chkExtraCheese;
    private javax.swing.JCheckBox chkHam;
    private javax.swing.JCheckBox chkMushroom;
    private javax.swing.JCheckBox chkPepperoni;
    private javax.swing.JComboBox<String> cmbCrustType;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblSales;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtQTY;
    // End of variables declaration//GEN-END:variables
}
