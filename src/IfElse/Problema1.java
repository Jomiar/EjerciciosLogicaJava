package IfElse;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        /*si está lloviendo iré en metro al trabajo; si no, iré andando.*/
        String respuesta;
        System.out.println("¿Está lloviendo?");
        Scanner sc = new Scanner(System.in);
        respuesta = sc.nextLine();

        System.out.println(respuesta);

        if (respuesta.equals("si")){
            System.out.println("Ire en metro al trabajo");
        } else {
            System.out.println("Ire andando al trabajo");
        }
    }
}
