package POO.Herencia;
//            El extends nos permite traer las cosas de la otra clase
public class Empleado extends Persona {

    int num_Legajo;
    String cargo;
    Double sueldo;
    
    public Empleado(){

    }

    public Empleado(int num_Legajo, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String telefono){

        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_Legajo = num_Legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

     // Getters
        
     public int getNum_Legajo(){
        return num_Legajo;
     }
     public String getCargo(){
        return cargo;
     }
     public Double getSueldo(){
        return sueldo;
     }

     //Setters

     public void setNum_Legajo(int num_Legajo){
        this.num_Legajo = num_Legajo;
     }

     public void setCargo(String cargo){
        this.cargo = cargo;
     }

     public void setSueldo(Double sueldo){
        this.sueldo = sueldo;
     }

}
