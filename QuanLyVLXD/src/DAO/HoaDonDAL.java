/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Bill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thaotruogg
 */
public class HoaDonDAL extends ConnectionData{
    private final String QUERY_BILL = "EXEC dbo.Show_SoHoaDon";
    private final String QUERY_ADD_BILL = "INSERT dbo.HOADON (soHoaDon, maKhachHang, ngayHoaDon) VALUES (?, ?, ?)";
    private final String DELETE_DATA = "EXEC dbo.USP_DeleteHoaDon @soHoaDon=?";

    
    public ArrayList<Bill> getAllBill(){
        ArrayList<Bill> obj = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_BILL);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Bill item = new Bill();
                    item.setSoHD(rs.getString("Số hóa đơn"));
                    item.setMaKH(rs.getString("Mã khách hàng"));
                    item.setNgayHD(rs.getString("Ngày hóa đơn"));
                    obj.add(item);
                }
            }
            getClose();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return obj;
    }
    
    public boolean AddBill(Bill bill){
        boolean check = false;
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_ADD_BILL);
            ps.setString(1, bill.getSoHD());
            ps.setString(2, bill.getMaKH());
            ps.setString(3, bill.getNgayHD());
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
    
    public boolean DeleteBill(String id){
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
