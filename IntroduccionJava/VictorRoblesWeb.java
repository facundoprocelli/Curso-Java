package IntroduccionJava;


import java.util.Scanner;

public class VictorRoblesWeb {

    //Funciones

    private String mostrarAltura(int altura)
    {

        String resultado = "";
        if(altura >= 200)
        {
            resultado = ("Eres muy  alto mides " + altura);
        }
        else if (altura < 200 && altura >= 180)
        {
            resultado = ("Eres alto mides "+ altura);
        }
        else
        {
            resultado = ("Eres bajo mides " + altura);
        }

        return resultado;

    }


    public static void main(String[] args) {
        
        // Imprimir mensaje

        System.out.println("Hola Mundo");
        System.out.println("Hola soy Facundo");
        /*
         * 
         * Comentario de 
         * muchas 
         * lineas
         */

         //Variables 
         int edad = 45;
         String nombre = "Facundo Procelli";
         nombre = "Facu";
         Boolean verdadero = true;

         System.out.println(nombre);

         // Concatenación

         System.out.println("Me llamo " + nombre + " tengo " + edad + " años.");

         System.out.printf("Me llamo %s y tengo %d años.", nombre, edad);

        //Entrada de datos

        Scanner sc = new Scanner(System.in);
        /* 
        System.out.println("Como te llamas?");
        String miNombre = sc.nextLine();

        System.out.println("El usuario se llama " + miNombre);
        */

        //Condicionales
        /* 
        System.out.print("Dime cuanto mides");
       
        int altura = sc.nextInt();

        VictorRoblesWeb aplicacion = new VictorRoblesWeb();


        System.out.println(aplicacion.mostrarAltura(altura));
*/

        // Array

        String[] personas = {"victor", "pedro", "juan"};

        personas[2] = "blublu";
        
        System.out.println(personas[2]);



        // Bucle for

        for(String persona: personas)
        {
            System.out.println("- "+ persona);

        }
    }


}
