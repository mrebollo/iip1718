
/**
 * Write a description of class Baraja here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baraja {
    public static final int NUM_CARTAS = 52;
    private Carta[] mazo;
    private int ultima;
    
    public Baraja(){
        mazo = new Carta[NUM_CARTAS];
        for(int palo = Carta.PICAS; palo <= Carta.DIAMANTES; palo++){
            for(int numero = 0; numero < 13; numero++){
                mazo[13*palo+numero] = new Carta(numero, palo);
            }
        }
        ultima = NUM_CARTAS - 1;
    }    
    
    
    public void barajar(){
        for(int k = mazo.length-1; k >= 1; k--){
           int az = (int)(Math.random() * k);
           Carta tmp = mazo[az];
           mazo[az] = mazo[k];
           mazo[k] = tmp;
        }
    }
    
    public Carta buscarCarta(Carta c){
        boolean encontrado = false;
        int i = -1;
        while( i < mazo.length && !encontrado){
            i++;
            if( mazo[i].equals(c)) 
                encontrado = true;            
        }
        if (encontrado) 
            return mazo[i];
        else
            return null;
    }
    
    
    public int buscarPos(Carta c){
        boolean encontrado = false;
        int i = -1;
        while(i < mazo.length && !encontrado){
            i++;
            if( mazo[i].equals(c))
                encontrado = true;
       }
        if (encontrado) 
            return i;
        else
            return -1;
    }
    
    
    public Carta[] repartir(int n){
        Carta[] mano = new Carta[n];
        int j = 0;
        //for( int i = 0; i < mazo.length; i++){
        for( int i = ultima; i > ultima - n; i--){
            mano[j] = mazo[i];
            mazo[i] = null;
            j++;
        }
        ultima -= n;
        return mano;
    }
    
    
    public Carta dameUna(){
        return repartir(1);
    }
    
    
    public String toString(){
        String res = "";
        for(int i = 0; i < ultima; i++){
            res += mazo[i].toString() + "\n";
        }
        return res;
    }
    
    
}
