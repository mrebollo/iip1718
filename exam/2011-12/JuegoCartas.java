/**
 * Clase JuegoCartas para probar la funcionalidad de la clase Carta.
 *
 * @author IIP
 * @version Curso 2011/12
 */
import java.util.*;

public class JuegoCartas {
    
    public static int gana(Carta c1, Carta c2, int triunfo) {
        int ganadora = 1;
        if (c1.equals(c2)) ganadora = 0;
        else if (c1.getPalo()==c2.getPalo()) {
            if ( c1.getValor()==1 ||
            (c2.getValor()!=1 && c1.getValor()>c2.getValor()) ) ganadora = -1;
        }
        else if (c1.getPalo()==triunfo || c2.getPalo()!=triunfo) ganadora = -1;
        return ganadora;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        // Crear una Carta solicitando el palo y el valor al usuario desde teclado
        System.out.print("Introduce el palo (0=OROS, 1=COPAS, 2=ESPADAS y 3=BASTOS): ");
        int palo = tec.nextInt();
        System.out.print("Introduce el valor (entero entre 1 y 12): ");
        int valor = tec.nextInt();
        Carta c1 = new Carta(palo,valor);
        System.out.println("Carta 1: " + c1.toString());
        
        // Crear una Carta aleatoria
        Carta c2 = new Carta();
        System.out.println("Carta 2: " + c2.toString());
        
        // Generar aleatoriamente el palo de triunfo
        int triunfo = (int)(Math.random()*4);
        System.out.print("El palo de triunfo es ");
        switch(triunfo){
            case    Carta.OROS: System.out.println("oros"); break;
            case   Carta.COPAS: System.out.println("copas"); break;
            case Carta.ESPADAS: System.out.println("espadas"); break;
            case  Carta.BASTOS: System.out.println("bastos");
        }
        
        // Indicar la carta ganadora
        int g = gana(c1,c2,triunfo);
        switch(g) {
            case -1: System.out.println("Gana " + c1); break;
            case  1: System.out.println("Gana " + c2); break;
            default: System.out.println("Las cartas son iguales");

        } 
    }
}
