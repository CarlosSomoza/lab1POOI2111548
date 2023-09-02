/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class PREGUNTA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String diaDeLaSemana;

        switch (numero) {
            case 1:
                diaDeLaSemana = "Lunes";
                break;
            case 2:
                diaDeLaSemana = "Martes";
                break;
            case 3:
                diaDeLaSemana = "Miércoles";
                break;
            case 4:
                diaDeLaSemana = "Jueves";
                break;
            case 5:
                diaDeLaSemana = "Viernes";
                break;
            case 6:
                diaDeLaSemana = "Sábado";
                break;
            case 7:
                diaDeLaSemana = "Domingo";
                break;
            default:
                diaDeLaSemana = "Número inválido";
                break;
        }

        System.out.println("El día de la semana es: " + diaDeLaSemana);

        scanner.close();
    }
}
