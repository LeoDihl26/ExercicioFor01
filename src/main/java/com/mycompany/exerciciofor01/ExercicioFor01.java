package com.mycompany.exerciciofor01;

import java.util.Scanner;

public class ExercicioFor01 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        int x; 
        int i;        
        System.out.printf("Quais os números ímpares antecedem e/ou são iguais ao: ");
        x = teclado.nextInt();
        
        for (i=0; i<=x; i++) {
            if (i%2 !=0) {
                System.out.println("\nNº Ímpar: " + i);    
            } 
        }    
     teclado.close();
    }
}
