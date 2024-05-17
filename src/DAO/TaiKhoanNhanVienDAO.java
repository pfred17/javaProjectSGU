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

            while (rs.next()) {
                String IDNhanVien = rs.getString("IDNhanVien");
                String matKhau = rs.getString("MatKhau");
                String TrangThai = rs.getString("TrangThaiTaiKhoan");
<<<<<<< HEAD

=======
                
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
                list.add(new TaiKhoanNhanVienDTO(IDNhanVien, matKhau, TrangThai));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
<<<<<<< HEAD

    // Hàm khởi tạo tài khoản nhân viên (chưa được cấp tài khoản)
    public int createTaiKhoanNhanVien(String IDNhanVien) {
        String sqlQuery = "insert into TaiKhoanNhanVien(IDNhanVien, MatKhau, TrangThaiTaiKhoan)"
                + "values(?, 123456, 0)";
=======
    
    // Hàm khởi tạo tài khoản nhân viên (chưa được cấp tài khoản)
    public int createTaiKhoanNhanVien(String IDNhanVien) {
        String sqlQuery = "insert into TaiKhoanNhanVien(IDNhanVien, MatKhau, TrangThaiTaiKhoan)"
                        + "values(?, 123456, 0)";
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);

            pr.setString(1, IDNhanVien);
<<<<<<< HEAD

=======
            
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Hàm thêm\cấp tài khoản nhân viên
    public int addTaiKhoanNhanVien(String IDNhanVien) {
        String sqlQuery = "update TaiKhoanNhanVien set TrangThaiTaiKhoan = 1 where IDNhanVien = ?";
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);

            pr.setString(1, IDNhanVien);

            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Hàm khóa tài khoản nhân viên
    public int blockTaiKhoanNhanVien(String IDNhanVien) {
        String sqlQuery = "update TaiKhoanNhanVien set TrangThaiTaiKhoan = 2 where IDNhanVien = ?";
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);

            pr.setString(1, IDNhanVien);

            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Sửa thông tin tài khoản nhân viên
    public int updateTaiKhoanNhanVien(TaiKhoanNhanVienDTO taiKhoan) {
        String sqlQuery = "update TaiKhoanNhanVien set MatKhau = ? where IDNhanVien = ?";

        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);

            pr.setString(1, taiKhoan.getIDNhanVien());

            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
<<<<<<< HEAD
=======
    
    // Hàm thêm\cấp tài khoản nhân viên
    public int addTaiKhoanNhanVien(String IDNhanVien) {
        String sqlQuery = "update TaiKhoanNhanVien set TrangThaiTaiKhoan = 1 where IDNhanVien = ?";
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);
                
            pr.setString(1, IDNhanVien);
            
            return pr.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    // Hàm khóa tài khoản nhân viên
    public int blockTaiKhoanNhanVien(String IDNhanVien) {
        String sqlQuery = "update TaiKhoanNhanVien set TrangThaiTaiKhoan = 2 where IDNhanVien = ?";
        try {
            Connection connection = SQLServerConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement(sqlQuery);
                
            pr.setString(1, IDNhanVien);
            
            return pr.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    // Sửa thông tin tài khoản nhân viên
    public boolean updateTaiKhoanNhanVien(TaiKhoanNhanVienDTO taiKhoan) {
//        String sqlQuery = "update TaiKhoanNhanVien set "
    

        return true;
    }
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
}
