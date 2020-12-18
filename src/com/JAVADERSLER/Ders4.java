package com.JAVADERSLER;
import java.util.Locale;
import java.util.Scanner;
public class Ders4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.US);
        System.out.println("klavyeden sayı giriniz ve entera basınız");
        int b = scan.nextInt();
        System.out.println("klavyeden girdiğiniz değer" +" "+ b);

        System.out.println("klavyeden noktalı değer giriniz");
        double d = scan.nextDouble();
        System.out.println("klavyeden girdiğiniz değer"+" "+d);
    }
}
