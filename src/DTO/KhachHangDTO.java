/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Dell
 */
public class KhachHangDTO {
    private int IDKhachHang;
    private String HoKH;
    private String TenKh;
    private String SDT;
    private String Gmail;
    private String GioiTinh;
    private Double Tongchitieu;

    public KhachHangDTO() {
    }

    public KhachHangDTO(int IDKhachHang, String HoKH, String TenKh, String SDT, String Gmail, String GioiTinh, Double Tongchitieu) {
        this.IDKhachHang = IDKhachHang;
        this.HoKH = HoKH;
        this.TenKh = TenKh;
        this.SDT = SDT;
        this.Gmail = Gmail;
        this.GioiTinh = GioiTinh;
        this.Tongchitieu = Tongchitieu;
    }

    public int getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(int IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public String getHoKH() {
        return HoKH;
    }

    public void setHoKH(String HoKH) {
        this.HoKH = HoKH;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Double getTongchitieu() {
        return Tongchitieu;
    }

    public void setTongchitieu(Double Tongchitieu) {
        this.Tongchitieu = Tongchitieu;
    }
    
    
    
}
