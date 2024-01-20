package com.mycompany.proyectomc_ivanquimi;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos {

    char[][] matriz;

    public int[] ingresarTamanioMatriz() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada (MxM): ");
        int size = sc.nextInt();

        return new int[]{size};
    }

    public int[] ingresarCaracter() {
        Scanner sc = new Scanner(System.in);

        // Ingresar un solo carácter
        char caracter;
        do {
            System.out.print("Ingrese un único carácter: ");
            caracter = sc.next().charAt(0);
        } while (!Character.isLetter(caracter));

        return new int[]{caracter};
    }

    
    public void inicializarMatriz(int size, char caracter) {
        matriz = new char[size][size];
        // Llenar la matriz con el carácter ingresado
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                matriz[i][j] = caracter;
            }
        }
    }



    public void mostrarMatrizAscendente() {
        if (matriz == null || matriz.length == 0) {
            System.out.println("No se han ingresado datos en la matriz. Por favor, ingrese datos.");
            return;
        }

        System.out.println("Matriz de forma ascendente:");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j < matriz[i].length - i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatrizDescendente() {
        if (matriz == null || matriz.length == 0) {
            System.out.println("No se han ingresado datos en la matriz. Por favor, ingrese datos.");
            return;
        }

        System.out.println("Matriz de forma descendente:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j < matriz[i].length - i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatrizAscendenteAsteriscos(int size) {
        System.out.println("Matriz de forma ascendente (con asteriscos):");
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (j < size - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatrizDescendenteAsteriscos(int size) {
        System.out.println("Matriz de forma descendente (con asteriscos):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
