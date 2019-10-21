/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAL.KhachHangDAL;
import Entity.Guest;
import java.util.ArrayList;
/**
 *
 * @author thaotruogg
 */
public class KhachHangDLL {
    KhachHangDAL dal = new KhachHangDAL();
    
    public ArrayList<Guest> getAllKhachHang(){
        return dal.getAllGuest();
    }
    
    public ArrayList<Guest> getById(String id){
        return dal.getById(id);
    }
}
