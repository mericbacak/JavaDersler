package com.JAVADERSLER;

public class Ders12 {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            System.out.println("i değeri: "+i);
        }
        int i;
        int j;
        for( i=0,  j=0; i<10 && j<5; i++,j++){
            System.out.println("i değeri "+i+" j değeri "+j);
        }

        int k;
        int l;
        for (k=0;k<5;k++){
            for(l=0;l<5;l++){
                System.out.println("k değeri "+k+" l değeri "+l);
            }
        }
        int m=0;
        int n=0;
        while(m<5){
            n=0;
            while (n<5){
                System.out.println("m değeri "+m+" n değeri "+n);
                n++;
            }
            m++;
        }
    }
}
