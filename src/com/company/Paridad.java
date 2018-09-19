package com.company;

public class Paridad {
    public static void main(String[] args){
        int i;
        for (i = 1; i <= 10; i++) {
            String paridad;
            if (i % 2 == 0){
                paridad = "PAR";
            }
            else {
                paridad = "IMPAR";
            }
            System.out.println(i + " - " + paridad);
        }
        i = 1;
        while (i<=10){
            String paridad;
            if (i % 2 == 0){
                paridad = "PAR";
            }
            else{
                paridad = "IMPAR";
            }
            System.out.println(i + " - " + paridad);
            i++;
        }

        i = 1;
        do {
            String paridad;
            if (i % 2 == 0){
                paridad = "PAR";
            }
            else{
                paridad = "IMPAR";
            }
            System.out.println(i + " - " + paridad);
            i++;
        }
        while (i <= 10);
    }
}
