package GUI;

<<<<<<< HEAD
import BUS.ChiTietHoaDonBUS;
import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.SanPhamBUS;
import DAO.SanPhamDAO;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.SanPhamDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
=======
import BUS.SanPhamBUS;
import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.util.ArrayList;
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332

import javax.swing.table.DefaultTableModel;
import utils.XuatHoaDon;

public class BanHangGUI extends javax.swing.JFrame {

    private String IDNhanVien;
    private String LoaiNhanVien;
    private SanPhamBUS sanPhamBUS;
    private SanPhamDAO sanPhamDAO;
<<<<<<< HEAD
    private HoaDonBUS hoaDonBUS;
    private ChiTietHoaDonBUS chiTietHoaDonBUS;
    private KhachHangBUS khachHangBUS;
=======
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
    private DefaultTableModel modelSanPham;
    private DefaultTableModel modelGioHang;
    private ArrayList<SanPhamDTO> danhSachGioHang;

    private XuatHoaDon xuatHoaDon;

    public BanHangGUI() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);

        sanPhamBUS = new SanPhamBUS();
        sanPhamDAO = new SanPhamDAO();
<<<<<<< HEAD
        hoaDonBUS = new HoaDonBUS();
        chiTietHoaDonBUS = new ChiTietHoaDonBUS();
        khachHangBUS = new KhachHangBUS();
=======
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        xuatHoaDon = new XuatHoaDon();

        tblSanPham.fixTable(jScrollPane1);
        tblGioHang.fixTable(jScrollPane2);
        modelSanPham = (DefaultTableModel) tblSanPham.getModel();
        modelGioHang = (DefaultTableModel) tblGioHang.getModel();
        danhSachGioHang = new ArrayList<>();

