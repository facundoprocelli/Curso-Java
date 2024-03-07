package POO.Herencia;

public class Jefe extends Persona {
    
int id_Jefe;
String departamento_jefe;

public Jefe(){

}

public Jefe(int id_jefe, String departamento_jefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono){

    super(id, dni,nombre, apellido, domicilio, telefono);
    this.id_Jefe = id_jefe;
    this.departamento_jefe = departamento_jefe;
}

// Setters
    public void SetId_jefe(int id_jefe){
        this.id_Jefe = id_jefe;
    }
    public void SetDepartamento_jefe(String departamento_jefe){
        this.departamento_jefe = departamento_jefe;
    }
    
    // Getters
    public int getId_jefe(){
        return id_Jefe;
    }
    public String getDepartamento_jefe(){
        return departamento_jefe;
    }
    
    


}


