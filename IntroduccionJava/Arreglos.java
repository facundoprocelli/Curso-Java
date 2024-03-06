package IntroduccionJava;
import java.util.Scanner;

public class Arreglos {
    

    public static void main(String[] args) {
        

        // Declaracion vector

        int vector [] = new int[4];

        //Asignacion manual
        /* 
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;
        */

        //Asignación por teclado

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vector.length; i++)
        {
            System.out.println("Ingrese el valor para el indice " + i);
            vector[i] = teclado.nextInt();
        }
        teclado.close();

        //Recorrido 

        for (int i = 0; i < vector.length; i++)
        {
            System.out.println("pos " + i + " Valor " + vector[i]);

        }


    }
}
