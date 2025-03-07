package com.example.demo.bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class boQuaChiaHetCho8Test {
    boQuaChiaHetCho8 chia8 = new boQuaChiaHetCho8();


    @Test
    void chia81(){
        assertEquals(12,chia8.boquachiacho8(8));
    }

}