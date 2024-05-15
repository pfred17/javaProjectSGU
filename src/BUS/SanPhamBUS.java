package BUS;

import BUS.ChiTietChuongTrinhGiamGiaBUS;
import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class SanPhamBUS {

    private ArrayList<SanPhamDTO> danhSachSanPham;
    private ArrayList<SanPhamDTO> gioHang;

    private SanPhamDAO sanPhamDAO;
    private ChiTietChuongTrinhGiamGiaBUS chiTietGGBUS;

    public SanPhamBUS() {
        sanPhamDAO = new SanPhamDAO();
//        chiTietGGBUS = new ChiTietChuongTrinhGiamGiaBUS();
        chiTietGGBUS = new ChiTietChuongTrinhGiamGiaBUS();
    }
    
    public SanPhamBUS(ChiTietChuongTrinhGiamGiaBUS chiTietBUS) {
        this.chiTietGGBUS = chiTietBUS;
    }

    public void loadData() {
        danhSachSanPham = sanPhamDAO.getDataFromSQL();
    }
    
    public ArrayList<SanPhamDTO> getArraySanPham() {
        ArrayList<SanPhamDTO> danhSachSanPham = sanPhamDAO.getDataFromSQL();
        return danhSachSanPham;
    }

    public String formatDonGia(double donGia) {
        Locale locale = new Locale("en", "EN");
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat
                .getNumberInstance(locale);
        decimalFormat.applyPattern(pattern);
        return decimalFormat.format(donGia);
    }

    public double getPhanTramGiamGiaByID(String IDSanPham) {
        return chiTietGGBUS.phanTramGiamGia(IDSanPham) / 100;
    }
}
