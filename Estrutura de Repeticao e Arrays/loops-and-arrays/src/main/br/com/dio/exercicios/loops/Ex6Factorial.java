package com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Factorial: ");
        int factorial = sc.nextInt();

        int mult = 1;

        for (int i=factorial; i>= 1; i--){
            mult *= i;
        }

        System.out.print(factorial + "! = " + mult);

    }
}
