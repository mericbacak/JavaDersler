package com.JAVADERSLER;

import java.util.Scanner;

public class Ders7 {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        System.out.println("klavyeden not değeri giriniz");
        int note = deger.nextInt();
        System.out.println("klavyeden a değeri giriniz");
        int a = deger.nextInt();
        System.out.println("klavyeden b değeri giriniz");
        int b = deger.nextInt();
        System.out.println("sonuç" + " a>b " + (a > b));
        System.out.println("sonuç" + " a<b " + (a < b));
        System.out.println("sonuç" + " a==b " + (a == b));
        System.out.println("sonuç" + " a=!b " + (a != b));
        System.out.println("sonuç" + " a<=b " + (a <= b));
        System.out.println("sonuç" + " a>=b " + (a >= b));
        if (note > 90) {
            System.out.println("Dersten geçtiniz notunuz AA");
        }
        //if ve else if farklı eğer bu iften sonra else if yerine if olursa sırayla ifler koşar ama
        //else if olursa ilk ife girilmediğinde bu if sağlar mı diye kod bu ife girer.
        else if (note > 80) {
            System.out.println("Dersten geçtiniz notunuz BA");
        } else if (note > 70) {
            System.out.println("Dersten geçtiniz notunuz BB");
        } else if (note > 60) {
            System.out.println("Dersten geçtiniz notunuz CB");
        } else if (note > 50) {
            System.out.println("Dersten geçtiniz notunuz CC");
        } else {
            System.out.println("Dersten kaldınız notunuz DC");
        }
    }
}