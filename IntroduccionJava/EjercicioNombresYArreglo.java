package IntroduccionJava;
/*
 * 
 * Llevar a cabo un porgramam que incluya un vector que almacene los nombres:
 *  Alejandra, Rosa,Guillemro, Gabriel, Daniel, Luisa y Ludmila.
 * Realizar un recorrido del vector para cargar los datos y otro recorrido
 *  para mostrar los mismos por pantalla
 */

 /*
  * En java a diferencia de C, los tipo String ya de por si guardan un string de 
  determinada logitudo, por lo tanto no es necesario que definamos  la longitu de  
  los strings como si fuesen una matriz
  */


public class EjercicioNombresYArreglo {

    public static void main(String[] args) {
        
        String vector[] = new String[8];

        vector[0] = "Alejandra";
        vector[1] = "Rosa";
        vector[2] = "Guillermo";
        vector[3] = "Daniel";
        vector[4] = "Luisa";
        vector[5] = "Ludmila";
        vector[6] = "Gabriel";
        vector[7] = "Juan";


        for (int i = 0; i < vector.length; i++)
        {
            System.out.println("posicion " + i + " nombre: \n" + vector[i]);
        }


    }
    
}
