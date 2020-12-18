package com.JAVADERSLER;

public class Ders19 {
    //Sınıfın methohları ve encapsül

    public static void main(String[] args) {
        Car Car1 = new Car();
        Car1.setColor("Siyah");
        Car1.setModel("AudiA4");
        Car1.setDoors(1);
        Car1.setEngine(2);

        System.out.println("Arabanın Rengi " + Car1.getColor());
        System.out.println("Arabanın modeli " + Car1.getModel());
        System.out.println("Arabanın Kapısı " + Car1.getDoors());
        System.out.println("Arabanın motoru " + Car1.getEngine());
        Car1.EngineStart();
    }
}