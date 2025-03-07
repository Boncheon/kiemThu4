package com.example.demo.bai1;

public class boQuaChiaHetCho8 {
    public int boquachiacho8(int n){

        int sum =0;
        for(int i=1;i<=n;i++){
            if(i%8==0){
                continue;
            }
            if(i%2==0){
                sum+=i;
            }

        }
        return sum;
    }


}
