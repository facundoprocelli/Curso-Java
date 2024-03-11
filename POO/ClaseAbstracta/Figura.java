package POO.ClaseAbstracta;

public abstract class Figura {

    protected double x; // Posicion en x
    protected double y; // Posicion en y
    
    protected Figura(){

    }

    protected Figura (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();

}
