/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclases;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Matricula {

    public static void main(String[] args) {
        // declaracion de variables
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String estadoCivil;
        int edad;
        double costo_matricula = 1200;
        double costo_final = 0;
        double descuento = 0;
        double impuesto;
        // entrada de datos
        System.out.println("Ingrese su ciudad de nacimiento");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su estado civil");
        estadoCivil = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        //Descuento

        if (ciudad == "Loja" && ciudad == "Zamora") {
            descuento = descuento + (20 * costo_matricula) / 100;

        }
        if (edad >= 17 && edad < 20) {
            descuento = descuento + (10 * costo_matricula / 100);

        }
        if (estadoCivil == "Casado") {
            descuento = descuento + (5 * costo_matricula / 100);
        }
        // calculo del impuesto al valor final
        impuesto = (2 * costo_matricula) / 100;
        costo_final = costo_matricula - descuento + impuesto;
        System.out.printf("Su matrícula es %.2f", costo_final);
    }
}
