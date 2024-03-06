package IntroduccionJava;

import java.util.Scanner;

/*
 * En tres vectores diferenes se guardan los nombres, temperaturas maximas y minimas de 
 * 5 ciudades. El primer vector guarda los nombres, el segundo la minima y el tercero la maxima 
 * se necesita un programa que permita la carga de ciudades, sus temeperaturas; 
 * además, debera poder infromar por pantalla cual fie la ciudad con la temperatura mas alta y mas baja
 * dando a conocer la cantidad de grados
 */


public class VectoresParalelos {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] Ciudades = new String[5];
        double[] minima = new double[5];
        double[] maxima = new double[5];
        double min = 100;
        double max = -100;
        int maxi= 0;
        int mini = 0;

        for (int i = 0; i < Ciudades.length; i++)
        {
            System.out.println("Ingrese el nombre de la ciudad: ");
            Ciudades[i] = teclado.nextLine();

            System.out.println("Temepratura Minima");
            minima[i] = teclado.nextDouble();
            teclado.nextLine();
            if (minima[i] < min)
            {
                mini = i;
                min = minima[i];
            }
            System.out.println("Temperatura Maxima: ");
            maxima[i] = teclado.nextDouble();
            teclado.nextLine();
            if(maxima[i] > max)
            {
                maxi = i;
                max = maxima[i];
            }
        }



        System.out.println("La ciudad con Las minimas mas bajas es " + Ciudades[mini] + " con " + minima[mini]);
        System.out.println("La ciudad con Las maximas mas altas es " + Ciudades[maxi] + " con " + maxima[maxi]);

        

        teclado.close();
    }

}
