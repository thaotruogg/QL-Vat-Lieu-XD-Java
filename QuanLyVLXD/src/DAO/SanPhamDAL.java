/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Products;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class SanPhamDAL extends ConnectionData{
    private final String QUERY_PRODUCTS = "EXEC dbo.SHOW_SanPham";
    private final String GET_BY_ID = "SELECT * FROM dbo.SANPHAM WHERE maSanPham=?";
    
    public ArrayList<Products> getAllProducts(){
        ArrayList<Products> obj = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(QUERY_PRODUCTS);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Products item = new Products();
                    item.setMaSP(rs.getString("Mã sản phẩm"));
                    item.setTenSP(rs.getString("Tên sản phẩm"));
                    item.setNhaSX(rs.getString("Nhà sản xuất"));
                    item.setMaLoai(rs.getString("Mã loại sản phẩm"));
                    obj.add(item);
                }
            }
            getClose();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return obj;
    }
    
    public ArrayList<Products> getById(String id){
        ArrayList<Products> obj = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = conn.prepareStatement(GET_BY_ID);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs != null && rs.next()){
                Products item = new Products();
                item.setMaSP(rs.getString("maSanPham"));
                item.setTenSP(rs.getString("tenSanPham"));
                obj.add(item);
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
