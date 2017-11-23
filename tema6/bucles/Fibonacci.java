import java.util.Scanner;

/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        fibonacci(numero);
    }
    
    private static void fibonacci (int n){
        int termino;
        int penultimo = 0;
        int ultimo = 1;
        System.out.print("0 1 ");
        for( int i = 2; i < n; i++){
            termino = ultimo + penultimo;
            System.out.print(termino + " ");
            penultimo = ultimo;
            ultimo = termino;
        }
    }
}
