package com.stackroute;

public class p21 {
    public int reverse(int n){
        int rev=0;
        while(n>0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        return rev;
    }
}
