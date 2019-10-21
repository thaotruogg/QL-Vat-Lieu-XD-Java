/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAL.SanPhamDAL;
import Entity.Product;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class SanPhamDLL {
    SanPhamDAL dal = new SanPhamDAL();
    
    public ArrayList<Product> getById(String id){
        return dal.getById(id);
    }
}
