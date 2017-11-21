import java.util.Scanner;

/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        System.out.println( numero + "! = " + factorial(numero));
    }
    
    private static double factorial (int n){
        double fact = 1;
        for( int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    
}
