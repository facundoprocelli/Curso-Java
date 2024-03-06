package IntroduccionJava;


public class ProblemasBasicos {
    
	public static void main(String args[]){

        int num1 = 35;
        int num2 = 20;

        System.err.println("Numero 1: " + num1 + " Numero 2: " + num2);
        int aux = num1;
        num1 = num2;
        num2 = aux;

        System.err.println("Numero 1: " + num1 + " Numero 2: " + num2);
     }
}
