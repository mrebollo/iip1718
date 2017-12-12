
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
       
       Carta[] mano1, mano2;
       mano1 = miBaraja.repartir(5);
       System.out.println(miBaraja);
       System.out.println("Jugador 1");
       for(int i = 0; i < mano1.length; i++){
           System.out.println(mano1[i]);
        }
           
       mano2 = miBaraja.repartir(5);
       System.out.println("Jugador 2");
       for(int i = 0; i < mano2.length; i++){
           System.out.println(mano2[i]);
        }
       
    }
}
