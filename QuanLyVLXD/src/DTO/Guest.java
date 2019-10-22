/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author thaotruogg
 */
public class Guest {
    private String maKH, tenKH, sdt, diaChi;
    private double noDK, noCK;

    public Guest() {
    }

    public Guest(String maKH, String tenKH, String sdt, String diaChi, double noDK, double noCK) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.noDK = noDK;
        this.noCK = noCK;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getNoDK() {
        return noDK;
    }

    public void setNoDK(double noDK) {
        this.noDK = noDK;
    }

    public double getNoCK() {
        return noCK;
    }

    public void setNoCK(double noCK) {
        this.noCK = noCK;
    }

    
}
