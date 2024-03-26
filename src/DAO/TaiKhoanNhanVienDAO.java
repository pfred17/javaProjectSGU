package DAO;

import DTO.TaiKhoanNhanVienDTO;
import connectionDB.SQLServerConnection;
import java.sql.*;
import java.util.ArrayList;

public class TaiKhoanNhanVienDAO {
    
    public ArrayList<TaiKhoanNhanVienDTO> getDataFromSQL() {
        
        ArrayList<TaiKhoanNhanVienDTO> list = new ArrayList<>();
        try {
            Connection connection = SQLServerConnection.getConnection();
            Statement state = connection.createStatement();
            ResultSet rs = state.executeQuery("select * from TaiKhoanNhanVien");
            
            while(rs.next()) {
                String IDNhanVien = rs.getString("IDNhanVien");
                String matKhau = rs.getString("MatKhau");
                String LoaiNhanVien = rs.getString("LoaiNhanVien");
                String TrangThai = rs.getString("TrangThai");
                
                list.add(new TaiKhoanNhanVienDTO(IDNhanVien, matKhau, LoaiNhanVien, TrangThai));
            }
            
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int addTaiKhoanNhanVien(String IDNhanVien,String LoaiNhanVien) {
        String sqlQuery = "insert into TaiKhoanNhanVien(IDNhanVien, MatKhau, LoaiNhanVien, TrangThai)"
                        + "values(?, 123456, ?, on)";
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);
                
            pr.setString(1, IDNhanVien);
            pr.setString(2, LoaiNhanVien);
            
            return pr.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
}
