 import java.util.Scanner;
 
/**
 * Write a description of class NumeroE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumeroE {
       public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Precisión: ");
        double precision = teclado.nextDouble();
        System.out.println( "e = " + exponencial(precision));
        System.out.println( "valor real: " + Math.E );
    }
    
    private static double exponencial(double precision){
        double e = 0;
        int i = 0;
        double error = 0;
        double anterior = -1;
        while(e - anterior > precision){
            anterior = e;
            e += 1 / factorial(i);
            i++;
        }
        return e;
    }
    
    private static double factorial (int n){
        double fact = 1;
        for( int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
