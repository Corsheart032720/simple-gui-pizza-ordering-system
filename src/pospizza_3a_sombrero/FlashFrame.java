package pospizza_3a_sombrero;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FlashFrame extends javax.swing.JFrame {

    public FlashFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLoading = new javax.swing.JLabel();
        prgFlash = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 61, 89));

        lblLoading.setForeground(new java.awt.Color(255, 255, 255));
        lblLoading.setText("Loading...");

        prgFlash.setBackground(new java.awt.Color(255, 255, 255));
        prgFlash.setForeground(new java.awt.Color(255, 110, 64));
        prgFlash.setBorder(null);
        prgFlash.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        prgFlash.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prgFlash, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLoading)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblLoading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgFlash, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        FlashFrame FF = new FlashFrame();
        LoginFrame LF = new LoginFrame();
        FF.setVisible(true);

        //Loops
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(10);
                prgFlash.setValue(i);

                if (i % 2 == 0) {
                    lblLoading.setText("Loading..");
                } else {
                    lblLoading.setText("Loading......");
                }

                if (i == 100) {
                    LF.setVisible(true);
                    FF.dispose();

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(FlashFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblLoading;
    public static javax.swing.JProgressBar prgFlash;
    // End of variables declaration//GEN-END:variables
}
