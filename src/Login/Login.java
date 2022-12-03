package Login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import Menu.Menu_Form_User;
import java.awt.Color;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        // center the form
        this.setLocationRelativeTo(null);

        // create a black border for the close and minimizze jlabels
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_LoginPanel = new javax.swing.JPanel();
        jPanel_Login = new javax.swing.JPanel();
        jTextField_UserName = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_Register = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_Signin = new javax.swing.JButton();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jPanel_LoginPanel.setBackground(new java.awt.Color(248, 148, 6));

        jPanel_Login.setBackground(new java.awt.Color(44, 62, 80));
        jPanel_Login.setPreferredSize(new java.awt.Dimension(700, 400));

        jTextField_UserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_UserName.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_UserName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_UserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UserNameFocusLost(evt);
            }
        });
        jTextField_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UserNameActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jButton_Register.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Register.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register.setText("Register");
        jButton_Register.setAlignmentY(0.0F);
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseExited(evt);
            }
        });
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");

        jButton_Signin.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Signin.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Signin.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Signin.setText("Sign in");
        jButton_Signin.setAlignmentY(0.0F);
        jButton_Signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Signin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_SigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_SigninMouseExited(evt);
            }
        });
        jButton_Signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SigninActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_LoginLayout = new javax.swing.GroupLayout(jPanel_Login);
        jPanel_Login.setLayout(jPanel_LoginLayout);
        jPanel_LoginLayout.setHorizontalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Signin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPasswordField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_LoginLayout.setVerticalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Signin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        jLabel_minimize.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_minimize.setText(" -");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabel_minimize.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabel_minimize.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_close.setText(" X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabel_close.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabel_close.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jLabel_Title.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Login Form");

        javax.swing.GroupLayout jPanel_LoginPanelLayout = new javax.swing.GroupLayout(jPanel_LoginPanel);
        jPanel_LoginPanel.setLayout(jPanel_LoginPanelLayout);
        jPanel_LoginPanelLayout.setHorizontalGroup(
            jPanel_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        jPanel_LoginPanelLayout.setVerticalGroup(
            jPanel_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginPanelLayout.createSequentialGroup()
                .addGroup(jPanel_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_LoginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel_LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Create the minize and close mouse interactions
    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_closeMouseExited
    // Create Username and Password Text Field
    private void jTextField_UserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UserNameFocusGained
        // TODO add your handling code here:
        if (jTextField_UserName.getText().trim().toLowerCase().equals("username")) {
            jTextField_UserName.setText("");
            jTextField_UserName.setForeground(Color.black);
        }


    }//GEN-LAST:event_jTextField_UserNameFocusGained

    private void jTextField_UserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UserNameFocusLost
        // TODO add your handling code here:
        if (jTextField_UserName.getText().trim().equals("") || jTextField_UserName.getText().trim().toLowerCase().equals("username")) {
            jTextField_UserName.setText("username");
            jTextField_UserName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_UserNameFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(jPasswordField.getPassword());
        if (pass.trim().toLowerCase().equals("password")) {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        // TODO add your handling code here:
        String pass = String.valueOf(jPasswordField.getPassword());
        if (pass.trim().equals("") || pass.trim().toLowerCase().equals("password")) {
            jPasswordField.setText("password");
            jPasswordField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost
    // Create Sign in and Register Actions
    private void jButton_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseEntered
        // TODO add your handling code here:
        jButton_Register.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton_RegisterMouseEntered

    private void jButton_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseExited
        // TODO add your handling code here:
        jButton_Register.setBackground(new Color(0,84,140));
    }//GEN-LAST:event_jButton_RegisterMouseExited

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jButton_SigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SigninMouseEntered
        // TODO add your handling code here:
        jButton_Signin.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton_SigninMouseEntered

    private void jButton_SigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SigninMouseExited
        // TODO add your handling code here:
        jButton_Signin.setBackground(new Color(0,84,140));
    }//GEN-LAST:event_jButton_SigninMouseExited

    private void jButton_SigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SigninActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SigninActionPerformed

    private void jButton_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseClicked
        // TODO add your handling code here:
        Register_Form rf = new Register_Form();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton_RegisterMouseClicked

    private void jTextField_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UserNameActionPerformed

    private void jButton_SigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SigninMouseClicked
        // TODO add your handling code here:
        PreparedStatement st;
        ResultSet rs;
        
        // get the username & password
        String username = jTextField_UserName.getText();
        String password = String.valueOf(jPasswordField.getPassword());
        
        // create a select query to check if the username and the password exist in the database
        String query = "SELECT * FROM `users` where `username` = ? AND `password` = ?"; 
        try {
            st = MyCNX.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next()){
                //show a new form
                Menu_Form_User form = new Menu_Form_User();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
            }else{
                //show error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
            }
        }
        catch(SQLException ex){
            // error catch thinks later
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jButton_SigninMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JButton jButton_Signin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Login;
    private javax.swing.JPanel jPanel_LoginPanel;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_UserName;
    // End of variables declaration//GEN-END:variables

}
