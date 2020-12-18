package com.JAVADERSLER;

import java.util.ArrayList;

//Foreach döngüsü
public class Ders26 {
    public static void main(String[]args){
        ArrayList<String> groups=new ArrayList<String>();
        groups.add("Leon");
        groups.add("MK1-2004");
        groups.add("MK2-2011");
        groups.add("MK3-2014");
        int [] arr1={10,20,30,40,50};
        for (String s:groups
             ) {
            System.out.println(s);
        }
        for (int i:arr1
             ) {
            System.out.println(i);

        }
    }
}
