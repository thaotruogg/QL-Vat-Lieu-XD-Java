/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAO.HoaDonDAL;
import DTO.Bill;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class HoaDonDLL {
    HoaDonDAL dal = new HoaDonDAL();
    
    public ArrayList<Bill> getAllBill(){
        return dal.getAllBill();
    }
    
    public boolean AddBill(Bill bill){
        return dal.AddBill(bill);
    }
    
    public boolean DeleteBill(String bill){
        return dal.DeleteBill(bill);
    }
}
