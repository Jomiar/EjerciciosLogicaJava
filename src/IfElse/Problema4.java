package IfElse;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        /*Pedir un numero entre o y 99999 y decir cuantas cifras tiene*/
        
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 99999: ");
        a = sc.nextInt();
        if (a < 10){
            System.out.println("El numero tiene 1 cifra");
        } else if (a < 100) {
            System.out.println("El numero tiene 2 cifras");
        } else if (a < 1000) {
            System.out.println("El numero tiene 3 crifras");           
        } else if (a < 10000) {
            System.out.println("El numero tiene 4 cifras");
        } else if (a < 100000) {
            System.out.println("El numero tiene 5 cifras");
        }
    }
}
