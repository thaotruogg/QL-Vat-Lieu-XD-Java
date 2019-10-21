/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Bill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class HoaDonDAL extends ConnectionDatabase{
    private final String QUERY_BILL = "EXEC dbo.Show_SoHoaDon";
    
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
