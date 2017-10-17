/**
 * Clase Carta para representar una carta de la baraja espa~nola. *
 * @author IIP
 * @version Curso 2011/12
 */
public class Carta {
    public static final int OROS = 0;
    public static final int COPAS = 1;
    public static final int ESPADAS = 2;
    public static final int BASTOS = 3;
    private int palo;
    private int valor;
    
    public Carta(int palo, int valor) { this.palo = palo; this.valor = valor; }

    public Carta() {
        palo = (int)(Math.random()*4);
        valor = (int)(Math.random()*12 + 1);
    }

    public int getPalo() { return palo; }

    public int getValor() { return valor; }

    public void setPalo(int palo) { this.palo = palo; }

    public void setValor(int valor) { this.valor = valor; }

    public boolean esMenor(Carta c) {
        return (this.palo < c.palo) || (this.palo == c.palo && this.valor < c.valor);
    }

    public Carta sigPalo() { return new Carta((palo+1) % 4, valor); }

    public boolean equals(Object o) {
        return o instanceof Carta &&
        palo == ((Carta)o).palo && valor == ((Carta)o).valor;
    }

    public String toString() {
        String res = valor + " de ";
        switch (palo) {
            case    OROS: res += "oros"; break;
            case   COPAS: res += "copas"; break;
            case ESPADAS: res += "espadas"; break;
            case  BASTOS: res += "bastos"; break;
        }
        return res; 
    }
}