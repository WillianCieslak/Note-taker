package coursework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Willian Cieslak
 */
public class Main extends javax.swing.JFrame {

    CommonCode cc = new CommonCode();
    ArrayList<String> note = new ArrayList<>();
    public ArrayList<String> courses = new ArrayList<>();
    String crse = "";
    AllNotes allNotes = new AllNotes(this);
    AllCourses allCourses = new AllCourses();
    String newCourse = "";

    public Main() {

        model();
        initComponents();
        controller();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaNewNote = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaAllNotes = new javax.swing.JTextArea();
        cbCourses = new javax.swing.JComboBox<>();
        btnNewNote = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        btnAddCourse = new javax.swing.JButton();
        jlNotes = new javax.swing.JLabel();
        jtfAddCourse = new javax.swing.JTextField();
        lblNewNotes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuDeleteCourse = new javax.swing.JMenuItem();
        jMenuCoursework = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setTitle("Coursework - Willian Cieslak  // 000990795 - wc7377c");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtaNewNote.setColumns(20);
        jtaNewNote.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaNewNote.setRows(5);
        jScrollPane2.setViewportView(jtaNewNote);

        jtaAllNotes.setEditable(false);
        jtaAllNotes.setColumns(20);
        jtaAllNotes.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaAllNotes.setRows(5);
        jScrollPane3.setViewportView(jtaAllNotes);

        cbCourses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCourses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCoursesItemStateChanged(evt);
            }
        });
        cbCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCoursesActionPerformed(evt);
            }
        });

        btnNewNote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNewNote.setText("New Note");
        btnNewNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewNoteActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jtfSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfSearch.setToolTipText("");
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        btnAddCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddCourse.setText("Add Course");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        jlNotes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlNotes.setText("NOTES:");

        jtfAddCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNewNotes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNewNotes.setText("New Notes:");

        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cbCourses, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnNewNote, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jtfSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnAddCourse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jlNotes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jtfAddCourse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblNewNotes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewNotes))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jlNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCourse)
                    .addComponent(cbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNotes)
                    .addComponent(lblNewNotes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewNote))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        //for (String crse : allCourses.courseList) {
            //            cbCourses.addItem(crse);
            //        }

        jMenu1.setText("File");

        jMenuSave.setText("Save File");
        jMenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSave);
        jMenu1.add(jSeparator1);

        jMenuDeleteCourse.setText("Delete Course");
        jMenuDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteCourseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDeleteCourse);

        jMenuCoursework.setText("Coursework Screen");
        jMenuCoursework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCourseworkActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCoursework);
        jMenu1.add(jSeparator2);

        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Edit text");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String lyst = allNotes.searchAllNotesByKeyword("", 0, jtfSearch.getText());
        jtaAllNotes.setText(lyst);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        newCourse = jtfAddCourse.getText().toString();

        if (newCourse.equals("")) {
            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(null, "Course name cannot be blank", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            jtfAddCourse.setText("");
            allCourses.courses.add(newCourse);
            addCourse(newCourse);
            cbCourses.addItem(newCourse);

            //JOptionPane.showMessageDialog(null, "Course added!");
        }
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnNewNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewNoteActionPerformed
        // TODO add your handling code here:

        addNote(jtaNewNote.getText());
        jtaNewNote.setText("");

    }//GEN-LAST:event_btnNewNoteActionPerformed

    private void cbCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCoursesActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jtaAllNotes.setEditable(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveActionPerformed
        // TODO add your handling code here:

        String notes = jtaAllNotes.getText().toString();
        jtaAllNotes.setText("");

        allNotes.allNotes.clear();

        addNote(notes);
        jtaAllNotes.setEditable(false);

        JOptionPane.showMessageDialog(null, "File Saved!");
    }//GEN-LAST:event_jMenuSaveActionPerformed

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void cbCoursesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCoursesItemStateChanged
        // TODO add your handling code here:
        if (cbCourses.equals(null)) {
            System.out.println("Problem!");
        } else {
            loadNotesFromCourse();
        }
    }//GEN-LAST:event_cbCoursesItemStateChanged

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuCourseworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCourseworkActionPerformed
        // TODO add your handling code here:
        CourseworkScreen cs = new CourseworkScreen();
        cs.setVisible(true);
    }//GEN-LAST:event_jMenuCourseworkActionPerformed

    private void jMenuDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteCourseActionPerformed
        // TODO add your handling code here:

        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this course ?", "", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.out.println(allCourses.courseList);

            allCourses.courseList.remove(cbCourses.getSelectedIndex());

            allCourses.writeAllCourses();
            //addAllCourses();
            JOptionPane.showMessageDialog(null, "Course deleted. Reset the program to update the changes");
        } else {
            JOptionPane.showMessageDialog(null, "No changes have been made");
        }
    }//GEN-LAST:event_jMenuDeleteCourseActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        JOptionPane.showMessageDialog(null, "Willian Cieslak - wc7377c");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnNewNote;
    private javax.swing.JButton btnSearch;
    public javax.swing.JComboBox<String> cbCourses;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCoursework;
    private javax.swing.JMenuItem jMenuDeleteCourse;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel jlNotes;
    private javax.swing.JTextArea jtaAllNotes;
    private javax.swing.JTextArea jtaNewNote;
    private javax.swing.JTextField jtfAddCourse;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JLabel lblNewNotes;
    // End of variables declaration//GEN-END:variables

    protected void model() {
        try {
            System.out.println(allCourses.readAllCourses());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void controller() {
        addAllCourses();
        addAllNotes();

    }

    private void addNote(String text) {
        allNotes.addNote(allNotes.getMaxID(), cbCourses.getSelectedItem().toString(), text);
        addAllNotes();
    }

    private void addAllNotes() {
        String txtNotes = "";

        for (Note n : allNotes.getAllNotes()) {
            txtNotes += n.getNote() + "\n";
        }

        jtaAllNotes.setText(txtNotes);
    }

    private void addCourse(String newCourse) {
        allCourses.newCourseFile(newCourse);
        allCourses.writeAllCourses();
    }

    private void addAllCourses() {

        for (String crse : allCourses.courseList) {
            cbCourses.addItem(crse);
        }

    }

    private void loadNotesFromCourse() {
        String course = cbCourses.getSelectedItem().toString();
        allNotes.readNotesFromCourse(course.trim());
        addAllNotes();
    }

}
