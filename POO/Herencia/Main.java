package POO.Herencia;

public class Main {
    
    public static void main(String[] args) {
        // Creamos el tipo de dato empleado 
        Empleado emple = new Empleado();
        // Aca podes acceder tanto a los que son propios de empleado
        emple.getNum_Legajo();
        // O tambien a los que heredo de persona 
        emple.getNombre();
    }
}
