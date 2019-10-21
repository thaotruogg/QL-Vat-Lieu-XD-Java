/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author thaotruogg
 */
public class Bill {
    private String soHD, maKH, ngayHD;

    public Bill(String soHD, String maKH, String ngayHD) {
        this.soHD = soHD;
        this.maKH = maKH;
        this.ngayHD = ngayHD;
    }

    public Bill() {
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }
    
    
}
