package com.example.demo.bai1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class lietKecacSoTest {

    lietKecacSo lk = new lietKecacSo();

    private String getPrintedOutput(int n) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent)); // Redirect System.out
        lk.lietKeboQua5(n);
        return outContent.toString().trim(); // Loại bỏ khoảng trắng dư thừa
    }
    @Test
    void lietke1(){
        assertEquals("12346789",getPrintedOutput(10));
    }
}