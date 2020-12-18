package com.JAVADERSLER;

import java.util.Scanner;

public class Ders13 {
    public static void main(String[] args){
        while (true){
            Scanner tara=new Scanner(System.in);
            String s;
            System.out.println("karakter giriniz");
            s=tara.nextLine();
            if (s.equals("q")){
                System.out.println("programdan çıkış");
                break;
            }
            System.out.println("Karater "+s);
        }
        int i=0;
        while (i<10){
            if(i==4||i==7){
                i++;
                continue;
            }
            System.out.println("i: "+i);
            i++;
        }

    }
}
