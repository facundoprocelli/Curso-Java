import java.util.Scanner;

public class EstructurasRepetitivas {
    
public static void main(String[] args) {
    

    /// Controlado por contador
    int i = 0;

    while (i <= 10)
    {
        System.out.println("Vuelta " + i);
        i++;
    }
    /// Controlado por centinela

    boolean c = true;

    while (c == true)
    {
        System.out.println("Bandera es " + c);
        Scanner centinela = new Scanner(System.in);
        c = centinela.nextBoolean();
        centinela.close();
        
    }
    
    for(int k = 0; k <= 10; k++)
    {
        System.out.println("Veulta " + k);
    }

}

}
