package DTO;

public class TaiKhoanNhanVienDTO {
    private String IDNhanVien;
    private String MatKhau;
    private String LoaiNhanVien;
    private String TrangThai;
    
    public TaiKhoanNhanVienDTO() {
        
    }

    public TaiKhoanNhanVienDTO(String IDNhanVien, String MatKhau, String LoaiNhanVien, String TrangThai) {
        this.IDNhanVien = IDNhanVien;
        this.MatKhau = MatKhau;
        this.LoaiNhanVien = LoaiNhanVien;
        this.TrangThai = TrangThai;
    }
    
   public TaiKhoanNhanVienDTO(String IDNhanVien, String TrangThai) {
        this.IDNhanVien = IDNhanVien;
        this.TrangThai = TrangThai;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getLoaiNhanVien() {
        return LoaiNhanVien;
    }

    public void setLoaiNhanVien(String LoaiNhanVien) {
        this.LoaiNhanVien = LoaiNhanVien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
