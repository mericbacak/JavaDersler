package com.JAVADERSLER;
import java.util.Locale;
import java.util.Scanner;

public class Ders6 {
    public static void main(String[] args) {
        Scanner deger=new Scanner(System.in);
        deger.useLocale(Locale.US);
        System.out.println("Klavyeden değer giriniz");
        int a= deger.nextInt();
        System.out.println("a'nın değğeri"+ a--);
        System.out.println("a'nın değeri"+a);
        //şimdi de --leri sola alalım
        System.out.println("Klavyeden değer giriniz");
        int b=deger.nextInt();
        System.out.println("a'nın değğeri"+ --b);
        System.out.println("a'nın değeri"+b);
    }
}
