package com.example.demo.bai2;

public class SanPham {
    private String ten;
    private String ma;
    private Integer namBaoHanh;
    private double gia;
    private Integer soLuong;
    private String danhMuc;

    public SanPham() {
    }

    public SanPham(String ten, String ma, Integer namBaoHanh, double gia, Integer soLuong, String danhMuc) {
        this.ten = ten;
        this.ma = ma;
        this.namBaoHanh = namBaoHanh;
        this.gia = gia;
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Integer getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(Integer namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
