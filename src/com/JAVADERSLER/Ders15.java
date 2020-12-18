package com.JAVADERSLER;

public class Ders15 {
    public static void selam(String name){
        System.out.println("Naber "+ name);
    }
    public static void toplam(int a,int b,int c){
        System.out.println("toplam "+ (a+b+c));
    }
    public static void main(String[] args){
        selam("Seçil");
        selam("Meriç");
        toplam(3,4,15);
        toplam(1942,1953,1993);
        toplam(1962,1959,1990);
    }
}
