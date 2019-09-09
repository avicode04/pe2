package com.stackroute;

public class p22 {
    public boolean isPower4(int n){
        while(n>1){
            if(n%4!=0){
                return false;
            }
            n/=4;
        }
        if(n==1)
            return true;
        return false;
    }
}
