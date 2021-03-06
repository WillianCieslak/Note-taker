package coursework;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Willian Cieslak
 */
public class CourseworkScreen extends javax.swing.JFrame {

    private AllCoursework allCourseworks = new AllCoursework();
    private CommonCode cc = new CommonCode();

    /**
     * Creates new form CourseworkScreen
     */
    public CourseworkScreen() {
        try {
            //Load initial components, list all the courses and display the
            //coursework from the coursework that is selected on the combobox
            initComponents();
            allCourseworks.readAllCourseworks();
            System.out.println("Coursework list: " + allCourseworks.courseworkList);
            addAllCourseworks();
            allCourseworks.readCoursework(cbCourseworks.getSelectedItem().toString());
            System.out.println(cbCourseworks.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(CourseworkScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        displayCoursework();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblCourseworkName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jtfCourseworkName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaRequirements = new javax.swing.JTextArea();
        jtfDueDate = new javax.swing.JTextField();
        btnCreateCoursework = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        jtfDisplayCourseworkName = new javax.swing.JTextField();
        lblDuedate2 = new javax.swing.JLabel();
        jtfDisplayDueDate = new javax.swing.JTextField();
        lblRequiremets2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDisplayRequirements = new javax.swing.JTextArea();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cbCourseworks = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuAddCoursework = new javax.swing.JMenuItem();
        jMenuDeleteCoursework = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuExit = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCourseworkName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCourseworkName.setText("Coursework:");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Coursework Name:");

        jtfCourseworkName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Due date:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Requirements: ");

        jtaRequirements.setColumns(20);
        jtaRequirements.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaRequirements.setRows(5);
        jScrollPane1.setViewportView(jtaRequirements);

        jtfDueDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCreateCoursework.setText("Save Coursework");
        btnCreateCoursework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseworkActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName1.setText("Coursework Name:");

        jtfDisplayCourseworkName.setEditable(false);
        jtfDisplayCourseworkName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblDuedate2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDuedate2.setText("Due date:");

        jtfDisplayDueDate.setEditable(false);
        jtfDisplayDueDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblRequiremets2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRequiremets2.setText("Requirements: ");

        jtaDisplayRequirements.setEditable(false);
        jtaDisplayRequirements.setColumns(20);
        jtaDisplayRequirements.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaDisplayRequirements.setRows(5);
        jScrollPane2.setViewportView(jtaDisplayRequirements);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cbCourseworks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCourseworks.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCourseworksItemStateChanged(evt);
            }
        });

        jDesktopPane1.setLayer(lblCourseworkName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfCourseworkName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfDueDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCreateCoursework, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfDisplayCourseworkName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblDuedate2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfDisplayDueDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblRequiremets2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbCourseworks, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCourseworkName, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(cbCourseworks, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateCoursework, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(jtfCourseworkName)
                    .addComponent(jtfDueDate)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName1)
                    .addComponent(lblRequiremets2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuedate2)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(btnEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave))
                        .addComponent(jtfDisplayDueDate, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                        .addComponent(jtfDisplayCourseworkName, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(335, 335, 335))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblName1))
                .addGap(13, 13, 13)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCourseworkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDisplayCourseworkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDuedate2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDisplayDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblRequiremets2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnSave)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateCoursework)))
                .addGap(22, 22, 22))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCourseworkName)
                .addGap(18, 18, 18)
                .addComponent(cbCourseworks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuFile.setText("File");

        jMenuAddCoursework.setText("Add Coursework");
        jMenuAddCoursework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddCourseworkActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuAddCoursework);

        jMenuDeleteCoursework.setText("Delete Coursework");
        jMenuDeleteCoursework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteCourseworkActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuDeleteCoursework);
        jMenuFile.add(jSeparator1);

        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuExit);

        jMenuBar1.add(jMenuFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAddCourseworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddCourseworkActionPerformed
        // TODO add your handling code here:
        createCoursework();
    }//GEN-LAST:event_jMenuAddCourseworkActionPerformed

    private void jMenuDeleteCourseworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteCourseworkActionPerformed
        // TODO add your handling code here:
        deleteCoursework();
    }//GEN-LAST:event_jMenuDeleteCourseworkActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void btnCreateCourseworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseworkActionPerformed
        // TODO add your handling code here:
        createCoursework();
    }//GEN-LAST:event_btnCreateCourseworkActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        jtaDisplayRequirements.setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void cbCourseworksItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCourseworksItemStateChanged

        System.out.println(cbCourseworks.getSelectedItem().toString());
        displayCoursework();
        allCourseworks.readCoursework(cbCourseworks.getSelectedItem().toString());
    }//GEN-LAST:event_cbCourseworksItemStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String requirements = jtaDisplayRequirements.getText().toString();
        // jtaDisplayRequirements.setText("");

        allCourseworks.allCoursework.clear();

        editCoursework(requirements);
        jtaDisplayRequirements.setEditable(false);

        JOptionPane.showMessageDialog(null, "File Saved!");
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(CourseworkScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseworkScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseworkScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseworkScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseworkScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCoursework;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCourseworks;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuAddCoursework;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDeleteCoursework;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jtaDisplayRequirements;
    private javax.swing.JTextArea jtaRequirements;
    private javax.swing.JTextField jtfCourseworkName;
    private javax.swing.JTextField jtfDisplayCourseworkName;
    private javax.swing.JTextField jtfDisplayDueDate;
    private javax.swing.JTextField jtfDueDate;
    private javax.swing.JLabel lblCourseworkName;
    private javax.swing.JLabel lblDuedate2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblRequiremets2;
    // End of variables declaration//GEN-END:variables

    private void addAllCourseworks() {

        for (String crse : allCourseworks.courseworkList) {
            cbCourseworks.addItem(crse);
        }
    }

    private void addCoursework(String requirement) {

        int id = allCourseworks.getMaxID();
        String name = jtfCourseworkName.getText();
        String dueDate = jtfDueDate.getText();

        allCourseworks.addCoursework(id, name, dueDate, requirement);

    }

    private void editCoursework(String requirement) {

        int id = allCourseworks.getMaxID();
        String name = jtfDisplayCourseworkName.getText();
        String dueDate = jtfDisplayDueDate.getText();

        allCourseworks.allCoursework.clear();

        allCourseworks.addCoursework(id, name, dueDate, requirement);

    }

    private void displayCoursework() {

        String txtNotes = "";

        String courseworkName = "";
        String dueDate = "";
        String requirements = "";

        for (Coursework c : allCourseworks.getAllCourseworks()) {
            courseworkName = c.getName();
            dueDate = c.getDueDate();
            requirements = c.getRequirement();
        }

        System.out.println("Coursework name: " + courseworkName);

        jtfDisplayCourseworkName.setText(courseworkName);
        jtfDisplayDueDate.setText(dueDate);
        jtaDisplayRequirements.setText(requirements);

    }

    private void createCoursework() {
        String newCoursework = jtfCourseworkName.getText();
        String requirements = jtaRequirements.getText();

        if (newCoursework.equals("")) {
            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(null, "Course name cannot be blank", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            allCourseworks.courseworkList.add(newCoursework);
            addCoursework(requirements);
            cbCourseworks.addItem(newCoursework);
            allCourseworks.writeCourseworkList();

            jtfCourseworkName.setText("");
            jtfDueDate.setText("");
            jtaRequirements.setText("");
        }
    }

    private void deleteCoursework() {
        
        //to be implemented
        
    }

}
