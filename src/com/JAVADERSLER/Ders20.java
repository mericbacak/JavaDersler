package com.JAVADERSLER;
//Constractor (yapıcı methodlar)
public class Ders20 {
    public static void main(String[] args) {
        Car2 car1= new Car2("Magico","Leon",1.2,5);
        Car2 car2= new Car2();
        Car2 car3=new Car2("Beyaz","BMW M5");
        car1.ShowInfos();
        car2.ShowInfos();
        car3.ShowInfos();
        car1.EngineStart();
        car2.EngineStart();
        car3.EngineStart();
    }
}
