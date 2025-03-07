package com.example.demo.bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class bai2Test {
    private bai2  b2= new bai2();

    private List<SanPham> list = new ArrayList<>();
    @BeforeEach
    void setup(){
       b2= new bai2();
    }
    @Test
    void themThanhCong(){
        SanPham sp =new SanPham("manh","ma11",100,1,100,"com nuoc");
        assertEquals("them thanh cong",b2.AddSanPham(sp));
    }

    @Test
    void themmagiong(){
        SanPham sp =new SanPham("","ma11",100,1,100,"com nuoc");
        assertThrows(IllegalArgumentException.class,()->b2.AddSanPham(sp));
    }
    @Test
    void themmaNull(){
        assertThrows(IllegalArgumentException.class,()->b2.AddSanPham(null));
    }

    @Test
    void themSOam(){
        SanPham sp =new SanPham("manh","ma11",-100,-1,-100,"com nuoc");
        assertThrows(IllegalArgumentException.class,()->b2.AddSanPham(sp));
    }
    @Test
    void themSoNul(){
        SanPham sp =new SanPham("","",0,0,0,"");
        assertThrows(IllegalArgumentException.class,()->b2.AddSanPham(sp));
    }


    @Test
    void xoaThanhcong(){

        SanPham sp =new SanPham("manh","ma1",100,10,100,"com nuoc");
        b2.AddSanPham(sp);
        assertEquals("xoa thanh cong",b2.xoa("ma1"));
    }
    @Test
    void xoaThatBai(){
        SanPham sp =new SanPham("manh","ma1",100,1,100,"com nuoc");
        b2.AddSanPham(sp);
        assertEquals("xoa that bai",b2.xoa(sp.getMa()+"2"));
    }

    @Test
    void xoagiong(){
        SanPham sp =new SanPham("manh","",100,1,100,"com nuoc");
//        b2.AddSanPham(sp);
        assertThrows(IllegalArgumentException.class,()->b2.xoa(sp.getMa()));
    }
    @Test
    void xoagiong2(){
        SanPham sp =new SanPham();
//        b2.AddSanPham(sp);
        assertThrows(IllegalArgumentException.class,()->b2.xoa(""));
    }
    @Test
    void xoa3(){
        assertThrows(IllegalArgumentException.class,()->b2.xoa(null));
    }


    @Test
    void suaThanhCong(){
        SanPham sp =new SanPham("manh","ma1",100,1,100,"com nuoc");
        list.add(sp);
        b2.setLisst(list);
        SanPham sp1 =new SanPham("Mánhdas","ma1",100,1,100,"com nuoc");
        b2.updateSanPham(sp1,"ma1");
    }

    @Test
    void suaNull(){
        SanPham sp =new SanPham("manh","ma1",100,1,100,"com nuoc");
        list.add(sp);
        b2.setLisst(list);
        SanPham sp1 =new SanPham("Mánhdas","ma1",100,1,100,"com nuoc");
        b2.updateSanPham(sp1,"ma1");
    }


    @Test
    void ngoaiLe2(){
        SanPham sp =new SanPham("manh",null,100,1,100,"com nuoc");
        assertThrows(IllegalArgumentException.class,()->b2.updateSanPham(sp,null));
    }
    @Test
    void ngoaiLe3(){
        SanPham sp =new SanPham("manh","ma1",-100,-1,-100,"com nuoc");
        assertThrows(IllegalArgumentException.class,()->b2.updateSanPham(sp,"ma1"));
    }
    @Test
    void ngoaiLe1(){
        SanPham sp =new SanPham("","",0,0,0,"");
        assertThrows(IllegalArgumentException.class,()->b2.updateSanPham(sp,""));
    }
    @Test
    void ngoaiLe4(){
        SanPham sp =new SanPham();
        assertThrows(IllegalArgumentException.class,()->b2.updateSanPham(sp,null));
    }

}