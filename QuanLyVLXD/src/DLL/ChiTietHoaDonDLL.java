/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAO.ChiTietHoaDonDAL;
import DTO.SubBill;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class ChiTietHoaDonDLL {
    ChiTietHoaDonDAL dal = new ChiTietHoaDonDAL();
    
    public ArrayList<SubBill> getAllSubBill(){
        return dal.getAllSubBill();
    }
    
    public boolean AddBill(SubBill subbill){
        return dal.AddSubBill(subbill);
    }
    
    public boolean DeleteBill(String subbill){
        return dal.DeleteSubBill(subbill);
    }
}
