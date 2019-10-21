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
public class Product {
    String maSP, tenSP, nhaSX, maLoai;

    public Product() {
    }

    public Product(String maSP, String tenSP, String nhaSX, String maLoai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.nhaSX = nhaSX;
        this.maLoai = maLoai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }
    
    
}
