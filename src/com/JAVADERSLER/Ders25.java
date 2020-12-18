package com.JAVADERSLER;

import java.util.ArrayList;

//arraylistler
public class Ders25 {
    public static void main(String[]args){
        ArrayList<String> groups=new ArrayList<String>();
        groups.add("Leon");
        groups.add("MK1-2004");
        groups.add("MK2-2011");
        groups.add("MK3-2014");

        System.out.println("random "+ groups.get(0));
        System.out.println("Grup boyutu "+ groups.size());
        groups.remove("MK3-2011");
        for (int i=0;i<groups.size();i++){
            System.out.println(i+". elemean "+ groups.get(i));
        }
        groups.remove(3);
        System.out.println(groups.indexOf("MK2-2011"));
    }
}
