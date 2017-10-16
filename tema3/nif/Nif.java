
/**
 * Write a description of class Nif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nif {
    private int dni;
    private char letraDni;
    private char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public Nif (int numero, char let){
        dni = numero;
        letraDni = let;
    }
    
    public Nif (int numero){
        dni = numero;
        letraDni = obtenerLetra();
    }
    
    public char getLetra() { return letraDni; }
    public int getNumero() { return dni; }
    
    public boolean esCorrecto () {
        char letraCorrecta = obtenerLetra();
        return (letraCorrecta == letraDni);
    }
    
    public char obtenerLetra() {
        int resto = dni % 23;
        return letra[resto];
    }
    
    public String toString() {
        return dni + "-" + letraDni;
    }
}
