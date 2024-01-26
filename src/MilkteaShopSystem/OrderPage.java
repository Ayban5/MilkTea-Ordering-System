package MilkteaShopSystem;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OrderPage extends javax.swing.JFrame {
    
    private boolean isTableEditable = false;
    private DefaultTableModel tableModel;

    
    public OrderPage() {
        initComponents();
        
        
         jTable1.setEnabled(false);

        tableModel = (DefaultTableModel) jTable1.getModel();

        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);

                    double total = calculateTotalPrice();
                    totalfield.setText(String.valueOf(total));
                }
            }
        });
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        btnaddorder = new javax.swing.JButton();
        menulabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        logout = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        changefield = new javax.swing.JTextField();
        totalfield = new javax.swing.JTextField();
        btnpayment = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btneditorder = new javax.swing.JButton();
        sizebox = new javax.swing.JComboBox<>((new String[] { "Small", "Medium", "Large", "Grande" }));
        addonbox = new javax.swing.JComboBox<>();
        sugarbox = new javax.swing.JComboBox<>();
        typebox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        quantfield = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Show Order");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("The Brew");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Milktea Shop");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 790, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Add-Ons:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Sugar Level:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        btndelete.setText("Delete Order");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 120, 60));

        btnaddorder.setText("Add Order");
        btnaddorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 110, 60));

        menulabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menulabel.setText("Type");
        getContentPane().add(menulabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 120, 20));

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 90, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Check-Out");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 600));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Total:");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Change:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, 20));

        changefield.setEditable(false);
        changefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changefieldActionPerformed(evt);
            }
        });
        getContentPane().add(changefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 80, 30));

        totalfield.setEditable(false);
        totalfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalfieldActionPerformed(evt);
            }
        });
        getContentPane().add(totalfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 80, 30));

        btnpayment.setText("Pay");
        btnpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentActionPerformed(evt);
            }
        });
        getContentPane().add(btnpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 110, 40));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 480, 510));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Size:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Item", "Size", "Addons", "Sugar Lvl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 480, 200));

        btneditorder.setText("Edit");
        btneditorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditorderActionPerformed(evt);
            }
        });
        getContentPane().add(btneditorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 110, 40));
        getContentPane().add(sizebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 250, 50));

        addonbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pudding", "Grass Jelly", "Extra Milk", "Black Pearl" }));
        getContentPane().add(addonbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 250, 50));

        sugarbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "25%", "50%", "100%" }));
        getContentPane().add(sugarbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 110, 50));

        typebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hot Tea", "Cold Milktea", "Frappe", "Milktea Shape", "Tasty Milktea" }));
        typebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeboxActionPerformed(evt);
            }
        });
        getContentPane().add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 60));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 900, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Quantity:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        quantfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantfieldActionPerformed(evt);
            }
        });
        getContentPane().add(quantfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, 50));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 460, 10));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 20, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        LoginPage frame2 = new LoginPage();
        frame2.show();

        dispose();
        
    }//GEN-LAST:event_logoutActionPerformed

    private void btnaddorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddorderActionPerformed
      
        String quantity = quantfield.getText();
        String item = typebox.getSelectedItem().toString();
        String size = sizebox.getSelectedItem().toString();
        String addons = addonbox.getSelectedItem().toString();
        String sugarLevel = sugarbox.getSelectedItem().toString();
        
        double sizePrice = getSizePrice(size);
        double addonPrice = getAddonPrice(addons);
        double totalPrice = sizePrice + addonPrice;
        
        // Add the selected values as a new row to the table
         Object[] rowData = { quantity, item, size, addons, sugarLevel, totalPrice };
         tableModel.addRow(rowData);
        
         double total = calculateTotalPrice();
         totalfield.setText(String.valueOf(total));
    }
        private double getSizePrice(String size) {
    double price = 0.0;
    
    switch (size) {
        case "Small":
            price = 59;
            break;
        case "Medium":
            price = 79;
            break;
        case "Large":
            price = 99;
            break;
        case "Grande":
            price = 129;
            break;
    }
    
    return price;
}
    
        private double getAddonPrice(String addon) {
    double price = 0.0;
    
    switch (addon) {
        case "Pudding":
            price = 10;
            break;
        case "Grass_Jelly":
            price = 10;
            break;
        case "Extra_Milk":
            price = 10;
            break;
        case "Black_Pearl":
            price = 10;
            break;
    }
    
    return price;
}
        
       private double calculateTotalPrice() {
    double total = 0.0;
    int rowCount = tableModel.getRowCount();

    for (int i = 0; i < rowCount; i++) {
        String quantityStr = tableModel.getValueAt(i, 0).toString();
        String size = tableModel.getValueAt(i, 2).toString(); // Get the size from the table
        double sizePrice = getSizePrice(size);
        int quantity = Integer.parseInt(quantityStr);
        total += sizePrice * quantity;
    }

    return total;

        
    }//GEN-LAST:event_btnaddorderActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
        btndelete.addActionListener(new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
            
            double total = calculateTotalPrice();
            totalfield.setText(String.valueOf(total));
        }
    }
});
        totalfield.setText("");
        changefield.setText("");
       
    }//GEN-LAST:event_btndeleteActionPerformed

    private void changefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changefieldActionPerformed

    private void totalfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalfieldActionPerformed
        
    }//GEN-LAST:event_totalfieldActionPerformed

    private void typeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeboxActionPerformed

    private void btneditorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditorderActionPerformed

        isTableEditable = !isTableEditable; // Toggle the editable state

    // Set the editable state of the table
    jTable1.setEnabled(isTableEditable);

    // You can also change the button text based on the state if desired
    if (isTableEditable) {
        btneditorder.setText("Finish Editing");
    } else {
        btneditorder.setText("Edit");
    }

        
    }//GEN-LAST:event_btneditorderActionPerformed

    private void quantfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantfieldActionPerformed
        
    }//GEN-LAST:event_quantfieldActionPerformed

    private void btnpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentActionPerformed
        
     String totalStr = totalfield.getText();
    double total = Double.parseDouble(totalStr);
    
    String paymentStr = JOptionPane.showInputDialog(this, "Enter payment amount:");
    double payment = Double.parseDouble(paymentStr);
    
    double change = payment - total;
    
    changefield.setText(String.valueOf(change));

        
    }//GEN-LAST:event_btnpaymentActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addonbox;
    private javax.swing.JButton btnaddorder;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btneditorder;
    private javax.swing.JButton btnpayment;
    private javax.swing.JTextField changefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel menulabel;
    private javax.swing.JTextField quantfield;
    private javax.swing.JComboBox<String> sizebox;
    private javax.swing.JComboBox<String> sugarbox;
    private javax.swing.JTextField totalfield;
    private javax.swing.JComboBox<String> typebox;
    // End of variables declaration//GEN-END:variables
}
