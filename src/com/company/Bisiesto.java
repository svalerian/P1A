package com.company;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el año: ");
        int anio = sc.nextInt();
        if (anio % 4 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No lo es");
        }

    }
}
