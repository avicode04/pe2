package com.stackroute;

public class user {
    private String fname;
    private String sname;
    private int age;
    private double salary;

    public void setData(String a,String b,int c,double d){
        this.fname=a;
        this.sname=b;
        this.age=c;
        this.salary=d;
    }
    public String getfullname(){
        String ans=fname;
        fname+=" ";
        fname+=sname;
        return fname;
    }
}
