import java.util.Scanner;

/**
 * Write a description of class Primos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primos {
    public static void main(String[] args){
        int numero = leerNumero();
        System.out.println(esPrimo(numero));
    }
    
    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número: ");
            n = teclado.nextInt();
        } while ( n < 0 );
        return n;
    }
    
    private static boolean esPrimo(int n){
        boolean primo = ! esPar(n);
        for(int i = 3; i < n / 2 && primo == true; i += 2){
            if(n % i == 0)
                primo = false;  
       }
        return primo;
    }   
    
    private static boolean esPar(int n){
        return n % 2 == 0;
    }
    
    
}
