/*
 * en una tabal de 4 filas y 4 colimnas se guardan la snotas de 4 alumnos de secundaria.
 * Cada fila corresponde a la snotas y al pormedioa de cada alumno.
 * Se necesita un porgrama que permita a un porfesor cargar,
 * en las 3 posiciones (columnas) de cada fila, las notas del alumno y que en la ultima columna calculen los pormedios.
 * Una cez realizado los calculos, se desa mostrar las 3 notas de cada ulimno y el promedio correspondiente recorreindo la matriz
 * 
 */
package IntroduccionJava;

import java.util.Scanner;

public class EjercicioMatriz {

    public static void main(String[] args) {

        double matriz[][] = new double[4][4];
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0;

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el alumno n° " + f);
                matriz[f][c] = teclado.nextDouble();
                suma += matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;

        }

        teclado.close();


        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("La %d° nota del alumno %d es %.2f \n",c + 1,f,matriz[f][c] );

            }
            System.out.printf("El promedio de alumnos es: %.2f \n\n", matriz[f][3]);
        }

    }

}
