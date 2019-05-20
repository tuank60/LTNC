/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DonHang;
import Model.MyConnect;
import com.mysql.cj.xdevapi.Result;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HaiNguyen
 */
public class DonHangControler {
    MyConnect mycon=null;
    ArrayList<DonHang> listdonhang;
    Statement st;
    ResultSet rs;
    DonHang donhang;
    private PreparedStatement ps;
    public DonHangControler() {
        mycon=new MyConnect();
    }
    public ArrayList<DonHang> getListdonhang() 
    {
         listdonhang=new ArrayList<DonHang>();
        String sql="SELECT * FROM quanlybanhang.donhang";
        try {
           
                 st=mycon.getConnection().createStatement();
                 rs=st.executeQuery(sql);
                 while (rs.next())
                 {
                     donhang=new DonHang(rs.getString("MaDonHang"), rs.getString("MaKhachHang"),rs.getString("TongTien"), rs.getDate("NgayBan"), rs.getString("BinhLuan"), rs.getString("IDQuanLy"));
                     listdonhang.add(donhang);
                 }
        } catch (SQLException ex) {
            Logger.getLogger(DonHangControler.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                 Logger.getLogger(DonHangControler.class.getName()).log(Level.SEVERE, null, ex);
        }
                
   
        return listdonhang;
    }
     public ArrayList<DonHang> getListdonhang(String madonhang,String makhachhang)
    {
        
        listdonhang=new ArrayList<DonHang>();
        if(makhachhang=="")
        {
        String sql="SELECT * FROM quanlybanhang.donhang WHERE MaDonHang = '"+madonhang+"'";
        try {
           
                 st=mycon.getConnection().createStatement();
                 rs=st.executeQuery(sql);
                 while (rs.next())
                 {
                     donhang=new DonHang(rs.getString("MaDonHang"), rs.getString("MaKhachHang"),rs.getString("TongTien"), rs.getDate("NgayBan"), rs.getString("BinhLuan"), rs.getString("IDQuanLy"));
                     listdonhang.add(donhang);
                 }
        } catch (SQLException ex) {
            Logger.getLogger(DonHangControler.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                 Logger.getLogger(DonHangControler.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        }
        if(madonhang=="")
        {
             String sql="SELECT * FROM quanlybanhang.donhang WHERE MaKhachHang = '"+makhachhang+"'";
        try {
           
                 st=mycon.getConnection().createStatement();
                 rs=st.executeQuery(sql);
                 while (rs.next())
                 {
                     donhang=new DonHang(rs.getString("MaDonHang"), rs.getString("MaKhachHang"),rs.getString("TongTien"), rs.getDate("NgayBan"), rs.getString("BinhLuan"), rs.getString("IDQuanLy"));
                     listdonhang.add(donhang);
                 }
        } catch (SQLException ex) {
            Logger.getLogger(DonHangControler.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                 Logger.getLogger(DonHangControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return listdonhang;
    }
      
    public void show_donhang_on_table(ArrayList<DonHang>listDH,DefaultTableModel model)
    {
        
        for (int i = 0; i < listDH.size(); i++) {
            Object donhang[]={listDH.get(i).getMaDonHang(),listDH.get(i).getMaKhachHang(),listDH.get(i).getTongTien(),listDH.get(i).getNgayBan(),listDH.get(i).getBinhLuan(),listDH.get(i).getIDQuanLy()};
            model.addRow(donhang);
        }
    }
    
    public boolean addDonHang(String MaKhachHang, String TongTien, String NgayBan, String BinhLuan,int IDQuanLy) {

        try {
            //Thêm một sản phẩm vào trong cơ sở dữ liệu
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String vNB = dateFormat.format(NgayBan);
            String sqlCommand = "INSERT INTO quanlybanhang.DonHang(MaKhachHang, TongTien, NgayBan, BinhLuan, IDQuanLy)  VALUES (?, ?, ?, ?, ?)";
            ps = mycon.getConnection().prepareStatement(sqlCommand);
            ps.setString(1, MaKhachHang);
            ps.setString(2, TongTien);
            ps.setString(3, NgayBan);
            ps.setString(4, BinhLuan);
            ps.setInt(5, IDQuanLy);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
