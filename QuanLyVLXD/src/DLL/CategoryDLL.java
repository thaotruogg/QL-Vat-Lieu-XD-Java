/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAO.CategoryDAO;
import DTO.Category;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CategoryDLL {
    
    public static ArrayList<Category> GetAllCate(){
        ArrayList<Category> arrCate = CategoryDAO.GetAllCate();
        return arrCate;
    }
}
