package com.JAVADERSLER;

import java.util.Scanner;

public class Ders10 {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            System.out.println("Java");
            i++;
        }
        System.out.println("döngü bitti  i "+i);

        Scanner tara= new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi= tara.nextInt();
        int fakt=1;
        while (sayi>1){
            fakt=fakt*sayi;
            sayi--;
            System.out.println("faktöriyel geçici "+fakt +" sayi geçici "+sayi);
        }
        System.out.println("girdiğiniz sayının faktöriyeli "+fakt);
    }
}
