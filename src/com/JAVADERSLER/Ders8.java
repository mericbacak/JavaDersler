package com.JAVADERSLER;

import java.util.Locale;
import java.util.Scanner;

public class Ders8 {
    public static void main(String[] args) {
        System.out.println("sonuç1 " + !(3 > 4));
        //not usage
        System.out.println("sonuç2 " + (!(5 > 4) && ("test" == "test")));
        //not operatörü ve and bağlacı sonuc false gelecek
        System.out.println("sonuç3 " + (!(5 > 4) || ("test" == "test")));
        //not operatorü ve or bağlacı sonuç true gelecek

        //user password doğrulaması yaptırmaya dayalı and or ve not kullanımı
        Scanner tara = new Scanner(System.in);
        tara.useLocale(Locale.US);
        System.out.println("Kullanıcı adını giriniz");
        String user2 = tara.nextLine();

        System.out.println("Parola giriniz");
        String pass2 = tara.nextLine();

        String user = "Testuser";
        String pass = "TestPassword";
        if (!(user.equals(user2)) && (!(pass.equals(pass2)))) {
            System.out.println("kullanıcı adı ve parola yanlış");
        }
        else if((!(user.equals(user2)) && ((pass.equals(pass2))))){
            System.out.println("kullanıcı adı yanlış");
        }
        else if(((user.equals(user2)) && (!(pass.equals(pass2))))){
            System.out.println("Parola adı yanlış");
        }
        else{
            System.out.println("başarılı giriş");
        }
    }
}
