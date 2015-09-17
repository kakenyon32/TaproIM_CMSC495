//Gunar Gorder, Brandon Dent, Frank Montoya, Kent Kenyon, Spencer Ward
//TAMPROW IM FINAL PROJECT
//CMSC 495 6380
//9-5-15
//Login_GUI.java
package taproim_cmsc495;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JFrame;


public class Login_GUI extends javax.swing.JFrame {
    
private String username = "Employee495";
private char[] password = {'T','a','p','r','o','4','9','5'};
    /**
     * Creates new form Login_GUI
     */
    public Login_GUI() {
        getContentPane().setBackground(Color.GRAY);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        PictureLabel = new javax.swing.JLabel();
        ErrorMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("USERNAME :");

        PasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("PASSWORD :");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        PictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taproim_cmsc495/newpackage/TAPRO ICON.png"))); // NOI18N

        ErrorMessageLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ErrorMessageLabel.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(ErrorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

@SuppressWarnings("empty-statement")
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       //If username is incorrect, display message for the employee 
        String usernameInput = jTextField1.getText();
        if (usernameInput == null ? username != null : !usernameInput.equals(username)){
            ErrorMessageLabel.setText("INVALID USERNAME AND/OR PASSWORD! PLEASE TRY AGAIN!");
            jTextField1.setText("");
            jPasswordField1.setText("");
        }
       //If password is incorrect, display message for the employee 
        char[] passwordInput = jPasswordField1.getPassword();
        if (passwordInput == null ? password != null : !Arrays.equals(passwordInput, password)){
            ErrorMessageLabel.setText("INVALID USERNAME AND/OR PASSWORD! PLEASE TRY AGAIN!");
            jTextField1.setText("");
            jPasswordField1.setText("");
        }
       //If username and password are correct, grant access and direct employee to main GUI display
        if (usernameInput.equals(username) && Arrays.equals(passwordInput, password)){
            ErrorMessageLabel.setText("");
            //Hide login GUI after successful login
            setVisible(false);
            //Display the main GUI display for the employee after successful login
            new Display_GUI().setVisible(true);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMessageLabel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
