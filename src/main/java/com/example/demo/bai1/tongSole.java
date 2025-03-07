package com.example.demo.bai1;

public class tongSole {

    public Integer tongSole(Integer n){
        if(n<1||n>=Integer.MAX_VALUE){
            throw new IllegalArgumentException("so n nhap vao phai lon hon 1 va lon hon IntergerMAx");
        }
        int sum=0;
            for (int i=1;i<=n;i++){
            if(i%2!=0){
                sum +=i;
            }
            }
        return sum;
    }

}
