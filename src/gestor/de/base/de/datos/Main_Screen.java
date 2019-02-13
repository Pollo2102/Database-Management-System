/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.base.de.datos;

/**
 *
 * @author diego
 */
public class Main_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Main_Screen
     */
    
    Database_Manager dbm;
    Login_Screen LGS;
    
    public Main_Screen(Database_Manager D, Login_Screen LG) {
        initComponents();
        dbm = D;
        LGS = LG;
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_TabbedPane = new javax.swing.JTabbedPane();
        Show_Tab = new javax.swing.JPanel();
        Show_ComboBox = new javax.swing.JComboBox<>();
        Show_Button = new javax.swing.JButton();
        Show_TablePane = new javax.swing.JScrollPane();
        Show_Table = new javax.swing.JTable();
        ShowModify_Button = new javax.swing.JButton();
        ShowDelete_Button = new javax.swing.JButton();
        ShowTable_Button = new javax.swing.JButton();
        Create_Tab = new javax.swing.JPanel();
        DDL_Tab = new javax.swing.JPanel();
        DBConnections_Tab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 650));

        Main_TabbedPane.setForeground(new java.awt.Color(204, 204, 204));
        Main_TabbedPane.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Main_TabbedPane.setName(""); // NOI18N

        Show_Tab.setForeground(new java.awt.Color(60, 63, 65));
        Show_Tab.setOpaque(false);

        Show_ComboBox.setMaximumRowCount(7);
        Show_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tables", "Indexes", "Triggers", "Users & Databases", "Views" }));

        Show_Button.setText("Show");
        Show_Button.setToolTipText("Show a table's contents");
        Show_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Show_ButtonMouseClicked(evt);
            }
        });

        Show_Table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Show_Table.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Show_Table.setForeground(new java.awt.Color(0, 0, 0));
        Show_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Show_Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Show_Table.setOpaque(false);
        Show_Table.setRowHeight(30);
        Show_Table.setRowSelectionAllowed(false);
        Show_TablePane.setViewportView(Show_Table);

        ShowModify_Button.setText("Edit");
        ShowModify_Button.setToolTipText("Modify a field inside the table");

        ShowDelete_Button.setText("Delete Entry");
        ShowDelete_Button.setToolTipText("Delete an entry inside the table");

        ShowTable_Button.setText("Show Table");
        ShowTable_Button.setToolTipText("If it is a Table, shows the selected table.");
        ShowTable_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowTable_ButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Show_TabLayout = new javax.swing.GroupLayout(Show_Tab);
        Show_Tab.setLayout(Show_TabLayout);
        Show_TabLayout.setHorizontalGroup(
            Show_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Show_TabLayout.createSequentialGroup()
                .addGroup(Show_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Show_TabLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(Show_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Show_Button))
                    .addGroup(Show_TabLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Show_TablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Show_TabLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(ShowTable_Button)
                        .addGap(104, 104, 104)
                        .addComponent(ShowModify_Button)
                        .addGap(95, 95, 95)
                        .addComponent(ShowDelete_Button)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        Show_TabLayout.setVerticalGroup(
            Show_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Show_TabLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Show_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Show_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show_Button))
                .addGap(18, 18, 18)
                .addComponent(Show_TablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(Show_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowModify_Button)
                    .addComponent(ShowDelete_Button)
                    .addComponent(ShowTable_Button))
                .addGap(41, 41, 41))
        );

        Main_TabbedPane.addTab("Show", Show_Tab);

        javax.swing.GroupLayout Create_TabLayout = new javax.swing.GroupLayout(Create_Tab);
        Create_Tab.setLayout(Create_TabLayout);
        Create_TabLayout.setHorizontalGroup(
            Create_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        Create_TabLayout.setVerticalGroup(
            Create_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        Main_TabbedPane.addTab("Create", Create_Tab);

        javax.swing.GroupLayout DDL_TabLayout = new javax.swing.GroupLayout(DDL_Tab);
        DDL_Tab.setLayout(DDL_TabLayout);
        DDL_TabLayout.setHorizontalGroup(
            DDL_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        DDL_TabLayout.setVerticalGroup(
            DDL_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        Main_TabbedPane.addTab("DDL", DDL_Tab);

        javax.swing.GroupLayout DBConnections_TabLayout = new javax.swing.GroupLayout(DBConnections_Tab);
        DBConnections_Tab.setLayout(DBConnections_TabLayout);
        DBConnections_TabLayout.setHorizontalGroup(
            DBConnections_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        DBConnections_TabLayout.setVerticalGroup(
            DBConnections_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        Main_TabbedPane.addTab("DB Connections", DBConnections_Tab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_TabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_TabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowTable_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTable_ButtonMouseClicked
        
    }//GEN-LAST:event_ShowTable_ButtonMouseClicked

    private void Show_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Show_ButtonMouseClicked
        int option = Show_ComboBox.getSelectedIndex();
        
        /*
            0 - Tables
            1 - Indexes
            2 - Triggers
            3 - Users & Databases
            4 - Views
        */
        try {
            
            if (option == 0) {
                dbm.populateTable(Show_Table, dbm.showTables());
            }
            else if (option == 1) {
                dbm.populateTable(Show_Table, dbm.showIndexes());
            }
            else if (option == 2) {
                dbm.populateTable(Show_Table, dbm.showTriggers());
            }
            else if (option == 3) {
                dbm.populateTable(Show_Table, dbm.showUsers_Schema());
            }
            else if (option == 4) {
                dbm.populateTable(Show_Table, dbm.showViews());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Show_ButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Create_Tab;
    private javax.swing.JPanel DBConnections_Tab;
    private javax.swing.JPanel DDL_Tab;
    private javax.swing.JTabbedPane Main_TabbedPane;
    private javax.swing.JButton ShowDelete_Button;
    private javax.swing.JButton ShowModify_Button;
    private javax.swing.JButton ShowTable_Button;
    private javax.swing.JButton Show_Button;
    private javax.swing.JComboBox<String> Show_ComboBox;
    private javax.swing.JPanel Show_Tab;
    private javax.swing.JTable Show_Table;
    private javax.swing.JScrollPane Show_TablePane;
    // End of variables declaration//GEN-END:variables
}
