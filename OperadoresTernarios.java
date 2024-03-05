import java.util.Scanner;

public class OperadoresTernarios {

    public static void main(String[] args) {

        double promedio;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);
        

        System.out.println("Ingrese el pormedio general del alumno de TodoCode");
        promedio = teclado.nextDouble();

        condicionFinal = (promedio >= 6) ? "aprobado" : "Desaprobado";
        System.out.println("La condicion final del alumnos es: " + condicionFinal);
    } 
    
}
