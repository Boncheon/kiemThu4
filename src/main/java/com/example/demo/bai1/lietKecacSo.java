package com.example.demo.bai1;

public class lietKecacSo {
    public void lietKeboQua5(int n){
        if(n<=0){
           throw new IllegalArgumentException("lõi");
        }
        for(int i=1;i<=n;i++){
            if(i%5==0){
                continue;
            }else{
                System.out.print(i);
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(i%5==0){
                continue;
            }else{
                System.out.print(i);
            }
        }

    }

}
