package com.example.demo.bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tongSoleTest {
    private tongSole b1= new tongSole();

    private int n;


    @Test
    void testtongSoLe(){
        assertEquals(4,b1.tongSole(4));
    }
    @Test
    void testtongSoLe1(){
        assertEquals(1,b1.tongSole(1));
    }
    @Test
    void testSoLon(){
        assertThrows(IllegalArgumentException.class,()-> b1.tongSole(Integer.MAX_VALUE));
    }
    @Test
    void tesstSOLon2(){
        assertThrows(IllegalArgumentException.class,()->b1.tongSole(0));
    }
    @Test
    void tesstSOLon4(){
        assertThrows(IllegalArgumentException.class,()->b1.tongSole(-1));
    }


}