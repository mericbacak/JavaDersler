package com.JAVADERSLER;
import java.util.Locale;
import java.util.Scanner;

public class Car {
    //field properties
    private String color;
    private String model;
    private double engine;
    private int doors;
    public void setColor(String color) {
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors==1||doors==3 & doors<5){
            System.out.println("Kapı sayısı 2 veya 4 olaiblir");
        }
        else
        this.doors = doors;
    }
    public void EngineStart(){
        int dk;
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Arabanın çalışacağı süreyi girin");
        dk=scan.nextInt();
        System.out.println("Araba "+dk+" dakika çalışacak");
    }
}
