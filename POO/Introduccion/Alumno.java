package POO.Introduccion;


/// clases
public class Alumno {
    

// Atributos
    int id;
    String nombre;
    String apellido;


// Cosntructor Vacio
    public Alumno()
    {

    }
// Constructor lleno

    public Alumno(int id, String nombre, String apellido)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

// Metodos
    public void mostrarNombre() 
    {

        System.out.println("Hola, soy un alumno y se decir mi nombre");

    }

    public void saberAprobado(double calificacion)
    {
        if (calificacion >= 6)
        {
            System.out.println("Aprobe la materia");
        }
        else
        {
            System.out.println("uyyy no aporbé");
        }

    }
}
