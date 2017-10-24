
/**
 * Clase que implementa un punto enun espacio 2D
 *
 * @author IIP 17-18 (@mrebollo)
 * @version 3.0
 * @since 20171010
 */
public class Punto {
    private double x;
    private double y;
    private static int contador;

    
    /**
     * Punto Constructor
     * Crea un punto por defecto enlas coordenadas (0,0)
     */
    public Punto () {
        this(0.0, 0.0);
    }
    
    /**
     * Punto Constructor
     * Crea un punto de coordenadas (x,y)
     * 
     * @param x coordenada en el eje x
     * @param y coordenada en el eje y
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        contador++;
    }
    
    /**
     * Punto Constructor
     * Crea un punto al azar dentro del espacio 
     * @param inferior limite inferior del intervalo
     * @param superior limite superior del intervalo
     */
    public Punto(int inferior, int superior) {
       this(generarAleatorio(inferior, superior),
            generarAleatorio(inferior, superior));
    }
    
    private static double generarAleatorio(double inf, double sup) {
        return Math.random() * (sup - inf) + inf;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public void setPunto(double valorX, double valorY) {
        x = valorX;
        y = valorY;
    }
    
    public static int totalPuntos() { return contador; }
    
    public static void resetTotal() { contador = 0; }
    
    public double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.getX() - this.x, 2) + 
                         Math.pow(otroPunto.getY() - this.y, 2));
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")"; 
    }
    
    public boolean equals(Object otroPunto) {
        boolean sonIguales = otroPunto instanceof Punto &&
                             (x == ((Punto)otroPunto).getX()) &&
                             (y == ((Punto)otroPunto).getY());
        return sonIguales;
    }
}
