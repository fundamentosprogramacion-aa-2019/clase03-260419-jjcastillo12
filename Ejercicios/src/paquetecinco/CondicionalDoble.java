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
public class CondicionalDoble {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de su calificación");
        int calificacion = entrada.nextInt();
        String mensaje = MiMensaje.mensajeUno;
        String mensaje2 = MiMensaje.mensajeDos;
        if (calificacion >= 80) {
            System.out.printf("Su %s con %d puntos\n", mensaje, calificacion);
        } else {
            System.out.printf("Su %s con %d puntos\n", mensaje2, calificacion);
        }
    }

}
