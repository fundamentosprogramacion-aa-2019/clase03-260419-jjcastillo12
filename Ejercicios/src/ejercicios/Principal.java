/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import paquetetres.Demo;
import paquetecuatro.DemoDos;

/**
 *
 * @author Salas
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        int suma;
        int multiplicacion;

        suma = Demo.valor + DemoDos.valorDos;
        multiplicacion = Demo.valor * DemoDos.valorDos;
        System.out.printf("%d\n%d\n", suma, multiplicacion);

    }
}
