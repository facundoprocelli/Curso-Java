import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");


        // Declaracion vector

        int[] vector = new int[4];

        //Asignacion manual



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