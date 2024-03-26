/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Dell
 */
public class ChuongTrinhGiamGiaDTO {
    private int IDGiamgia;
    private String TenCT;
    private String LoaiCT;
    private String ThoiGianKhoidau;
    private String ThoiGianKetthuc;

    public ChuongTrinhGiamGiaDTO() {
    }

    public ChuongTrinhGiamGiaDTO(int IDGiamgia, String TenCT, String LoaiCT, String ThoiGianKhoidau, String ThoiGianKetthuc) {
        this.IDGiamgia = IDGiamgia;
        this.TenCT = TenCT;
        this.LoaiCT = LoaiCT;
        this.ThoiGianKhoidau = ThoiGianKhoidau;
        this.ThoiGianKetthuc = ThoiGianKetthuc;
    }

    public int getIDGiamgia() {
        return IDGiamgia;
    }

    public void setIDGiamgia(int IDGiamgia) {
        this.IDGiamgia = IDGiamgia;
    }

    public String getTenCT() {
        return TenCT;
    }

    public void setTenCT(String TenCT) {
        this.TenCT = TenCT;
    }

    public String getLoaiCT() {
        return LoaiCT;
    }

    public void setLoaiCT(String LoaiCT) {
        this.LoaiCT = LoaiCT;
    }

    public String getThoiGianKhoidau() {
        return ThoiGianKhoidau;
    }

    public void setThoiGianKhoidau(String ThoiGianKhoidau) {
        this.ThoiGianKhoidau = ThoiGianKhoidau;
    }

    public String getThoiGianKetthuc() {
        return ThoiGianKetthuc;
    }

    public void setThoiGianKetthuc(String ThoiGianKetthuc) {
        this.ThoiGianKetthuc = ThoiGianKetthuc;
    }
    
    
}
