package IfElse;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Problema5{
    public static void main(String[] args) {
        /*Realizar un programa que simule un inicio de sesion solicitando el nombre
        * del usuario y contraseña, y mostrar un mensaje en pantalla, inicio de sesion correcto
        * o inicio de sesion incorrecto*/
        String nombreUsuario;
        int contraseña = 0;
        for (int i = 3 ; i >= 0; i--){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digitar el nombre del Usuario: ");
            nombreUsuario = sc.nextLine();
            System.out.println("Digitar la contraseña: ");
            contraseña = sc.nextInt();
            if ((nombreUsuario.equals("Alvaro Aranibar")) && (contraseña == 123456)){
                System.out.println("Inicio de sesion correcto");
                break;
            }else {
                System.out.println("Inicion de sesion incorrecto");
                System.out.println("Le queda " + i + " intentos");
                if (i == 0){
                    System.out.println("Tiene 24 para otros 10 intentos");
                }
            }
        }
    }
}
