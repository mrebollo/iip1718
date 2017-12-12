
/**
 * Write a description of class Baraja here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baraja {
    private Carta[] mazo;
    
    public Baraja(){
        mazo = new Carta[52];
        for(int palo = Carta.PICAS; palo <= Carta.DIAMANTES; palo++){
            for(int numero = 0; numero < 13; numero++){
                mazo[13*palo+numero] = new Carta(numero, palo);
            }
        }
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
        return null;
    }
    
    public String toString(){
        String res = "";
        for(int i = 0; i < mazo.length; i++){
            res += mazo[i].toString() + "\n";
        }
        return res;
    }
    
    
}
