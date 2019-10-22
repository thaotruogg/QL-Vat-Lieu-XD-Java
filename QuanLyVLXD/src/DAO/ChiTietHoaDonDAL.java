/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Bill;
import DTO.SubBill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thaotruogg
 */
public class ChiTietHoaDonDAL extends ConnectionData{
    private final String QUERY_SUB_BILL = "EXEC dbo.Show_CTHD";
    private final String QUERY_ADD_BILL = "INSERT dbo.CHITIETHOADON VALUES (?, ?, ?, ?)";
    private final String DELETE_DATA = "EXEC dbo.USP_DeleteChiTietHonDon @maHoaDon = ?";
    
    public ArrayList<SubBill> getAllSubBill(){
        ArrayList<SubBill> obj = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_SUB_BILL);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    SubBill item = new SubBill();
                    item.setMaHD(rs.getString("Mã hóa đơn"));
                    item.setMaSP(rs.getString("Mã sản phẩm"));
                    item.setSoLuong(rs.getInt("Số lượng"));
                    item.setDonGia(rs.getDouble("Đơn giá"));
                    obj.add(item);
                }
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
    
    public boolean AddSubBill(SubBill subbill){
        boolean check = false;
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_ADD_BILL);
            ps.setString(1, subbill.getMaHD());
            ps.setString(2, subbill.getMaSP());
            ps.setInt(3, subbill.getSoLuong());
            ps.setDouble(4, subbill.getDonGia());

            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            getClose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ma hoa don da ton tai");
        }
        return check;
    }
    
    public boolean DeleteSubBill(String id){
        boolean check = false;
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(DELETE_DATA);
            ps.setString(1, id);
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            getClose();
        } catch (Exception e) {
        }
        return check = true;
    }
}
