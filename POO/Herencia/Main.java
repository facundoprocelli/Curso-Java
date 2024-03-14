package POO.Herencia;

public class Main {
    
    // Herencia 
    /*
     * 
     */

    public static void main(String[] args) {
        // Creamos el tipo de dato empleado 
        Empleado emple = new Empleado();
        // Aca podes acceder tanto a los que son propios de empleado
        emple.getNum_Legajo();
        // O tambien a los que heredo de persona 
        emple.getNombre();
    }

    


    // Polimorfismo

    /*
     * En un vector que pertenezca a la calse padre, yo puedo guradar 
     * distintos tipos de datos siempre y cuando estos sean hijos de el tipo
     * de vector
     */
    public static void second(String[] args) {
        
        Persona vector [] = new Persona[5];

        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Jefe();
        
// Tambien se puede almacenar un hijo en el padre
        Persona perso = new Persona();
        Empleado emple = new Empleado();

        perso = emple;
    }



}
