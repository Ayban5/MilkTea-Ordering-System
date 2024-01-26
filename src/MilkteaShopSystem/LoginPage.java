package MilkteaShopSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }
    
    private String acc1 = "johnlloydtorres@gmail.com";
    private String acc2 = "jamesivancarreon@gmail.com";
    private String acc3 = "jobymarquina@gmail.com";
    private String pass1 = "basketball1";
    private String pass2 = "basketball2";
    private String pass3 = "rotcstudent1";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        Signinbut = new javax.swing.JButton();
        signupbut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnhint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("The Brew Milktea Shop");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 64, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 203, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 259, -1, -1));

        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 207, 200, -1));
        getContentPane().add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 259, 200, -1));

        Signinbut.setText("Sign in");
        Signinbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninbutActionPerformed(evt);
            }
        });
        getContentPane().add(Signinbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 302, -1, 34));

        signupbut.setText("Sign up");
        getContentPane().add(signupbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 409, -1, 34));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("No account yet? Click to get started.");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 415, -1, -1));

        btnhint.setText("Hint");
        btnhint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhintActionPerformed(evt);
            }
        });
        getContentPane().add(btnhint, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 302, -1, 34));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SigninbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninbutActionPerformed
        
    String enteredEmail = emailfield.getText();
    String enteredPassword = new String(passfield.getPassword());

    if (enteredEmail.equals(acc1) && enteredPassword.equals(pass1)) {
        OrderPage frame2 = new OrderPage();
        frame2.setVisible(true);
        dispose();
    }else if (enteredEmail.equals(acc2) && enteredPassword.equals(pass2)) {
        OrderPage frame2 = new OrderPage();
        frame2.setVisible(true);
        dispose(); 
    }else if (enteredEmail.equals(acc3) && enteredPassword.equals(pass3)) {
        OrderPage frame2 = new OrderPage();
        frame2.setVisible(true);
        dispose();         
    }else{
        JOptionPane.showMessageDialog(null, "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
    }




        
    }//GEN-LAST:event_SigninbutActionPerformed

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        
         
    }//GEN-LAST:event_emailfieldActionPerformed

    private void btnhintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhintActionPerformed
        
         
    JOptionPane.showMessageDialog(null,
                "Email: johnlloydtorres@gmail.com Password: basketball1\n"
                        + "Email: jamesivancarreon@gmail.com Password: basketball2\n"
                        + "Email: jobymarquina@gmail.com Password: rotcstudent1");
    
    }//GEN-LAST:event_btnhintActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signinbut;
    private javax.swing.JButton btnhint;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JButton signupbut;
    // End of variables declaration//GEN-END:variables
}
