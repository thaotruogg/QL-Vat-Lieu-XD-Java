/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author thaotruogg
 */
public class HoaDon {
    private String soHD, maKH, ngayLapHD;

    public HoaDon(String soHD, String maKH, String ngayLapHD) {
        this.soHD = soHD;
        this.maKH = maKH;
        this.ngayLapHD = ngayLapHD;
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

    public String getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(String ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }
}
