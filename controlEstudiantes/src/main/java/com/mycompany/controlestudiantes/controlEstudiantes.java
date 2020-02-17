package com.mycompany.controlestudiantes;

import java.util.Scanner;

/**
 *
 * @author angelrg
 */
public class controlEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadEstudiantes;

        System.out.println("Ingrese el numero de estudiantes:");
        cantidadEstudiantes = Integer.parseInt(scanner.nextLine());
        int[][] estudiantes = new int[cantidadEstudiantes][2];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese carnet del estudiante " + (i + 1) + ":");
            estudiantes[i][0] = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese nota del estudiante " + (i + 1) + ":");
            estudiantes[i][1] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Carnet del estudiante " + estudiantes[i][0]);
            System.out.println("Nota del estudiante " + estudiantes[i][1]);
        }

        int opcion = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 Promedio");
            System.out.println("2 Nota mas alta");
            System.out.println("3 Nota mas baja");
            System.out.println("4 salir");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Promedio: " + promedio(estudiantes, cantidadEstudiantes));

                    break;
                case 2:
                    nota(estudiantes, cantidadEstudiantes,opcion);
                    break;
                case 3:
                    nota(estudiantes, cantidadEstudiantes, opcion);
                    break;
            }

        } while (opcion < 4 && opcion > 0);

    }

    public static double promedio(int[][] estudiantes, int cantidadEstudiantes) {
        double prom = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            prom += estudiantes[i][1];
        }
        return (prom / cantidadEstudiantes);
    }

    public static void nota(int[][] estudiantes, int cantidadEstudiantes, int operacion) {
        int carnet = estudiantes[0][0];
        int nota = estudiantes[0][1];

        for (int i = 1; i < cantidadEstudiantes; i++) {
            if (operacion == 2) {
                if (estudiantes[i][1] > nota) {
                    nota = estudiantes[i][1];
                    carnet = estudiantes[i][0];
                }
            } else if (operacion == 3) {
                if (estudiantes[i][1] < nota) {
                    nota = estudiantes[i][1];
                    carnet = estudiantes[i][0];
                }
            }
        }

        System.out.println("La nota es: " + carnet + " -> " + nota + " en operacion " + operacion);
    }
}
