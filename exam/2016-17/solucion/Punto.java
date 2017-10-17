/**
 *  Clase Punto: define un punto en el plano cartesiano,
 *  determinado por sus coordenadas x e y.
 *  Contabiliza el número de puntos creados.
 *  @author Libro IIP-PRG
 *  @version 2016
 */
public class Punto {
    private double x;
    private double y;   

    /** Crea un <code>Punto</code> con coordenadas <code>(0.0, 0.0)</code>. */
    public Punto() { this(0, 0); }
    
    /** Crea un <code>Punto</code> con coordenadas <code>(abs, ord)</code>.
     *  @param abs double, la abscisa.
     *  @param ord double, la ordenada.
     */
    public Punto(double abs, double ord) {
        this.x = abs; this.y = ord;        
    }
        
    /** Devuelve la distancia del <code>Punto</code> en curso a <code>p</code>. 
     *  @param p Punto, el punto.
     *  @return double, la distancia.
     */
    public double distancia(Punto p) {
        double abs = p.x - this.x;
        double ord = p.y - this.y;
        return Math.sqrt(abs * abs + ord * ord);
    }
    
	/** Devuelve <code>true</code> si <code>o</code> es un
     *  <code>Punto</code> con las mismas coordenadas que 
	 *  el <code>Punto</code> en curso y devuelve 
	 *  <code>false</code> en caso contrario.
     *  @param o Object, con el que comparar.
     *  @return boolean, true si son dos Puntos iguales; 
     *                   false en caso contrario.
     */
    public boolean equals(Object o) {
        return o instanceof Punto
            && this.x == ((Punto) o).x
            && this.y == ((Punto) o).y;
    }
	
    /** Devuelve un <code>String</code> con los datos del 
     *  <code>Punto</code> en curso en el formato <code>(x, y)</code>.
     *  @return String, representación del Punto.
     */
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
