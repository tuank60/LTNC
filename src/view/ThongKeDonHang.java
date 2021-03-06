/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.MyConnect;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import static com.itextpdf.text.Font.ITALIC;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Halam
 */
public class ThongKeDonHang extends javax.swing.JFrame {

    private MyConnect myConn;
    private PreparedStatement ps;
    private ResultSet rs;
    /**
     * Creates new form GDThongKeDonHang
     */
    public ThongKeDonHang() {
        initComponents();
        this.setTitle("QUẢN LÝ BÁN HÀNG");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        myConn = new MyConnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("THỐNG KÊ ĐƠN HÀNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Theo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Quản lý", "Khách hàng", "Ngày bán", "Tổng số tiền" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Chi tiết", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Trở lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xuất file");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
            //Thống kê theo ID quản lý (mỗi quản lý bán được bao nhiêu đơn)
        if (jComboBox1.getSelectedIndex() == 0) {
            String sql = "SELECT IDQuanLy,COUNT(IDQuanLy) AS Count FROM quanlybanhang.DonHang GROUP BY IDQuanLy";
            try {
                ps = myConn.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                Vector cols = new Vector();
                Vector data = new Vector();
                cols.add("ID quản lý");
                cols.add("Số đơn hàng");
                while (rs.next()) {

                    Vector s = new Vector();
                    s.add(rs.getString("IDQL"));
                    s.add(rs.getInt("Count"));
                    data.add(s);
                    jTable1.setModel(new DefaultTableModel(data, cols));
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }                                           
    //Thống kê theo khách hàng (mỗi khách hàng có bao nhiêu đơn - mua mấy lần)
    if(jComboBox1.getSelectedIndex()==1) {
        String sql = "SELECT KhachHang, COUNT(KhachHang) AS Count FROM quanlybanhang.DonHang GROUP BY KhachHang";
        try {
                ps = myConn.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                Vector cols = new Vector();
                Vector data = new Vector();
                cols.add("ID Khách hàng");
                cols.add("Số đơn mua hàng");
                while (rs.next()) {

                    Vector s = new Vector();
                    s.add(rs.getString("KhachHang"));
                    s.add(rs.getInt("Count"));
                    data.add(s);
                    jTable1.setModel(new DefaultTableModel(data, cols));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    //Thống kê theo ngày bán (Số đơn hàng trong 1 ngày bán)
    if (jComboBox1.getSelectedIndex() == 2) {
            String sql = "SELECT NgayBan,COUNT(NgayBan) AS Count FROM quanlybanhang.DonHang GROUP BY NgayBan";
            try {
                ps = myConn.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                Vector cols = new Vector();
                Vector data = new Vector();
                cols.add("Ngày bán");
                cols.add("Số lượng đơn ");
                while (rs.next()) {

                    Vector s = new Vector();
                    s.add(rs.getString("NgayBan"));
                    s.add(rs.getInt("Count"));
                    data.add(s);
                    jTable1.setModel(new DefaultTableModel(data, cols));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    //Thống kê theo giá tiền ( Số đơn cùng giá tiền)
    if (jComboBox1.getSelectedIndex() == 3) {
            String sql = "SELECT TongTien,COUNT(TongTien) AS Count FROM quanlybanhang.DonHang GROUP BY TongTien";
            try {
                ps = myConn.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                Vector cols = new Vector();
                Vector data = new Vector();
                cols.add("Tổng số tiền");
                cols.add("Số lượng đơn");
                while (rs.next()) {

                    Vector s = new Vector();
                    s.add(rs.getString("TongTien"));
                    s.add(rs.getInt("Count"));
                    data.add(s);
                    jTable1.setModel(new DefaultTableModel(data, cols));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            this.dispose();
            Home mf = new Home();
            mf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDonHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ThongKeDonHang.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        if (model1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa có dữ liệu để xuất file !");
        } else {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter ft = new FileNameExtensionFilter("PDF Documents", "pdf");
            chooser.addChoosableFileFilter(ft);
            int returnVal = chooser.showSaveDialog(this);
            if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                try {
                    String fileName = chooser.getSelectedFile().getName();
                    String dir = chooser.getCurrentDirectory().toString();
                    File f = new File(dir + "\\" + fileName + ".pdf");

                    if (f.exists()) {
                        JOptionPane.showMessageDialog(this, "Tên file đã tồn tại, mời bạn chọn tên khác !");
                    } else {
                        Document document = new Document(PageSize.A4, 50, 50, 10, 50);
                        PdfWriter writer;
                        writer = PdfWriter.getInstance(document, new FileOutputStream(dir + "\\" + fileName + ".pdf"));
                        document.open();

                        Font f1 = new Font(BaseFont.createFont("/assets/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                        f1.setSize(10);
                        f1.setColor(BaseColor.BLACK);
                        document.add(new Paragraph("QUẢN LÝ BÁN HÀNG\n         IN ẤN THỐNG KÊ", f1));

                        Font f2 = new Font(BaseFont.createFont("/assets/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                        f2.setSize(16);
                        f2.setColor(BaseColor.BLACK);
                        Paragraph p = new Paragraph("THỐNG KÊ ĐƠN HÀNG", f2);
                        p.setAlignment(Element.ALIGN_CENTER);
                        document.add(p);

                        Font f5 = new Font(BaseFont.createFont("/assets/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                        f5.setSize(8);
                        f5.setColor(BaseColor.BLACK);
                        f5.setStyle(ITALIC);

                        Font f3 = new Font(BaseFont.createFont("/assets/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                        f3.setSize(8);
                        f3.setColor(BaseColor.BLACK);

                        Font f6 = new Font(BaseFont.createFont("/assets/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                        f6.setSize(8);
                        f6.setColor(BaseColor.BLACK);
                        f6.setStyle(ITALIC);

                        Font f7 = new Font(BaseFont.createFont("/assets/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                        f7.setSize(8);
                        f7.setColor(BaseColor.BLACK);
                        PdfPTable t1 = new PdfPTable(new float[]{1, 1});
                        t1.setWidthPercentage(100);
                        t1.setTotalWidth(1200);
                        t1.setSpacingBefore(0);
                        t1.setSpacingAfter(0);
                        if (jComboBox1.getSelectedIndex() == 0) {
                            Paragraph p5 = new Paragraph("Thống kê đơn theo ID Quản lý\n\n", f6);
                            p5.setAlignment(Element.ALIGN_LEFT);
                            document.add(p5);
                            PdfPCell c11 = new PdfPCell(new Phrase("ID Quản Lý", f7));
                            t1.addCell(c11);
                            PdfPCell c12 = new PdfPCell(new Phrase("Số Lượng Đơn", f7));
                            t1.addCell(c12);
                        }
                        if (jComboBox1.getSelectedIndex() == 1) {
                            Paragraph p5 = new Paragraph("Thống kê đơn theo khách hàng\n\n", f6);
                            p5.setAlignment(Element.ALIGN_LEFT);
                            document.add(p5);
                            PdfPCell c11 = new PdfPCell(new Phrase("Khách hàng", f7));
                            t1.addCell(c11);
                            PdfPCell c12 = new PdfPCell(new Phrase("Số Lượng Đơn", f7));
                            t1.addCell(c12);
                        }
                        if (jComboBox1.getSelectedIndex() == 2) {
                            Paragraph p5 = new Paragraph("Thống kê đơn theo ngày bán\n\n", f6);
                            p5.setAlignment(Element.ALIGN_LEFT);
                            document.add(p5);
                            PdfPCell c11 = new PdfPCell(new Phrase("Ngày bán", f7));
                            t1.addCell(c11);
                            PdfPCell c12 = new PdfPCell(new Phrase("Số Lượng Đơn", f7));
                            t1.addCell(c12);
                        }
                        if(jComboBox1.getSelectedIndex()==3) {
                            Paragraph p5 = new Paragraph("Thống kê đơn theo Giá tiền\n\n",f6);
                            p5.setAlignment(Element.ALIGN_LEFT);
                            document.add(p5);
                            PdfPCell c11 = new PdfPCell(new Phrase("Giá tiền", f7));
                            t1.addCell(c11);
                            PdfPCell c12 = new PdfPCell(new Phrase("Số Lượng Đơn", f7));
                            t1.addCell(c12);
                        }

                        for (int i = 0; i < model1.getRowCount(); i++) {
                            t1.addCell(new Phrase(model1.getValueAt(i, 0).toString(), f3));
                            t1.addCell(new Phrase(model1.getValueAt(i, 1).toString(), f3));
                        }
                        document.add(t1);

                        Calendar cal = new GregorianCalendar();
                        int year = cal.get(Calendar.YEAR);
                        int month = cal.get(Calendar.MONTH);
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        String date = (day + "/" + (month + 1) + "/" + year);
                        Font f4 = new Font(BaseFont.createFont("/assets/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                        f4.setSize(10);
                        f4.setColor(BaseColor.BLACK);
                        Paragraph p1 = new Paragraph("\nHà Nội , " + date, f4);
                        p1.setAlignment(Element.ALIGN_RIGHT);
                        document.add(p1);

                        document.close();
                        JOptionPane.showMessageDialog(this, "Lưu file thành công !");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hủy bỏ !");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(ThongKeDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
