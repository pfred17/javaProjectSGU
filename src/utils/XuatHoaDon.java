package utils;

import DTO.ChiTietHoaDonDTO;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class XuatHoaDon {

    private String path;
    private String maKH;
    private String maNV;
    private String maHD;
    private String[][] danhSachChiTietHoaDon;

    public XuatHoaDon() {
    }

    public XuatHoaDon(String path, String maKH, String maNV, String maHD, String[][] danhSachChiTietHoaDon) {
        this.path = path;
        this.maKH = maKH;
        this.maNV = maNV;
        this.maHD = maHD;
        this.danhSachChiTietHoaDon = danhSachChiTietHoaDon;
    }

    public void inHoaDon(String path, String maKH, String maNV, String maHD, String[][] danhSachSanPham) {
        String url = "D:\\IT-SGU\\HK2_Nam2\\doAn\\javaProjectSGU\\src\\asset\\hoadon";
        try {
            PrintWriter pw = new PrintWriter(url + "\\" + path + ".txt", "UTF-8");
            pw.println("============== HÓA ĐƠN ==============");
            pw.println("============== THÔNG TIN ==============");
            pw.println("Mã khách hàng: " + maKH);
            pw.println("Mã nhân viên: " + maNV);
            pw.println("Mã hóa đơn: " + maHD);
            pw.println("============== SẢN PHẨM ==============");
            pw.println("Tên sản phẩm\t\t\tSố lượng\t\t\tĐơn giá\t\t\tKhuyến mãi\t\t\tThành tiền");
//            for (int i = 0; i < danhSachSanPham.length; i++) {
//                for (int j = 0; j < danhSachSanPham[i].length; j++) {
//                    // In phần tử của hàng i, cột j, và thêm các tab để căn chỉnh
//                    pw.print(danhSachSanPham[i][j] + "\t\t\t");
//                }
//                pw.println(); // Kết thúc hàng và di chuyển xuống dòng mới
//            }
            for (int i = 0; i < danhSachSanPham.length; i++) {
                for (int j = 0; j < danhSachSanPham[i].length; j++) {
                    // In phần tử của hàng i, cột j, và thêm các tab để căn chỉnh
                    pw.print(danhSachSanPham[i][j]);
                    // Kiểm tra độ dài của dữ liệu và thêm dấu xuống dòng nếu cần thiết
                    if (danhSachSanPham[i][j].length() > 20) { // Độ dài tùy chọn
                        pw.println(); // Xuống dòng nếu dữ liệu quá dài
                        pw.print("\t\t"); // Thêm các tab để căn chỉnh
                    } else {
                        pw.print("\t\t"); // Nếu không, thêm các tab bình thường
                    }
                }
                pw.println(); // Kết thúc hàng và di chuyển xuống dòng mới
            }
            pw.flush();
            pw.close();
            JOptionPane.showMessageDialog(null, "XUẤT HÓA ĐƠN THÀNH CÔNG");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
