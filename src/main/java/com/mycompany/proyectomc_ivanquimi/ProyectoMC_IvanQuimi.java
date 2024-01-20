/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectomc_ivanquimi;

import java.util.Scanner;

/**
 *
 * @author quimi
 */
public class ProyectoMC_IvanQuimi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos mc = new Metodos();

        int[] tamanioMatriz = mc.ingresarTamanioMatriz();
        int size = tamanioMatriz[0];
        char caracter = ' ';  // Carácter por defecto, puedes cambiarlo según tus necesidades

        do {
            System.out.println("|____________Menu De Opciones____________|");
            System.out.println("|1.- Ingresar Caracter en la matriz      |");
            System.out.println("|2.- Mostrar Matriz de forma Ascendente  |");
            System.out.println("|3.- Mostrar Matriz de forma Descendente |");
            System.out.println("|4.- Salir                               |");
            System.out.print(">");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    if (mc.matriz == null) {
                        int[] datosCaracter = mc.ingresarCaracter();
                        caracter = (char) datosCaracter[0];
                        mc.inicializarMatriz(size, caracter);

                    } else {
                        System.out.println("La matriz ya ha sido inicializada. Por favor, elija otra opción.");
                    }
                    break;
                case 2:
                    if (mc.matriz == null) {
                        System.out.println("No se han ingresado datos en la matriz. Por favor, ingrese datos.");
                        mc.mostrarMatrizAscendenteAsteriscos(size);
                    } else {
                        mc.mostrarMatrizAscendente();
                    }
                    System.out.println("");
                    break;
                case 3:
                    if (mc.matriz == null) {
                        System.out.println("No se han ingresado datos en la matriz. Por favor, ingrese datos.");
                        mc.mostrarMatrizDescendenteAsteriscos(size);
                    } else {
                        mc.mostrarMatrizDescendente();
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    return;
                default:
                    System.out.println("Ingrese un número de las opciones del menú...");
                    break;
            }

        } while (true);
    }
}
