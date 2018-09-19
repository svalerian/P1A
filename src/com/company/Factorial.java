package com.company;

public class Factorial {
    public static void main (String[] args){
        //FOR
        int factorial = 1;
        for (int i=6; i>0; i--){
            factorial *= i;
        }
        System.out.println("(FOR) El factorial de 6 es: " + factorial);

        //WHILE
        int factorialw = 1;
        int j=1;
        while (j<6){
            j++;
            factorialw *= j;
        }
        System.out.println("(W) El factorial de 6 es: " + factorialw);

        //DO WHILE
        int k=1;
        int factoriald=1;
        do{
            k++;
            factoriald *= k;
        }
        while (k<6);
        System.out.println("(DW) El factorial de 6 es: " + factoriald);
    }
}
