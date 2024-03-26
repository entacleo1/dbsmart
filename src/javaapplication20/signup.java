
package javaapplication20;

import config.dbconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author entac
 */
public class signup extends javax.swing.JFrame {


  
    public signup() {
        initComponents();
   
    }
  
    
    public static boolean idValid(String id){
        dbconnector connector = new dbconnector();
        try{
            String query = "SELECT * FROM tbl_stake  WHERE u_id = '" + id +"'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
        }

    }
     public static boolean userValid(String user){
        dbconnector connector = new dbconnector();
        try{
            String query = "SELECT * FROM tbl_stake  WHERE u_user = '" + user +"'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
        }

        
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
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttag = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlast = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtpasscon = new javax.swing.JPasswordField();
        cmdsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblback.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        lblback.setText("[Back]");
        lblback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackMouseClicked(evt);
            }
        });
        jPanel1.add(lblback, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 50, 20));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 30));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel2.setText("TAG#");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel1.add(txttag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 30));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, 30));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel1.add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 220, 30));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 220, 30));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 30));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));
        jPanel1.add(txtpasscon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 220, 30));

        cmdsave.setText("Save");
        cmdsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdsaveMouseClicked(evt);
            }
        });
        jPanel1.add(cmdsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(555, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseClicked
       Login op = new Login();
       
       op.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_lblbackMouseClicked

    private void cmdsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdsaveMouseClicked
       if (!(txtpass.getText().equals(txtpasscon.getText()))) {
        JOptionPane.showMessageDialog(null, "Password don't Match");
    }else if(idValid(txtid.getText())){
        JOptionPane.showMessageDialog(null, "ID Already Exist");
    }else if(userValid(txtuser.getText())){
        JOptionPane.showMessageDialog(null, "Username Already Exist");
    }else{ 
        try{
            dbconnector con = new dbconnector();
        
            String id = txtid.getText();
            String tag = txttag.getText();
            String name = txtname.getText();
            String last = txtlast.getText();
            String user = txtuser.getText();
            String pass = txtpass.getText();
                    
             String sql = "INSERT INTO tbl_stake(u_id, u_tag, u_name, u_last, u_user, u_pass) VALUES ('"+id+"','"+tag+"','"+name+"','"+last+"','"+user+"','"+pass+"')" ;
             
            Statement stmt = con.connect.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Saved");
                
                txtid.setText("");
                txttag.setText("");
                txtname.setText("");
                txtlast.setText("");
                txtuser.setText("");
                txtpass.setText("");
                txtpasscon.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Null");
            }
            
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
       }
    }//GEN-LAST:event_cmdsaveMouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblback;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpasscon;
    private javax.swing.JTextField txttag;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}