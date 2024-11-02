package com.mycompany.unidad2;

import java.util.Scanner;


public class ejercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer valor:");
        int A = scanner.nextInt();
        System.out.println("Introduce el segundo valor:");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println(A + " es el mayor");
        } else if (B > A) {
            System.out.println(B + " es el mayor");
        } else {
            System.out.println("A y B son iguales");
        }
    }
}