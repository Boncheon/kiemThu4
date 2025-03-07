package com.example.demo.bai2;

import java.util.ArrayList;
import java.util.List;

public class bai2 {
    public List<SanPham> lisst = new ArrayList<>();

    public String AddSanPham(SanPham sanPham){
        if(sanPham==null){
            throw new IllegalArgumentException("khong dc null");
        }
        if(sanPham.getMa().isEmpty()||sanPham.getTen().isEmpty()||sanPham.getDanhMuc().isEmpty()){
            throw new IllegalArgumentException("ko duoc dẻ trong");
        }
        if(sanPham.getGia()<=0||sanPham.getNamBaoHanh()<=0||sanPham.getSoLuong()<=0){
            throw  new IllegalArgumentException("ko nhap so be hơn 0");
        }

        lisst.add(sanPham);
        return "them thanh cong";
    }

    public String updateSanPham(SanPham sanPham, String ma){
        SanPham update = lisst.stream().filter(sp->sp.getMa().equalsIgnoreCase(ma)).findFirst().orElse(null);
        if(update==null){
            throw new IllegalArgumentException("khong sua null");
        }
        if(update.getMa().isEmpty()||update.getTen().isEmpty()||update.getDanhMuc().isEmpty()){
            throw new IllegalArgumentException("ko duoc dẻ trong");
        }
        if(update.getGia()<=0||update.getNamBaoHanh()<=0||update.getSoLuong()<=0){
            throw  new IllegalArgumentException("ko sua so be hơn 0");
        }
        return "update thanh cong";
    }

    public String xoa(String ma){
        if(ma==null||ma.isEmpty()){
            throw new IllegalArgumentException("ko tim thay ma");
        }
        if(lisst == null || lisst.isEmpty()){
            throw new IllegalArgumentException("danh sach ko duoc trong");
        }
        boolean remove = lisst.removeIf(sp->sp.getMa().equalsIgnoreCase(ma));
        return remove ?"xoa thanh cong":"xoa that bai";
    }

    public void setLisst(List<SanPham> lisst) {
        this.lisst = lisst;
    }
}
