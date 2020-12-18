package com.JAVADERSLER;

public class Ders17 {
    //method overloading
    public static void toplama(int a,int b,int c){
        System.out.println("Toplam Sonucu: " +(a+b+c));
    }
    public static void toplama(int a,int b){
        System.out.println("Toplama Sonucu: "+(a+b));
    }
    public static void toplama(int a,int b,int c,int d){
        System.out.println("Toplama Sonucu: "+(a+b+c+d));
    }
    public static void ScoreResult(String name,int score){
        System.out.println(name+" İsimli oyunucunun puanı: "+score);
    }
    public static void ScoreResult(int score){
        System.out.println(" İsimsiz oyunucunun puanı: "+score);
    }
    public static void main(String[] args){
        toplama(10,22,45);
        toplama(55,45);
        toplama(33,44,55,77);
        ScoreResult("Meriç",45);
        ScoreResult(50);
    }
}
