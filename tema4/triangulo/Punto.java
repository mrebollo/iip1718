
/**
 * Clase que implementa un punto enun espacio 2D
 *
 * @author IIP 17-18 (@mrebollo)
 * @version 2.0
 * @since 20171010
 */
public class Punto {
    private double x;
    private double y;

    
    public Punto () {
        this(0.0, 0.0);
    }
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(int inferior, int superior) {
        x = generarAleatorio(inferior, superior);
        y = generarAleatorio(inferior, superior);
        /*this(generarAleatorio(inferior, superior),
             generarAleatorio(inferior, superior));
          */   
    }
    
    private double generarAleatorio(double inf, double sup){
        return Math.random()*(sup - inf) + inf;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public void setPunto(double valorX, double valorY) {
        x = valorX;
        y = valorY;
    }
    
    public double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.getX() - this.x, 2) + 
                         Math.pow(otroPunto.getY() - this.y, 2));
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")"; 
    }
    
    public boolean equals(Object otroPunto){
        boolean sonIguales = otroPunto instanceof Punto &&
                             (x == ((Punto)otroPunto).getX()) &&
                             (y == ((Punto)otroPunto).getY());
        return sonIguales;
        /*
        return otroPunto instanceof Punto &&
               (x == ((Punto)otroPunto).getX()) &&
               (y == ((Punto)otroPunto).getY());
               */
    }
}
