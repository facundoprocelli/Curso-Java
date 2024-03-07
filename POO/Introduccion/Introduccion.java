package POO.Introduccion;

public class Introduccion {

    public static void main(String[] args) {
        
        // Creado y llamado de un alumno
            //Cosntructor vacio
        Alumno alu1 = new Alumno();
        
            //Constructor lleno
        Alumno alu2 = new Alumno(2, "Facundo", "Procelli");
    
        // Aplicacion getters
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());

            // Aplicacion setters
        alu1.setID(8);
        alu1.setNombre("Nicolas");
        alu1.setApellido("Procelli");

            // Aplicacion getters
        System.out.println("-------------------------");
        
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());
        
        System.out.println("-------------------------");
        // Modificar datos con setters

        alu2.setID(35);

        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());


    }
    
}

/*
 *------------- ¿Que es un paradigma?----------------------------
 *       Un paradigma es todo aquel modelo, patro o ejemplo que debe
 *       seguirse en determianda situación.
 * 
 * ----------------Paradiga Orientado a Objetos---------------------------
 * 
 *      La implementacion de un paradigma de rpogramacion
 * 
 *      La POO se basa en la idea de un mundo lleno de objetos y que la resolucion de
 *      problemas se realizam mediante el modelado/abstraccion de objetos de la vida real.
 * 
 *      Los objetos pueden comunicarse entre si mediante mensajes
 * 
 * -----------Programación Oreintada a Objetos-----------------------
 *      Se basa en el concepto de agrupar codigo, y datos juntos dentro de una misma 
 *      unidadad llamada clase. (Todo lo que es de cocina va en la misma caja por ejemplo).
 * 
 *       Sus principales caracter+isticas son:
 *                 *Abstracción
 *                 *Encapsulamiento
 *                 *Polimorfismo
 *                 *Herencia
 *                 *UML (Lenguaje universal de modelado)
 * 
 * ------------- Clases ----------------------------
 *      *Es una plantilla o molde que permite construir objetos.
 *          Si tuvieramos la calse Auto, esta seria el plano para construirlo
 * 
 *      *Representan entidades del mundo real
 *      *Poseen atributos y métodos
 *      *No pueden ser utilizados directamente (sino mediante instancias  a objetos)
 * 
 * -----------------------Metodos-----------------------
 * 
 *      *Son acciones contenidas en un aclase y definen su compartamiento
 *      *Dentro de un sistema, las operaciones suelen detectarse como verbos
 *      *Desde la perspectiva de Diseño y Programaci+on, se denominan Métodos.
 *      *Desde la perspectiva del Análisis, se denominan Operaciones
 *      *Puede tener opcionalmente valores de entrada y valores de salida
 *      *Pueden existir procedimientos (no retorno) y Funciones (retorno)
 * 
 * 
 * ----------------Objetos-----------------------
 * 
 *      *Un objeto es una instancia de una clase
 *      *Es la representacion de un objeto que generalmente existe en la vida real
 *      *Posee un estado (de acuerdo a sus atributos)
 *      *Posee un comportamiento (realizan operacion de acuerdo a sus métodos)
 * 
 * --------------Constructores--------------------
 * 
 *      *Son funciones especiales que contienen als clase spara permitir la creacion de objetos
 *      *Puede recibir o no recibir datos/parámetros
 *      *Se llama simepre igual que la clase
 *      *No retorna Ningún valor (ni siquiera VOID)
 *      *Generalmente se utilizan dos tipos de constructores
 *          -Cosntructor vacio
 *          -constructor con todos los parámetros 
 * -------------------- Getters y Setters-----------------
 * 
 *      * Getters sirven principalmente para acceder a los datos de un objeto 
 *      * Setters sirven para añadir o modifcar los datos de un objeto
 * 
 * 
 * -------------------------- Herencia -----------------------
 *
 *      *Hay clases que comparten gran parte de sus características.
 *      *El mecanismo conocido con el nombre de herencia permite reutilizar clases.
 *          Se crea una nueva clase que exteinde la funconalidad de una clase existente 
 *          sin tener que reescribir el código asociado a esta última.
 *      *La nueva clase, a la que se denomica sublcase, puede poseer atributos y
 *           metodos que no existan en la calse original
 *      *Los objetos de la nueva calse heredan los atributos y los métodos de la case original
 *          Que se denomina superclase.
 * 
 * ------------------------Polimorfismo-------------------------
 * 
 *      * Como comparten un padre en comun , pueden realizar las mismas acciones 
 *      * Si vehiculo tiene la funcion estacionar, coche moto y bus la pueden usar ya que son 
 *          clases hijas del mismo padre
 *      * Yo puedo a un hijo ponerle las características del padre
 *          pero a un padre no puedo ponerle las del hijo 
 * 
 */