<<<<<<< HEAD
        lableMaHD.setText(hoaDonBUS.createAutoIDHoaDon());
        lableMaKH.setText(khachHangBUS.createAutoKhachHang());

        renderTableSanPham();
        renderTongTienGioHang();
    }

    public void renderTableSanPham() {
        ArrayList<SanPhamDTO> danhSachSanPham = sanPhamBUS.getArraySanPham();
        modelSanPham.setRowCount(0);
        for (SanPhamDTO sanPham : danhSachSanPham) {
            if (sanPham.getTrangThai() == 0) {
                modelSanPham.addRow(new Object[]{sanPham.getIDSanPham(), sanPham.getTenSanPham(), sanPham.getSoluong(), sanPhamBUS.formatDonGia(sanPham.getDonGia())});
            }
        }
    }

    public void renderTongTienGioHang() {
        double tien = 0;

        for (SanPhamDTO sanPham : danhSachGioHang) {
            tien += sanPham.getThanhTien();
        }

        lableTongTien.setText(sanPhamBUS.formatDonGia(tien));
    }

    // Hàm nhận dữ liệu user khi login
    public void setUserValueFromLoginGUI(String IDNhanVien, String LoaiNhanVien) {
        this.IDNhanVien = IDNhanVien;
        this.LoaiNhanVien = LoaiNhanVien;
        lableMaNV.setText(IDNhanVien);
    }

    public void handleThemGioHang(String IDSanPham, String TenSanPham, int soLuong, Double donGia, double ThanhTien) {
        for (SanPhamDTO sanPham : danhSachGioHang) {
            if (sanPham.getIDSanPham().equals(IDSanPham)) {
                sanPham.setSoLuongGioHang(sanPham.getSoLuongGioHang() + soLuong);
                sanPham.setThanhTien(sanPham.getSoLuongGioHang() * donGia - (sanPhamBUS.getPhanTramGiamGiaByID(IDSanPham) * sanPham.getSoLuongGioHang() * donGia));
                return;
            }
        }
        SanPhamDTO sanPham = new SanPhamDTO(IDSanPham, TenSanPham, soLuong, donGia, ThanhTien - (donGia * sanPhamBUS.getPhanTramGiamGiaByID(IDSanPham) * soLuong));
        danhSachGioHang.add(sanPham);
    }

    public void xoaSanPhamTrongGioHang(String IDSanPham) {
        for (int i = 0; i < danhSachGioHang.size(); i++) {
            SanPhamDTO sanPham = danhSachGioHang.get(i);
            if (sanPham.getIDSanPham().equals(IDSanPham)) {
                danhSachGioHang.remove(i);
                return;
            }
        }
    }

    public void renderTableGioHangForBanHangGUI(DefaultTableModel model) {
        model.setRowCount(0);
        if (danhSachGioHang != null) {
            for (SanPhamDTO sanPham : danhSachGioHang) {
                model.addRow(new Object[]{sanPham.getIDSanPham(), sanPham.getTenSanPham(), sanPham.getSoLuongGioHang(), sanPhamBUS.formatDonGia(sanPham.getDonGia()), sanPhamBUS.getPhanTramGiamGiaByID(sanPham.getIDSanPham()), sanPhamBUS.formatDonGia(sanPham.getThanhTien())});
            }
        }
=======
        renderTableSanPham();
        renderTongTienGioHang();
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
    }

    public void renderTableSanPham() {
        ArrayList<SanPhamDTO> danhSachSanPham = sanPhamBUS.getArraySanPham();
        modelSanPham.setRowCount(0);
        for (SanPhamDTO sanPham : danhSachSanPham) {
            modelSanPham.addRow(new Object[]{sanPham.getIDSanPham(), sanPham.getTenSanPham(), sanPham.getSoluong(), sanPhamBUS.formatDonGia(sanPham.getDongia())});
        }
    }

    public void renderTongTienGioHang() {
        double tien = 0;

        for (SanPhamDTO sanPham : danhSachGioHang) {
            tien += sanPham.getThanhTien();
        }

        System.out.println("Tong Tien = " + tien);

        lableTongTien.setText(sanPhamBUS.formatDonGia(tien));
    }

    // Hàm nhận dữ liệu user khi login
    public void setUserValueFromLoginGUI(String IDNhanVien, String LoaiNhanVien) {
        this.IDNhanVien = IDNhanVien;
        this.LoaiNhanVien = LoaiNhanVien;
        lableMaNV.setText(IDNhanVien);

    }

    public void handleThemGioHang(String IDSanPham, String TenSanPham, int soLuong, Double donGia, double ThanhTien) {
        for (SanPhamDTO sanPham : danhSachGioHang) {
            if (sanPham.getIDSanPham().equals(IDSanPham)) {
                sanPham.setSoLuongGioHang(sanPham.getSoLuongGioHang() + soLuong);
                sanPham.setThanhTien(sanPham.getSoLuongGioHang() * donGia - (sanPhamBUS.getPhanTramGiamGiaByID(IDSanPham) * sanPham.getSoLuongGioHang() * donGia));
                return;
            }
        }
        SanPhamDTO sanPham = new SanPhamDTO(IDSanPham, TenSanPham, soLuong, donGia, ThanhTien - (donGia * sanPhamBUS.getPhanTramGiamGiaByID(IDSanPham) * soLuong));
        danhSachGioHang.add(sanPham);
    }

    public void xoaSanPhamTrongGioHang(String IDSanPham) {
        for (int i = 0; i < danhSachGioHang.size(); i++) {
            SanPhamDTO sanPham = danhSachGioHang.get(i);
            if (sanPham.getIDSanPham().equals(IDSanPham)) {
                danhSachGioHang.remove(i);
                return;
            }
        }
    }

    public void renderTableGioHangForBanHangGUI(DefaultTableModel model) {
        model.setRowCount(0);
        if (danhSachGioHang != null) {
            for (SanPhamDTO sanPham : danhSachGioHang) {
                model.addRow(new Object[]{sanPham.getIDSanPham(), sanPham.getTenSanPham(), sanPham.getSoLuongGioHang(), sanPhamBUS.formatDonGia(sanPham.getDongia()), sanPhamBUS.getPhanTramGiamGiaByID(sanPham.getIDSanPham()), sanPhamBUS.formatDonGia(sanPham.getThanhTien())});
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new StorageGUI.TableDarkGUI();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGioHang = new StorageGUI.TableDarkGUI();
        panelRound1 = new StorageGUI.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lableMaNV = new javax.swing.JLabel();
        lableMaHD = new javax.swing.JLabel();
        lableMaKH = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lableTongTien = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new StorageGUI.TextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenKhachHang = new StorageGUI.TextField();
=======
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        btnXuatHoaDon = new StorageGUI.Button();
        button2 = new StorageGUI.Button();
        btnXoaSanPhamGioHang = new StorageGUI.Button();
        btnThemGioHang = new StorageGUI.Button();
        spinnerSoLuong = new javax.swing.JSpinner();

        jRadioButton1.setText("jRadioButton1");

        jCheckBox1.setText("jCheckBox1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 48, 98));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BÁN HÀNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Còn lại", "Đơn giá"
            }
        ));
        jScrollPane1.setViewportView(tblSanPham);

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá (đ)", "Giảm giá (%)", "Thành tiền (đ)"
            }
        ));
        jScrollPane2.setViewportView(tblGioHang);

        panelRound1.setBackground(new java.awt.Color(54, 48, 98));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã nhân viên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã hóa đơn:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã khách hàng:");

        lableMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lableMaNV.setForeground(new java.awt.Color(255, 255, 255));
        lableMaNV.setText("NV001");

        lableMaHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lableMaHD.setForeground(new java.awt.Color(255, 255, 255));
        lableMaHD.setText("HD002");

        lableMaKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lableMaKH.setForeground(new java.awt.Color(255, 255, 255));
        lableMaKH.setText("KH003");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
