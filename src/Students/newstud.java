/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import config.dbconnector;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author entac
 */
public class newstud extends javax.swing.JFrame {

    /**
     * Creates new form newstud
     */
    public newstud() {
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

        jPanel1 = new javax.swing.JPanel();
        lblback = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txttag = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtsec = new javax.swing.JTextField();
        txtlast = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtguard = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtgrade = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblback.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        lblback.setText("[Back]");
        lblback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackMouseClicked(evt);
            }
        });
        jPanel1.add(lblback, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 20));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setText("Student Entry");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("DOB");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Grade Level & Section");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jLabel11.setText("Parent/Guardian");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jLabel12.setText("Mobile #");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 20));

        lbl.setText("Address");
        jPanel2.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setText("Last Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setText("M.I");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Contact Information");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jLabel7.setText("First Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Basic Information");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setText("RFID Tag#");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel14.setText("Grade Level");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jLabel15.setText("Section");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, 20));
        jPanel2.add(txttag, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 258, 31));
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 258, 29));
        jPanel2.add(txtsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 247, 31));
        jPanel2.add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 258, 29));
        jPanel2.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 258, 29));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 258, 29));
        jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 258, 29));
        jPanel2.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 258, 29));
        jPanel2.add(txtguard, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 247, 31));
        jPanel2.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 247, 31));
        jPanel2.add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 247, 60));
        jPanel2.add(txtgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 247, 31));

        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 80, -1));

        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseClicked
      addstud op = new addstud();
      
      op.setVisible(true);
      this.dispose();
      
    }//GEN-LAST:event_lblbackMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
     
        dbconnector con = new dbconnector();
        
        try{
            
            
            String tag = txttag.getText();
            String id = txtid.getText();
            String last	= txtlast.getText();
            String mid  = txtmid.getText();
            String first = txtname.getText();
            String grade = txtgrade.getText();
            String sec = txtsec.getText();
            String dob	= txtdob.getText();
            String sex = txtgender.getText();
            String guard = txtguard.getText();
            String mobile = txtmobile.getText();
            String add = txtadd.getText();
            
            String sql = "INSERT INTO tbl_students(s_id, s_tag, s_last, s_mi, s_name, s_section, s_grade, s_bday, s_gender, s_mobile, s_guard, s_add) VALUES ('"+id+"','"+tag+"','"+last+"','"+mid+"','"+first+"','"+sec+"','"+grade+"','"+dob+"','"+sex+"','"+mobile+"','"+guard+"','"+add+"')";
           
            Statement stmt = con.connect.createStatement();
            int row = stmt.executeUpdate(sql);
            
            if(row > 0 ){
                JOptionPane.showMessageDialog(null,"Student Saved");
                
                txttag.setText("");
                txtid.setText("");
                txtlast.setText("");
                txtmid.setText("");
                txtname.setText("");
                txtgrade.setText("");
                txtsec.setText("");
                txtdob.setText("");
                txtgender.setText("");
                txtguard.setText("");
                txtmobile.setText("");
                txtadd.setText("");     
            }else{
                JOptionPane.showMessageDialog(null,"Null");
            }
            
       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
           
       }
           
    }//GEN-LAST:event_saveMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        addstud op = new addstud();
        
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newstud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblback;
    private javax.swing.JButton save;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txtguard;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsec;
    private javax.swing.JTextField txttag;
    // End of variables declaration//GEN-END:variables
}
