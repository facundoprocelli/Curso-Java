import java.util.Scanner;

public class Matrices {
    
    public static void main(String[] args) {
        
        //Declaracion
        //primer valor = horizontal
        //Segundo valor = vertical
        int matriz [] [] = new int [3] [3];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k < 3; k++)
            {
                System.out.println("Ingrese Un valor para la posicion "+ i + " " + k);
                matriz[i][k] = teclado.nextInt();
            }

        }
            teclado.close();
        for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k < 3; k++)
            {
                System.out.println("El valor en la posicion " + i + "|" + k + " es " + matriz[i][k]);

            }

        }



    }
}
