/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Dell
 */
public class SanPhamDTO {
    private int IDsp;
    private String IDLoaisp;
    private String Tensp;
    private int Soluong;
    private Double Dongia;

    public SanPhamDTO() {
    }

    public SanPhamDTO(int IDsp, String IDLoaisp, String Tensp, int Soluong, Double Dongia) {
        this.IDsp = IDsp;
        this.IDLoaisp = IDLoaisp;
        this.Tensp = Tensp;
        this.Soluong = Soluong;
        this.Dongia = Dongia;
    }

    public int getIDsp() {
        return IDsp;
    }

    public void setIDsp(int IDsp) {
        this.IDsp = IDsp;
    }

    public String getIDLoaisp() {
        return IDLoaisp;
    }

    public void setIDLoaisp(String IDLoaisp) {
        this.IDLoaisp = IDLoaisp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public Double getDongia() {
        return Dongia;
    }

    public void setDongia(Double Dongia) {
        this.Dongia = Dongia;
    }
    
            
    
}
