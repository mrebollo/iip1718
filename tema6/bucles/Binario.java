import java.util.Scanner;

/**
 * Write a description of class Binario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Binario {
   public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        System.out.println( numero + " = " + dec2bin(numero));
    }
    
    private static String dec2bin (int n){
        String binario = "";
        int decimal = n;
        while(decimal > 0){
            binario = decimal % 2 + binario ;
            decimal = decimal / 2;
        }
        return binario;
    }
}
