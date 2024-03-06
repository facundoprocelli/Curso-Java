/*
 * Un pequeño superemercadodese calcular los sueldos de sus empleados
 * Los puestos de los mismos pueden tener 3 categorias 
 * 1 - repositor 2- Cajero y 3- supervisor
 * 
 * Los repositores cobran $16000 + un bono del 10%
 * Los cajeros cobran $26000
 * Los supervisores cobran $35000 en bruto a lo cual se le descuenta el 11% de la jubilacion
 * 
 * 
 * Se enceista un programa que, dependiendo del tipo de empleado del que
 * se trate, calcule y miestre por pantalla el correspoendiente sueldo
 */
package IntroduccionJava;

import java.util.Scanner;


public class EjercicioSupermercado {
    public static void main(String[] args) {
        Scanner tipo = new Scanner(System.in);
        System.out.println("Ingrese qué tipo de empleado es:");
        System.out.println("1= Repositor \n2= Cajero \n3= Supervisor");

        int puesto = tipo.nextInt();
        String cargo[] = {"Repositor", "Cajero", "Supervisor"};
        int monto = 0;

        switch (puesto) {
            case 1:
                monto = 16000 + (16000 / 10); // 16000 + 1600
                break;
            case 2:
                monto = 26000;
                break;
            case 3:
                monto = 35000 - ((35000 * 11) / 100); // 35000 - 3850
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 3.");
                tipo.close(); // Cerrar el Scanner aquí también puede ser una buena práctica si decides terminar la ejecución.
                return; // Terminar la ejecución si se introduce una opción no válida.
        }

        System.out.printf("Su cargo es %s y el sueldo que le corresponde es de $%d.%n", cargo[puesto -1], monto);

        tipo.close();
    }
}
