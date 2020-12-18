package com.JAVADERSLER;
import java.util.Scanner;
//arrayler
public class Ders23 {
    public static void mean(int[]arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Ortalama  "+ (double)sum/arr.length);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int [] arr1={10,20,30,40,50};
        int [] arr2=new int[5];
        System.out.println("Matrisin değerleri giriliyor");
        for (int k=0;k<arr2.length;k++){
            arr2[k]=scanner.nextInt();
        }
        System.out.println("Matrslerin değerleri basılıyor");
        for(int i=0; i <arr1.length; i++){
            System.out.println("Eleman "+arr1[i]);
        }
        for(int i=0; i <arr2.length; i++){
            System.out.println("Eleman "+arr2[i]);
        }
        mean(arr1);
        mean(arr2);
    }
}
