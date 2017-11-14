import java.util.Scanner;
/**
 * Write a description of class Tabla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tabla {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();
        } while ( numero < 1 || numero > 10);
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(numero +" x " + i + " = " + numero * i);
        }
        
    }
}
