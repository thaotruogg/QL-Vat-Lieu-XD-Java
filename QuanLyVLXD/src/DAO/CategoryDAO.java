/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Category;
import GUI.MainJForm;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class CategoryDAO {
    public static DefaultTableModel GetCateModel(Connection conn, DefaultTableModel datamodel){
       try {
            CallableStatement callable = conn.prepareCall("{call SHOW_LoaiSanPham}");
            callable.execute();
            ResultSet result = callable.getResultSet();
            String header[] = {"Mã loại sản phẩm", "Tên loại sản phẩm"};
            datamodel = new DefaultTableModel(header,0);
            Vector data = null;
            datamodel.setRowCount(0);
            while(result.next()){
                data = new Vector();
                data.add(result.getString(1));
                data.add(result.getString(2));
                datamodel.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainJForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       return datamodel;
    }
    public static HashMap<String,String> GetCateModel(Connection conn, HashMap<String,String> Categories){
       try {
            CallableStatement callable = conn.prepareCall("{call SHOW_LoaiSanPham}");
            callable.execute();
            ResultSet result = callable.getResultSet();
            while(result.next()){
                Categories.put(result.getString(1), result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainJForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       return Categories;
    }
    
    public static ArrayList<Category> GetAllCate(){
        Connection conn = ConnectionDatabase.getConnection();
        ArrayList<Category> arrCate = new ArrayList<>();
        try {
            CallableStatement callable = conn.prepareCall("{call SHOW_LoaiSanPham}");
            callable.execute();
            ResultSet rs = callable.getResultSet();
            while(rs.next()){
                Category cate = new Category(rs.getString(1),rs.getString(2));
                arrCate.add(cate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arrCate;
    }
}
