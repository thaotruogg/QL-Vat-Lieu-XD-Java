/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class SanPhamDAL extends ConnectionDatabase{
    private final String GET_BY_ID = "SELECT maSanPham, tenSanPham FROM dbo.SANPHAM WHERE maSanPham='?'";
    
    public ArrayList<Product> getById(String maSP){
        ArrayList<Product> obj = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(GET_BY_ID);
            ps.setString(1, maSP);
            ResultSet rs = ps.executeQuery();
            if(rs != null && rs.next()){
                Product item = new Product();
                item.setMaSP(rs.getString("maSanPham"));
                item.setTenSP(rs.getString("tenSanPham"));
                obj.add(item);
            }
            getClose();
        } catch (Exception e) {
            System.out.println(e);
        }
        return obj;
    }
}
