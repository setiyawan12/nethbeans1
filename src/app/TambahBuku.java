/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author setiyawan
 */
public class TambahBuku extends javax.swing.JPanel {

    /**
     * Creates new form TambahBuku
     */
    public TambahBuku() {
        initComponents();
        loadPenerbit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPenulis = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEdisi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbPenerbit = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtHalaman = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSubjek = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(new java.awt.GridLayout());

        kGradientPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("Judul Buku");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(133, 262, 0, 0);
        kGradientPanel1.add(jLabel11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(138, 18, 0, 256);
        kGradientPanel1.add(txtJudul, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setText("Penulis");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 262, 0, 0);
        kGradientPanel1.add(jLabel12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 18, 0, 256);
        kGradientPanel1.add(txtPenulis, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Edisi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 262, 0, 0);
        kGradientPanel1.add(jLabel13, gridBagConstraints);

        txtEdisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdisiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 18, 0, 256);
        kGradientPanel1.add(txtEdisi, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("Penerbit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 262, 0, 0);
        kGradientPanel1.add(jLabel14, gridBagConstraints);

        cmbPenerbit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 179;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 18, 0, 256);
        kGradientPanel1.add(cmbPenerbit, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("ISBN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 262, 0, 0);
        kGradientPanel1.add(jLabel15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 18, 0, 256);
        kGradientPanel1.add(txtISBN, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setText("Halaman");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 262, 0, 0);
        kGradientPanel1.add(jLabel16, gridBagConstraints);

        txtHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHalamanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 18, 0, 256);
        kGradientPanel1.add(txtHalaman, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setText("Subjek");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 262, 0, 0);
        kGradientPanel1.add(jLabel17, gridBagConstraints);

        txtSubjek.setColumns(20);
        txtSubjek.setRows(5);
        jScrollPane1.setViewportView(txtSubjek);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.ipady = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(38, 18, 0, 256);
        kGradientPanel1.add(jScrollPane1, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setText("SIMPAN DATA BUKU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(83, 6, 95, 0);
        kGradientPanel1.add(jButton1, gridBagConstraints);

        jPanel1.add(kGradientPanel1);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        simpanBuku();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHalamanActionPerformed

    private void txtEdisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdisiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPenerbit;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtEdisi;
    private javax.swing.JTextField txtHalaman;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenulis;
    private javax.swing.JTextArea txtSubjek;
    // End of variables declaration//GEN-END:variables

    private void loadPenerbit(){
        try {
            Connection c = Koneksi.MySQL();
            
            Statement st = c.createStatement();
            String q = "SELECT * FROM tb_publisher";
            ResultSet rs =st.executeQuery(q);
            
            Vector<Penerbit> p = new Vector<>();
            while(rs.next()){
                int id = rs.getInt(1);
                String Penerbit =rs.getNString(2);
                Penerbit pn =new Penerbit(id, Penerbit);
                p.addElement(pn);
                
            }
            cmbPenerbit.removeAllItems();
            cmbPenerbit.setModel(new DefaultComboBoxModel(p));
        } catch (SQLException e) {
            
        }
   
    }

    private void simpanBuku() {

        String _judul = txtJudul.getText();
        String _penulis = txtPenulis.getText();
        String _edisi = txtEdisi.getText();
        int _pub = ((Penerbit)cmbPenerbit.getSelectedItem()).getId();
        String _isbn = txtISBN.getText();
        String _halaman = txtHalaman.getText();
        String _subjek = txtSubjek.getText();
        
        if(_judul.isEmpty() || _penulis.isEmpty() || _edisi.isEmpty() || _isbn.isEmpty() || _halaman.isEmpty() || _subjek.isEmpty()){
            JOptionPane.showMessageDialog(this, "Lengkapi Data!");
        }else{
            try {
                Connection c = Koneksi.MySQL();
                String q = "INSERT INTO tb_books (book_title, book_author, book_edition, pub_id, book_isbn, book_page, book_subject) VALUES(?,?,?,?,?,?,?)";
                PreparedStatement ps = c.prepareStatement(q);
                ps.setString(1, _judul);
                ps.setString(2, _penulis);
                ps.setString(3, _edisi);
                ps.setInt(4, _pub);
                ps.setString(5, _isbn);
                ps.setString(6, _halaman);
                ps.setString(7, _subjek);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Sukses!");
                /*Statement st = c.createStatement();
                String q = "INSERT INTO tb_books VALUES("
                        + "'',"
                        + "'"+_judul+"',"
                        + ")";*/
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

}