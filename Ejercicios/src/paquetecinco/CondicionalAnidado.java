/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

import paquetedos.MiMensajeDos;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class CondicionalAnidado {

    public static void main(String[] args) {
        // documentacion
        String mensaje = MiMensajeDos.mensaje;
        String mensajeUno = MiMensajeDos.mensajeUno;
        String mensajeDos = MiMensajeDos.mensajeDos;
        String mensajeTres = MiMensajeDos.mensajeTres;
        String mensajeReprobatorio = MiMensajeDos.mensajeReprobatorio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de su calificación");
        int calificacion = entrada.nextInt();

        if (calificacion >= 90) {
            System.out.printf("%s %s con %d\n", mensaje, mensajeUno,
                    calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s %s con %d\n", mensaje, mensajeDos,
                        calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s %s con %d\n", mensaje, mensajeTres,
                            calificacion);

                } else {
                    System.out.printf("%s con %d\n", mensajeReprobatorio,
                            calificacion);
                }
            }
        }
    }
}
