package com.stackroute;

import java.util.Scanner;

public class p25data {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x>100 || x<0){
                i--;continue;
            }
            arr[i]=x;
        }
        double average,sum=0;
        int maxi=0,mini=100;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxi = Math.max(maxi,arr[i]);
            mini = Math.min(mini,arr[i]);
        }
        average=sum/(double)n;
        System.out.println("Average="+average);
        System.out.println("Max="+maxi);
        System.out.println("Min="+mini);
    }
}
