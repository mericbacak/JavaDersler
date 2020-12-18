package com.JAVADERSLER;

import java.util.Scanner;

public class Ders11 {
    public static void main(String[] args) {
        int n=10;
        Scanner tara=new Scanner(System.in);
        do{
            System.out.println("n= "+n);
            n--;
        }
        while (n>0);


        int toplam=0;
        System.out.println("Klavyeden sayı giriniz");
        int sayi=tara.nextInt();
        do {
            toplam+= sayi%10;
            sayi=sayi/10;
            System.out.println("toplam "+toplam+" sayi "+sayi);
        }
        while (sayi>0);
        System.out.println("Girilne sayının sayı değeleri toplamı "+toplam);
    }
}
