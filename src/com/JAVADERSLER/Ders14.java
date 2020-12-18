package com.JAVADERSLER;

import java.util.Scanner;

public class Ders14 {
    public static void valarmorgulus(){
        System.out.println("valarmorgulus");
        System.out.println("valardoharis");
    }
    public static void factroial(){
        Scanner tara= new Scanner(System.in);
        System.out.println("Klavyeden sayı giriniz");
        int sayi=tara.nextInt();
        int faktör=1;
        while (sayi>0){
            faktör=faktör*sayi;
            sayi--;
        }
        System.out.println("Faktöriyel "+faktör);
    }
    public static void main(String[]args){
        valarmorgulus();
        factroial();
    }
}
