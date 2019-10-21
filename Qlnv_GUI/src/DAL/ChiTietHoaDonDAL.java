/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Bill;
import Entity.SubBill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class ChiTietHoaDonDAL extends ConnectionDatabase{
    private final String QUERY_SUB_BILL = "EXEC dbo.Show_CTHD";
    
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
}
