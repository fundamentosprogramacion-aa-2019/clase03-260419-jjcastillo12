/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

import java.util.Scanner;
import paquetedos.MiMensaje;

/**
 *
 * @author Salas
 */
public class CondicionalSimple {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int calificacion, calificacion_2;

        System.out.println("Ingrese la primera calificación");
        calificacion = entrada.nextInt();
        System.out.println("Ingrese la segunda calificación");
        calificacion_2 = entrada.nextInt();

        String mensaje = MiMensaje.mensajeUno;
        if (calificacion >= 85) {
            System.out.printf("%s con %d puntos\n", mensaje, calificacion);
        }

        if (calificacion_2 >= 85) {
            System.out.printf("%s con %d puntos\n", mensaje, calificacion_2);

        }
    }
}
