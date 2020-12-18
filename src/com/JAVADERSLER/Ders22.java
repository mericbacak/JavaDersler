package com.JAVADERSLER;

public class Ders22 {
    public static void main(String[] args) {
        Car2 car1= new Car2("Magico","Leon",1.2,4);
        Car2 car2= car1;
        car2.ShowInfos();
        Car2 car3=car2;
        car3.ShowInfos();
        //Exception in thread "main" java.lang.NullPointerException beklenir çünkü null tnaımlandı, doğrusu için car2 olarak refersans veirlrise durum Ok
        String s1= new String("Mustafa");
        String s2= new String("Mustafa");
        if(s1==s2){
            System.out.println("if1Eşit");
        }
        else{
            System.out.println("if1Eşit değil");
        }
        if(s1.equals(s2)){
            System.out.println("if2Eşit");
        }
        else{
            System.out.println("if2Eşitdeğil");
        }
    }
}
