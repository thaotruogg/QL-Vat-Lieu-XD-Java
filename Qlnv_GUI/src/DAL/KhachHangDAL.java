/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Guest;
import java.util.ArrayList;

/**
 *
 * @author thaotruogg
 */
public class KhachHangDAL extends ConnectionDatabase{
    private static String QUERY_GUEST = "EXEC dbo.SHOW_KhachHang";
    
    public ArrayList<Guest> getAllGuest(){
        ArrayList<Guest> obj = new ArrayList<>();
        try {
            getConnection();
            
            //getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
