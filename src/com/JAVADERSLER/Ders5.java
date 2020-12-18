package com.JAVADERSLER;
import java.util.Locale;
import java.util.Scanner;

public class Ders5 {
    public static void main(String[] args) {
        //aritmetik operatörler + - * / %
        Scanner scan= new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("klavyeden bir değer giriniz");
        int x = scan.nextInt();
        System.out.println("klavyeden bir değer giriniz");
        int y = scan.nextInt();
        System.out.println();

        System.out.println("sonuç "+ "(x/y) " +(x/y));
        System.out.println("küsuratlı bölüm"+ " ((double)x/y)) " + ((double)x/y));
        System.out.println("küsuratlı bölüm"+" x/(double)y) "+x/(double)y);
        System.out.println("küsuratlı olmayan bölüm " +" (double)(x/y)) "+ (double)(x/y));
        System.out.println("çarpım işlemi "+" (x*y) "+(x*y));
        System.out.println("toplama işlemi "+" (x+y) "+(x+y));
        System.out.println("çıkarma işlemi "+" (x-y) "+(x-y));
        System.out.println("% işlemi "+"(x%y) "+(x%y));
    }
}
