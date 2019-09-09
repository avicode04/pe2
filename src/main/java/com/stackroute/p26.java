package com.stackroute;

public class p26 {
    public boolean factorial(int n){
        if(n>12){
            System.out.println("Number out of Range");
            return false;
        }

        System.out.println("Factorial of "+n+" is "+fact(n));
        return true;
    }

    int fact(int n){
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
}
