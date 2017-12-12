
/**
 * Write a description of class JuegoCartas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JuegoCartas {
    public static void main(String[] args){
       Baraja miBaraja = new Baraja();
  
       System.out.println(miBaraja);
       miBaraja.barajar();
       System.out.println(miBaraja);
        
       Carta asPicas = new Carta(0,Carta.PICAS);
       
       Carta cartaEncontrada = miBaraja.buscarCarta(asPicas);
       
       int posCarta = miBaraja.buscarPos(asPicas);
       System.out.println(posCarta);
    }
}
