package gestor.de.base.de.datos;

import javax.swing.JTextPane;

/**
 *
 * @author diego
 */
public class Login_Screen extends javax.swing.JFrame {
    
    Database_Manager dbm;

    /**
     * Creates new form Login_Screen
     */
    public Login_Screen() {
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

        LoginScreen = new javax.swing.JPanel();
        Username_border = new javax.swing.JPanel();
        Username_TextField = new javax.swing.JTextField();
        Login_Title = new javax.swing.JLabel();
        Password_border = new javax.swing.JPanel();
        Password_TextField = new javax.swing.JPasswordField();
        Login_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("H2");
        setBackground(java.awt.SystemColor.controlDkShadow);
        setBounds(new java.awt.Rectangle(0, 0, 1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));

        LoginScreen.setBackground(java.awt.SystemColor.controlDkShadow);
        LoginScreen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LoginScreen.setMaximumSize(new java.awt.Dimension(1200, 800));
        LoginScreen.setMinimumSize(new java.awt.Dimension(750, 600));
        LoginScreen.setName("Login Screen"); // NOI18N

        Username_border.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        Username_border.setForeground(new java.awt.Color(60, 63, 65));
        Username_border.setFocusable(false);
        Username_border.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Username_border.setName("Username_Border"); // NOI18N
        Username_border.setOpaque(false);
        Username_border.setPreferredSize(new java.awt.Dimension(480, 120));

        Username_TextField.setForeground(new java.awt.Color(255, 255, 255));
        Username_TextField.setNextFocusableComponent(Password_TextField);
        Username_TextField.setOpaque(false);
        Username_TextField.setSelectedTextColor(new java.awt.Color(0, 255, 51));
        Username_TextField.setSelectionColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Username_borderLayout = new javax.swing.GroupLayout(Username_border);
        Username_border.setLayout(Username_borderLayout);
        Username_borderLayout.setHorizontalGroup(
            Username_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Username_borderLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Username_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Username_borderLayout.setVerticalGroup(
            Username_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Username_borderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Username_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Login_Title.setFont(new java.awt.Font("Chilanka", 1, 36)); // NOI18N
        Login_Title.setForeground(new java.awt.Color(204, 204, 204));
        Login_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_Title.setText("Login");

        Password_border.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        Password_border.setForeground(new java.awt.Color(60, 63, 65));
        Password_border.setOpaque(false);
        Password_border.setPreferredSize(new java.awt.Dimension(480, 120));

        Password_TextField.setForeground(new java.awt.Color(255, 255, 255));
        Password_TextField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Password_TextField.setNextFocusableComponent(Login_Button);
        Password_TextField.setOpaque(false);
        Password_TextField.setPreferredSize(new java.awt.Dimension(340, 50));
        Password_TextField.setSelectedTextColor(new java.awt.Color(0, 204, 0));
        Password_TextField.setSelectionColor(new java.awt.Color(255, 255, 255));
        Password_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Password_TextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Password_borderLayout = new javax.swing.GroupLayout(Password_border);
        Password_border.setLayout(Password_borderLayout);
        Password_borderLayout.setHorizontalGroup(
            Password_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Password_borderLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        Password_borderLayout.setVerticalGroup(
            Password_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Password_borderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Login_Button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Login_Button.setText("Login");
        Login_Button.setNextFocusableComponent(Username_TextField);
        Login_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_ButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginScreenLayout = new javax.swing.GroupLayout(LoginScreen);
        LoginScreen.setLayout(LoginScreenLayout);
        LoginScreenLayout.setHorizontalGroup(
            LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenLayout.createSequentialGroup()
                .addGroup(LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginScreenLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(Login_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginScreenLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username_border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password_border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginScreenLayout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        LoginScreenLayout.setVerticalGroup(
            LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Login_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Username_border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Password_border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LoginScreen.getAccessibleContext().setAccessibleName("Login_Panel");

        getAccessibleContext().setAccessibleName("Login_Frame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Password_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password_TextFieldKeyPressed
        try {
            if (evt.getKeyChar() == 10){
                connectDatabase();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_Password_TextFieldKeyPressed

    private void Login_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ButtonMouseClicked
        try {
            connectDatabase();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Login_ButtonMouseClicked

    public void connectDatabase() throws Exception{
        dbm = new Database_Manager(Username_TextField.getText(), Password_TextField.getText());
        dbm.connect();
        if (dbm.conn.isValid(0)) {
            System.out.println("Connected succesfully!");
            Main_Screen MN = new Main_Screen(dbm, this);
            this.setVisible(false);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginScreen;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel Login_Title;
    private javax.swing.JPasswordField Password_TextField;
    private javax.swing.JPanel Password_border;
    private javax.swing.JTextField Username_TextField;
    private javax.swing.JPanel Username_border;
    // End of variables declaration//GEN-END:variables
}
