package IfElse;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        /*Ordenar tres numeros de mayor a menor*/
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar el primer numero");
        a = sc.nextInt();
        System.out.println("ingresar el segundo numero");
        b = sc.nextInt();
        System.out.println("ingresar el tercer numero");
        c = sc.nextInt();

        if ((a > b) && (b > c)){
            System.out.println(a +" "+ b +" "+ c);
        } else if ((a > c) && (c > b)) {
            System.out.println(a +" "+ c +" "+ b);
        } else if ((b > a) && (a > c)) {
            System.out.println(b +" "+ a +" "+ c);
        } else if ((b > c) && (c > a)) {
            System.out.println(b +" "+ c +" "+ a);
        } else if ((c > a) && (a > b)) {
            System.out.println(c +" "+ a +" "+ b);
        } else if ((c > c) && (c > b)) {
            System.out.println(c +" "+ c +" "+ b);
        }
    }
}