<<<<<<< HEAD
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
=======
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        jLabel8.setText("TỔNG TIỀN");

        lableTongTien.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lableTongTien.setForeground(new java.awt.Color(255, 51, 51));
<<<<<<< HEAD
        lableTongTien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableTongTien.setText("23,000,000");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên khách hàng:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số điện thoại");

=======
        lableTongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableTongTien.setText("23,000,000");

>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                    .addComponent(lableMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lableTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                    .addComponent(lableMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(12, 12, 12)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableTongTien))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel8.getAccessibleContext().setAccessibleDescription("");

=======
                .addGap(15, 15, 15)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lableTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        btnXuatHoaDon.setText("XUẤT HÓA ĐƠN");
        btnXuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDonActionPerformed(evt);
            }
        });

        button2.setText("XUẤT FILE EXCEL");

        btnXoaSanPhamGioHang.setText("XÓA SẢN PHẨM");
        btnXoaSanPhamGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSanPhamGioHangActionPerformed(evt);
            }
        });

        btnThemGioHang.setText("THÊM GIỎ HÀNG");
        btnThemGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemGioHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
<<<<<<< HEAD
                            .addComponent(spinnerSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
=======
                            .addComponent(spinnerSoLuong)
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnThemGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnXoaSanPhamGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaSanPhamGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        btnThemGioHang.setEnabled(true);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnThemGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemGioHangActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSanPham.getSelectedRow();

        String IDSanPham = (String) tblSanPham.getValueAt(selectedRow, 0);
        String tenSanPham = (String) tblSanPham.getValueAt(selectedRow, 1);
        int soLuong = (int) spinnerSoLuong.getValue();
<<<<<<< HEAD
        
        String giaSanPhamStr = (String) tblSanPham.getValueAt(selectedRow, 3);
        giaSanPhamStr = giaSanPhamStr.replace(",", "");
        Double donGia = Double.valueOf(giaSanPhamStr);
        
        double thanhTien = donGia * soLuong;
        handleThemGioHang(IDSanPham, tenSanPham, soLuong, donGia, thanhTien);
        renderTableGioHangForBanHangGUI(modelGioHang);
=======
        System.out.println(tblSanPham.getValueAt(selectedRow, 3));
        System.out.println("SoLuong = " + soLuong);
        String giaSanPhamStr = (String) tblSanPham.getValueAt(selectedRow, 3);
        giaSanPhamStr = giaSanPhamStr.replace(",", "");
        Double donGia = Double.valueOf(giaSanPhamStr);
        double thanhTien = donGia * soLuong;
        handleThemGioHang(IDSanPham, tenSanPham, soLuong, donGia, thanhTien);
        renderTableGioHangForBanHangGUI(modelGioHang);
//        sanPhamBUS.renderTableSanPhamForBanHangGUI(modelSanPham);
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
        renderTableSanPham();
        renderTongTienGioHang();
    }//GEN-LAST:event_btnThemGioHangActionPerformed

    private void btnXuatHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatHDActionPerformed

    private void btnXoaSanPhamGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSanPhamGioHangActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblGioHang.getSelectedRow();
        String IDSanPham = (String) tblGioHang.getValueAt(selectedRow, 0);
        xoaSanPhamTrongGioHang(IDSanPham);
        renderTableGioHangForBanHangGUI(modelGioHang);
        renderTongTienGioHang();
    }//GEN-LAST:event_btnXoaSanPhamGioHangActionPerformed

    private void btnXuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDonActionPerformed
        // TODO add your handling code here:
        int rowCount = modelGioHang.getRowCount();
