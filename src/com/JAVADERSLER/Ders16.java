package com.JAVADERSLER;

public class Ders16 {
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
    public static int x3(int a){
        return a*3;
    }
    public static int ikitopla(int a){
        return a+2;
    }
    public static int dortilecıkart(int a){
        return a-4;
    }
    public static void main(String[] args){
        System.out.println("toplam "+toplama(3,34,5));
        System.out.println("içi içe sonuç "+dortilecıkart(ikitopla(x3(5))));
    }

}
