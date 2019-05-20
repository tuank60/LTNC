/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MyConnect;
import Model.TTMua;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HaiNguyen
 */
public class TTMuaController {
    MyConnect mycon;
    ArrayList<TTMua> listttmua;
    TTMua myttmua;
    ResultSet rs;
    public TTMuaController() {
        mycon=new MyConnect();
        
    }
    public ArrayList<TTMua> getListTTMua(String madonhang)
    {
        try {
            listttmua=new ArrayList<TTMua>();
            String sql= "SELECT * From quanlybanhang.ttmua WHERE IDDonHang = '" + madonhang+ "'";
            Statement st = mycon.getConnection().createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next())
            {
   
               myttmua=new TTMua(rs.getString("IDSanPham"),rs.getString("TenSanPham"),rs.getString("GiaTien1SanPham"),rs.getString("SoLuong"));
                listttmua.add(myttmua);
                
            }
           
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (SQLException ex) {
              System.out.println(ex.getMessage());
            }
            return listttmua;
    }
    public void show_TTMua_on_table(ArrayList<TTMua> listttmua,DefaultTableModel model)
    {
        for (int i = 0; i < listttmua.size(); i++) {
            Object ttmua[]={listttmua.get(i).getIDSanPham(),listttmua.get(i).getTenSanPham(),listttmua.get(i).getGiaTien1SanPham(),listttmua.get(i).getSoLuong()};
            
            model.addRow(ttmua);
        }
        
    }

    
    
}
