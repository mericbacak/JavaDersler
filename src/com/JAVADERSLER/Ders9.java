package com.JAVADERSLER;

import java.util.Locale;
import java.util.Scanner;

public class Ders9 {
    public static void main(String[] args) {
        ///switchcase örneği
        Scanner tara=new Scanner(System.in);
        tara.useLocale(Locale.US);
        System.out.println("Klavyeden sayı giriniz");
        int sayi=tara.nextInt();
        switch (sayi){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            default:
                System.out.println("Geçerisiz sayı");
                break;
        }
        //ATM örneği
        int bakiye=1000;
        int işlem;
        String IBAN;
        int miktar;
        System.out.println("Garanti Bankasına Hoşgeldiniz");
        System.out.println("1:Bakiye Görüntüleme");
        System.out.println("2:Para Yatırma");
        System.out.println("3:Para Çekme");
        System.out.println("4:EFT ile para transferi");
        System.out.println("Yapmak istediğiniz işlemi giriniz");
        işlem=tara.nextInt();
        switch (işlem){
            case 1:
                System.out.println("Bakiyeniz "+bakiye+" TL olarak görüntülenmektedir");
                break;
            case 2:
                System.out.println("Yatımrak istediğiniz tutarı giriniz");
                miktar=tara.nextInt();
                bakiye+=miktar;
                System.out.println("Yeni bakiyeniz "+bakiye+" olarak görüntülenmektedir.");
                break;
            case 3:
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                miktar=tara.nextInt();
                bakiye-=miktar;
                System.out.println("Yeni bakiyeniz "+bakiye+" olarak görüntülenmektedir.");
                break;
            case 4:
                System.out.println("Alıcı IBAN adresini giriniz");
                IBAN=tara.nextLine();
                System.out.println("EFT yapacağınız tutarı giriniz");
                miktar=tara.nextInt();
                bakiye-=miktar;
                System.out.println("EFT işlemi "+IBAN+" adresine geçerkeleştirilimiştir, gönderilen tutar "+" olarak görüntülenmektedir.");
                System.out.println("EFT sonrası yeni bakiyeniz "+bakiye+" olarak görüntülenmektedir.");
                break;
            case 5:
                System.out.println("Sistemden çıkış talebinden bulunuduz, sistemden çıkılıyor");
                break;
            default:
                System.out.println("GEçersiz işlem sistemden çıkılıyor....");
                break;
        }
    }
}
