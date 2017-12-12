import java.util.Scanner;

/**
 * Write a description of class Blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Blackjack {
     public static void main(String[] args){
       // Crea la baraja
       Baraja miBaraja = new Baraja();
       miBaraja.barajar();
       
       char otra;
       Scanner teclado = new Scanner(System.in);
       do{
           Carta[] laCarta = miBaraja.dameUna;
           System.out.println(laCarta);
           System.out.print("¿Otra (s/n)? ");
           otra = teclado.nextLine().charAt(0);
        } while( otra == 's' );
    }
    
}
