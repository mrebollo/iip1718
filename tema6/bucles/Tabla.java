import java.util.Scanner;
/**
 * Write a description of class Tabla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tabla {
    public static void main(String[] args){
        
        int numero = leerNumero();
        mostrarTabla(numero);       
    }
    
    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número: ");
            n = teclado.nextInt();
        } while ( n < 1 || n > 10);
        return n;
    }
    
    private static void mostrarTabla(int n){
        for(int i = 1; i <= 10; i++) {
            System.out.println(n +" x " + i + " = " + n * i);
        }
    }
}
