
/**
 * Write a description of class Aleatoria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aleatoria {
    public static void main(String[] args){
        int nCartas = 100;
        Baraja mazo = new Baraja(nCartas);
        
        for(int i = 0; i < nCartas; i++){
            Carta c = new Carta();
            mazo.addCarta(c);
        }
        System.out.println(mazo);
        
        
        
    }
}
