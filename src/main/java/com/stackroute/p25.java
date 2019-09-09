package com.stackroute;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class p25 extends maths{
    public static void main(){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter your input:");
            int x = sc.nextInt();
            if(x>100 || x<0){
                System.out.println("Invalid");
                i--;continue;
            }
            arr[i]=x;
        }
        double avg,sum=0;
        int maxi=arr[0],mini=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxi = max(maxi,arr[i]);
            mini=min(mini,arr[i]);
        }
        average=sum/(double)n;
        maximum=maxi;
        minimum=mini;
        view();
    }

    public static void view(){
        System.out.println("Average="+average);
        System.out.println("Max="+maximum);
        System.out.println("Min="+minimum);
    }
}
