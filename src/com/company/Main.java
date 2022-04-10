package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        University univ1 = new University();
        univ1.imya = "Kyrgyz Economic University";
        univ1.adress = "ul.Togolok Moldo 26 ";
        univ1.phoneNumber = +996700123456L;

        System.out.println(univ1.imya + " " + " nahoditsya po adresu"  + univ1.adress);
        System.out.println("Telefon dlya svyazi" + " \n  " + univ1.phoneNumber);




    }
}
