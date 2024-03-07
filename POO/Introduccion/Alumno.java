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

// Getters (extraer)

    public int getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

// Setters (ingresar)

    public void setID(int id)
    {
        this. id = id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setApellido(String apellido)
    {
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
