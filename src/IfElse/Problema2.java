package IfElse;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        /*Ingresar 2 numeros enteros diferentes y visualizar el mayor de ellos*/

        int a;
        int b;
        System.out.println("Ingresar el primer numero entero");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        b = sc.nextInt();
        if (a > b){
            System.out.println("El numero " + a + " es el mayor");
        } else {
            System.out.println("El numero " + b + " es el mayor");
        }
    }
}
