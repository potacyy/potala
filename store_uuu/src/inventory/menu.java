/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package inventory;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author admin
 */
public class menu extends javax.swing.JInternalFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
       this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        Inventory = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Inventory1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        change_txt = new javax.swing.JTextField();
        total_txt = new javax.swing.JTextField();
        pay_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        Inventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Inventory.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 181, -1, -1));

        Inventory1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setText("Menu");
        Inventory1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 60, -1));
        Inventory1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 181, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product Name", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Inventory1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 330, 500));

        cart_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(cart_table);

        Inventory1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 360, 330));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setText("Cart");
        Inventory1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Inventory1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 190, 150));

        jScrollPane3.setViewportView(jTextPane1);

        Inventory1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 290, 280));
        Inventory1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 70, -1));

        jButton1.setText("Add");
        Inventory1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 80, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel4.setText("Change:");
        Inventory1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 70, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel7.setText("Total:");
        Inventory1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 40, 20));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel8.setText("Payment:");
        Inventory1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 60, -1));
        Inventory1.add(change_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 280, 20));
        Inventory1.add(total_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 300, 20));
        Inventory1.add(pay_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 462, 280, 20));

        jButton2.setText("Pay");
        Inventory1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 80, -1));

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Inventory1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 80, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel9.setText("Description:");
        Inventory1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/f7220cc4-c619-4bfd-bff8-10db4c79d108.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        Inventory1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Inventory1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Inventory1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        total_txt.setText("");
        pay_txt.setText("");
        change_txt.setText("");
        cart_table.setTableHeader(null);
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inventory;
    private javax.swing.JPanel Inventory1;
    private javax.swing.JTable cart_table;
    private javax.swing.JTextField change_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField pay_txt;
    private javax.swing.JTextField total_txt;
    // End of variables declaration//GEN-END:variables
}
