/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ToanPC
 */
public class TTMua {
    private String IDDonHang;
   private String IDSanPham;
   private String TenSanPham;
   private String GiaTien1SanPham;
   private String SoLuong;

    public TTMua(String IDDonHang, String IDSanPham, String TenSanPham, String GiaTien1SanPham, String SoLuong) {
        this.IDDonHang = IDDonHang;
        this.IDSanPham = IDSanPham;
        this.TenSanPham = TenSanPham;
        this.GiaTien1SanPham = GiaTien1SanPham;
        this.SoLuong = SoLuong;
    }

    public TTMua(String IDSanPham, String TenSanPham, String GiaTien1SanPham, String SoLuong) {
        this.IDSanPham = IDSanPham;
        this.TenSanPham = TenSanPham;
        this.GiaTien1SanPham = GiaTien1SanPham;
        this.SoLuong = SoLuong;
    }

    public void setIDDonHang(String IDDonHang) {
        this.IDDonHang = IDDonHang;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public void setGiaTien1SanPham(String GiaTien1SanPham) {
        this.GiaTien1SanPham = GiaTien1SanPham;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getIDDonHang() {
        return IDDonHang;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public String getGiaTien1SanPham() {
        return GiaTien1SanPham;
    }

    public String getSoLuong() {
        return SoLuong;
    }
   
    
}
