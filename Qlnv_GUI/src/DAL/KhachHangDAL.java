/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Guest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class KhachHangDAL extends ConnectionDatabase{
    private static String QUERY_GUEST = "EXEC dbo.SHOW_KhachHang";
    private final String GET_BY_ID = "SELECT * FROM dbo.KHACHHANG WHERE maKhachHang='?'";
    
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
}
