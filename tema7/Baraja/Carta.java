
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
    
    public String toString(){
        String[] etiqueta = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String res = etiqueta[numero] + " de ";;
        switch(palo){
            case PICAS: res += "picas"; break;
            case CORAZONES: res += "corazones"; break;
            case TREBOLES: res += "tréboles"; break;
            case DIAMANTES: res += "diamantes"; break;
        }
        return res;
    }
    
    public boolean equals(Object o){
        return o instanceof Carta && 
            numero == ((Carta)o).numero &&
            palo == ((Carta)o).palo;
    }

}
