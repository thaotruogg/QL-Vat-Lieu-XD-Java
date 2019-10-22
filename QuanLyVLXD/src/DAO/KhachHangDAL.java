/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Guest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thaotruogg
 */
public class KhachHangDAL extends ConnectionData{
    private final String QUERY_GUEST = "EXEC dbo.SHOW_KhachHang";
    private final String GET_BY_ID = "SELECT * FROM dbo.KHACHHANG WHERE maKhachHang=?";
    private final String QUERY_ADD = "INSERT dbo.KHACHHANG (maKhachHang, tenKhachHang, diaChi, soDienThoai, noDauKi, noHienTai) VALUES (?, ?, ?, ?, ?, ?)";
    private final String DELETE_DATA = "EXEC dbo.USP_DeleteKhachHang @maKhachHang =?";
    private final String QUERY_UPDATE = "EXEC dbo.USP_UpdateKhachHang @maKhachHang = ?, @tenKhachHang = ?, @diaChi = ?, @soDienThoai = ?, @noDauKi = ?, @noHienTai = ?";
    
    public ArrayList<Guest> getAllGuest(){
        ArrayList<Guest> obj = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_GUEST);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Guest item = new Guest();
                    item.setMaKH(rs.getString("Mã khách hàng"));
                    item.setTenKH(rs.getString("Tên khách hàng"));
                    item.setSdt(rs.getString("Số điện thoại"));
                    item.setDiaChi(rs.getString("diachi"));
                    item.setNoDK(rs.getDouble("noDauKi"));
                    item.setNoCK(rs.getDouble("noHienTai"));
                    obj.add(item);
                }
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
    
    
    public ArrayList<Guest> getById(String id){
        ArrayList<Guest> obj = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(GET_BY_ID);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs != null && rs.next()){
                Guest item = new Guest();
                item.setMaKH(rs.getString("maKhachHang"));
                item.setTenKH(rs.getString("tenKhachHang"));
                obj.add(item);
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
    
    public boolean AddGuest(Guest guest){
        boolean check = false;
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_ADD);
            ps.setString(1, guest.getMaKH());
            ps.setString(2, guest.getTenKH());
            ps.setString(3, guest.getDiaChi());
            ps.setString(4, guest.getSdt());
            ps.setDouble(5, guest.getNoDK());
            ps.setDouble(6, guest.getNoCK());
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            getClose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ma khach hang da ton tai");
            e.printStackTrace();
        }
        return check;
    }
    
    public boolean DeleteGuest(String id){
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
    
    public boolean UpdateGuest(Guest guest){
        boolean check = false;
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_UPDATE);
            ps.setString(1, guest.getTenKH());
            ps.setString(2, guest.getDiaChi());
            ps.setString(3, guest.getSdt());
            ps.setDouble(4, guest.getNoDK());
            ps.setDouble(5, guest.getNoCK());
            ps.setString(6, guest.getMaKH());
            int rs = ps.executeUpdate();
            if(rs > 0){
                check = true;
            }
            getClose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ma khach hang da ton tai");
            e.printStackTrace();
        }
        return check;
    }
}