<<<<<<< HEAD

        ArrayList<ChiTietHoaDonDTO> mangDoiTuongGioHang = new ArrayList<>();
        ArrayList<ChiTietHoaDonDTO> mangChiTiet = new ArrayList<>();
        String IDHoaDon = lableMaHD.getText();
        String IDNhanVien = lableMaNV.getText();
        String IDKhachHang = lableMaKH.getText();
        
        for (int i = 0; i < rowCount; i++) {
            String IDSanPham = (String) tblGioHang.getValueAt(i, 0);
            String TenSanPham = (String) tblGioHang.getValueAt(i, 1);
            int soLuong = (int) tblGioHang.getValueAt(i, 2);

            String DonGiaString = (String) tblGioHang.getValueAt(i, 3);
            DonGiaString = DonGiaString.replace(",", "");
            Double DonGia = Double.valueOf(DonGiaString);

            String ThanhTienString = (String) tblGioHang.getValueAt(i, 5);
            ThanhTienString = ThanhTienString.replace(",", "");
            Double ThanhTien = Double.valueOf(ThanhTienString);

            double TienGiamGia = ThanhTien - (soLuong * DonGia);
            
            // Tạo chi tiết để xuất hóa đơn
            ChiTietHoaDonDTO chiTietHoaDonDTO = new ChiTietHoaDonDTO(IDHoaDon, soLuong, TenSanPham, DonGia, TienGiamGia, ThanhTien);
            
            // Tạo đối tượng chi tiết hóa đơn
            ChiTietHoaDonDTO themChiTiet = new ChiTietHoaDonDTO(IDHoaDon, IDSanPham, soLuong, DonGia, ThanhTien, TienGiamGia);
            mangChiTiet.add(themChiTiet);
            mangDoiTuongGioHang.add(chiTietHoaDonDTO);
            
        }
        
        xuatHoaDon.xuatHoaDon(lableMaHD.getText(), lableMaKH.getText(), IDNhanVien, lableMaHD.getText(), txtTenKhachHang.getText(), txtSDT.getText(), mangDoiTuongGioHang, lableTongTien.getText(), mangChiTiet);

        lableMaHD.setText(hoaDonBUS.createAutoIDHoaDon());
        lableMaKH.setText(khachHangBUS.createAutoKhachHang());
        txtTenKhachHang.setText("");
        txtSDT.setText("");
        lableTongTien.setText("0");
        modelGioHang.setRowCount(0); // lỗi nhẹ
        renderTableSanPham();
=======
        int colCount = modelGioHang.getColumnCount();

        ArrayList<SanPhamDTO> mangDoiTuongGioHang = new ArrayList<>();
        
        String[][] dataArray = new String[rowCount][colCount - 1];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 1; j < colCount; j++) {
                Object value = modelGioHang.getValueAt(i, j);
//                SanPhamDTO sanPham = new SanPhamDTO(modelGioHang.getValueAt(i, j));
//                mangDoiTuongGioHang.add(sanPham);
                dataArray[i][j - 1] = String.valueOf(value);
            }
        }

        xuatHoaDon.inHoaDon(lableMaHD.getText(), lableMaKH.getText(), IDNhanVien, lableMaHD.getText(), dataArray);

>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
    }//GEN-LAST:event_btnXuatHoaDonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BanHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanHangGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private StorageGUI.Button btnThemGioHang;
    private StorageGUI.Button btnXoaSanPhamGioHang;
    private StorageGUI.Button btnXuatHoaDon;
    private StorageGUI.Button button2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
=======
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lableMaHD;
    private javax.swing.JLabel lableMaKH;
    private javax.swing.JLabel lableMaNV;
    private javax.swing.JLabel lableTongTien;
    private StorageGUI.PanelRound panelRound1;
    private javax.swing.JSpinner spinnerSoLuong;
    private StorageGUI.TableDarkGUI tblGioHang;
    private StorageGUI.TableDarkGUI tblSanPham;
<<<<<<< HEAD
    private StorageGUI.TextField txtSDT;
    private StorageGUI.TextField txtTenKhachHang;
=======
>>>>>>> 26fb5b3bbaf9137c1fae60d30a23923f40363332
    // End of variables declaration//GEN-END:variables
}
