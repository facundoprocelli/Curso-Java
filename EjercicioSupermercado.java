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

import java.util.Scanner;

public class EjercicioSupermercado {
    public static void main(String[] args) {
        
        
        Scanner tipo = new Scanner(System.in);
        System.out.println("Ingrese que tipo de empleado es:");
        System.out.println("1= Repositor \n 2= Cajero \n 3 = Supervisor");

        
        int puesto = tipo.nextInt();
        String cargo = "";
        int monto = 0;

        switch (puesto) {
            case 1:
                monto = 16000 + (16000 / 10);
                cargo = "Repositor";
                break;
                case 2:
                monto = 26000;
                cargo = "Cajero";
                break;
                case 3:
                monto = 35000 - ((35000 *11) / 100);
                cargo = "Supervisor";
                break;
        
            default:
                monto = 00;
                break;
        }

        System.out.printf("Su cargo es %s y el suledo que le corresponde es de &%d.", cargo, monto);


        tipo.close();
    }

}
