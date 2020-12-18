package com.JAVADERSLER;
//inheritance
//Ekstar özellikler ve Methodoalr
//Java Programlama Dersleri 31 - Object Sınıfı ve toString
//32 - Polymorphism ( Çok Biçimlilik )
public class Ders28_29 {
    public static void main(String[]args){
       Employee employee = new Employee("Meriç","HalkBank",12000);
       Manager manager = new Manager("Seçil","HalkBank",7200,10);

       employee.showInfos();
       manager.showInfos();
       manager.raiseSalary(1000);
       System.out.println(manager);
        //Java Programlama Dersleri 31 - Object Sınıfı ve toString
        Employee employee1 = new Manager("Seçil Bacak","HalkBank",7500,15);
        employee1.showInfos();
    }
}
