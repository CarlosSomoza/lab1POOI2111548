/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Alumno
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int x=1, y=2, z=3;
        if(++x > y++ || x-- >0)
        z++;
        else
        z--;
        System.out.println(x+""+y+""+z);
    }
}
//Resultado; El codigo muestra "134"
