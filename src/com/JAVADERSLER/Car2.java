package com.JAVADERSLER;
//Constractor (yapıcı methodlar)
import java.util.Locale;
import java.util.Scanner;

public class Car2 {
    //field properties
    private String color;
    private String model;
    private double engine;
    private int doors;
    public Car2(String color,String model){
        this(color,model,0,0);
    }
    public Car2() {
       /* this.color = "BigiYok";
        this.model = "BilgiYOk";
        this.engine = 0;
        this.doors = 0;*/
       this("BilgiYok","Bilgiyok",0,0);
    }
   public Car2(String color, String model,double engine,int doors){
        this.color=color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;
   }
    public void EngineStart(){
        int dk;
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Arabanın çalışacağı süreyi girin");
        dk=scan.nextInt();
        System.out.println("Araba "+dk+" dakika çalışacak");
    }
    public void ShowInfos(){
        System.out.println("Arabanın Rengi " + this.color);
        System.out.println("Arabanın modeli " + this.model);
        System.out.println("Arabanın Kapısı " + this.doors);
        System.out.println("Arabanın motoru " + this.engine);
    }
}
