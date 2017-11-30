
/**
 * Write a description of class Carta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carta {
    //constantes para los palos
    public static final int PICAS = 0;
    public static final int CORAZONES = 1;
    public static final int TREBOLES = 2;
    public static final int DIAMANTES= 3;
    
    private int palo;
    private int numero;
    
    public Carta(int n, int p){
        numero = n;
        palo = p;
    }

}
