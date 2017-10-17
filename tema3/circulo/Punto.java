
/**
 * Clase que implementa un punto enun espacio 2D
 *
 * @author IIP 17-18 (@mrebollo)
 * @version 1.0
 * @since 20171003
 */
public class Punto {
    private double x;
    private double y;

    
    public Punto () {
        //x = 0;
        //y = 0;
        x = Math.random();
        y = Math.random();
    }
    
    public Punto(double valorX, double valorY) {
        x = valorX;
        y = valorY;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public void setPunto(double valorX, double valorY) {
        x = valorX;
        y = valorY;
    }
    
    public String toString() {
        return "(" + x + "," + y + ")"; 
    }
}
