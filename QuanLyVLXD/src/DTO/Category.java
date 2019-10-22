/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class Category {
    private String Maloai;
    private String TenLoai;

    public Category() {
    }

    public Category(String Maloai, String TenLoai) {
        this.Maloai = Maloai;
        this.TenLoai = TenLoai;
    }

    public String getMaloai() {
        return Maloai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setMaloai(String Maloai) {
        this.Maloai = Maloai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
}
