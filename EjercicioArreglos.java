/*
 * Realizar un programa que permita cargar 15 números en u vector.
 * Una vez cargados, se encesita que el programa cuente e informa por 
 * pantalla cuántas veces se cargó el numero 3
 */

import java.util.Scanner;

public class EjercicioArreglos {
    
    public static void main(String[] args) {
        
        int arreglo[] = new int[15];


        //Cargar arreglo

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 15; i++)
        {
            System.out.println("Ingrese un numero");
            arreglo[i] = teclado.nextInt();
        }

        teclado.close();

        int contador = 0;

        for (int i = 0; i < arreglo.length; i++)
        {
            
            if(arreglo[i] == 3)
            {
               contador++; 
            }

        }

            System.out.println("El numero 3 aparecio " + contador + " veces.");




    }
}
