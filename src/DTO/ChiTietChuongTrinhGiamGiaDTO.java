
package DTO;


public class ChiTietChuongTrinhGiamGiaDTO {
    private int IDGiamgia;
     private int IDsp;
     private Double NDChuongTrinhGiamGia;

    public ChiTietChuongTrinhGiamGiaDTO() {
    }

    public ChiTietChuongTrinhGiamGiaDTO(int IDGiamgia, int IDsp, Double NDChuongTrinhGiamGia) {
        this.IDGiamgia = IDGiamgia;
        this.IDsp = IDsp;
        this.NDChuongTrinhGiamGia = NDChuongTrinhGiamGia;
    }

    public int getIDGiamgia() {
        return IDGiamgia;
    }

    public void setIDGiamgia(int IDGiamgia) {
        this.IDGiamgia = IDGiamgia;
    }

    public int getIDsp() {
        return IDsp;
    }

    public void setIDsp(int IDsp) {
        this.IDsp = IDsp;
    }

    public Double getNDChuongTrinhGiamGia() {
        return NDChuongTrinhGiamGia;
    }

    public void setNDChuongTrinhGiamGia(Double NDChuongTrinhGiamGia) {
        this.NDChuongTrinhGiamGia = NDChuongTrinhGiamGia;
    }
    
}
