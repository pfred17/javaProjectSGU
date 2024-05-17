package DAO;

import DTO.ChiTietHoaDonDTO;
import java.sql.*;
import connectionDB.SQLServerConnection;
import java.util.ArrayList;
public class ChiTietHoaDonDAO {
    public ArrayList<ChiTietHoaDonDTO> getDataFromSQL() {
        ArrayList<ChiTietHoaDonDTO> list = new ArrayList<>();
        try {
            Connection connection = SQLServerConnection.getConnection();
            Statement state = connection.createStatement();
            ResultSet rs = state.executeQuery("select * from ChiTietHoaDon");
            
            while (rs.next()) {
                String IDHoaDon = rs.getString("IDHoaDOn");
                String IDSanPham = rs.getString("IDSanPham");
                int SoLuong = rs.getInt("SoLuong");
                double DonGia = rs.getDouble("DonGia");
                double ThanhTien = rs.getDouble("ThanhTien");
                double TienGiamGia = rs.getDouble("TienGiamGia");
                String IDChiTietHoaDon = rs.getString("IDChiTietHoaDon");
                int TrangThaiChiTietHD = rs.getInt("TrangThaiChiTietHD");
                
                list.add(new ChiTietHoaDonDTO(IDHoaDon,IDChiTietHoaDon ,IDSanPham, SoLuong, DonGia, ThanhTien, TienGiamGia, TrangThaiChiTietHD));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int addChiTietHoaDon(ChiTietHoaDonDTO chiTietHoaDon) {
<<<<<<< HEAD
        String sqlQuery = "insert into ChiTietHoaDon(IDHoaDon, IDSanPham, SoLuong, DonGia, ThanhTien, TienGiamGia, IDChiTietHoaDon, TrangThaiChiTietHD) values(?, ?, ?, ?, ?, ?, ?, 0)";
=======
        String sqlQuery = "insert into ChiTietHoaDon(IDHoaDon, IDSanPham, SoLuong, DonGia, ThanhTien, TienGiamGia) values(?, ?, ?, ?, ?, ?)";
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);

            pr.setString(1, chiTietHoaDon.getIDHoaDon());
            pr.setString(2, chiTietHoaDon.getIDSanPham());
            pr.setInt(3, chiTietHoaDon.getSoLuong());
            pr.setDouble(4, chiTietHoaDon.getDonGia());
            pr.setDouble(5, chiTietHoaDon.getThanhTien());
            pr.setDouble(6, chiTietHoaDon.getTienGiamGia());
<<<<<<< HEAD
            pr.setString(7, chiTietHoaDon.getIDChiTietHoaDon());
=======
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332

            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
<<<<<<< HEAD
    
    public int deleteChiTietHoaDon(String IDChiTietHD) {
        String sqlQuery = "update ChiTietHoaDon set TrangThaiChiTietHD = 1 where IDChiTietHoaDon = ?";
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);

            pr.setString(1, IDChiTietHD);

            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int updateChiTietHoaDon(ChiTietHoaDonDTO chiTietHoaDonDTO) {
         String sqlQuery = "update HoaDon set IDSanPham = ?, SoLuong = ?, DonGia = ?, ThanhTien = ?, TienGiamGia = ? where IDChiTietHoaDon = ? ";

        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);

            pr.setString(1, chiTietHoaDonDTO.getIDSanPham());
            pr.setInt(2, chiTietHoaDonDTO.getSoLuong());
            pr.setDouble(3, chiTietHoaDonDTO.getThanhTien());
            pr.setDouble(4, chiTietHoaDonDTO.getTienGiamGia());

            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
=======
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
}
