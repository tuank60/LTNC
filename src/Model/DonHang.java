/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ToanPC
 */
public class DonHang {
    private String MaDonHang;
    private String MaKhachHang;
    private String TongTien;
    private Date NgayBan;
    private String BinhLuan;
    private String IDQuanLy;

    public DonHang(String MaDonHang, String MaKhachHang, String TongTien, Date NgayBan, String BinhLuan, String IDQuanLy) {
        this.MaDonHang = MaDonHang;
        this.MaKhachHang = MaKhachHang;
        this.TongTien = TongTien;
        this.NgayBan = NgayBan;
        this.BinhLuan = BinhLuan;
        this.IDQuanLy = IDQuanLy;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public String getTongTien() {
        return TongTien;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public String getBinhLuan() {
        return BinhLuan;
    }

    public String getIDQuanLy() {
        return IDQuanLy;
    }

    public void setMaDonHang(String MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public void setNgayBan(Date NgayBan) {
        this.NgayBan = NgayBan;
    }

    public void setBinhLuan(String BinhLuan) {
        this.BinhLuan = BinhLuan;
    }

    public void setIDQuanLy(String IDQuanLy) {
        this.IDQuanLy = IDQuanLy;
    }
    
 
    
}
