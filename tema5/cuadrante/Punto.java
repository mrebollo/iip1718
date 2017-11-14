
/**
 * Clase que implementa un punto enun espacio 2D
 *
 * @author IIP 17-18 (@mrebollo)
 * @version 3.0
 * @since 20171010
 */
public class Punto {
    public static final int ORIGEN = 0;
    public static final int EJE_X = 5;
    public static final int EJE_Y = 6;
    private double x;
    private double y;
    private static int contador;

    
    public Punto () {
        this(0.0, 0.0);
    }
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        contador++;
    }
    
    public Punto(int inferior, int superior) {
        this(generarAleatorio(inferior, superior),
             generarAleatorio(inferior, superior));
    }
    
    private static double generarAleatorio(double inf, double sup){
        return Math.random()*(sup - inf) + inf;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public void setPunto(double valorX, double valorY) {
        x = valorX;
        y = valorY;
    }
    
    public static int totalPuntos() { return contador; }
    public static void ponteACeroPorFavor()  { contador = 0; }
    
    public double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.getX() - this.x, 2) + 
                         Math.pow(otroPunto.getY() - this.y, 2));
    }
    
    
    public int cuadrante() { 
        int pos = 0;
        if (x > 0) {
            if( y > 0){
                pos = 1;
            } else{
                pos = 2;
            }
        } else if (x < 0) {
            if( y > 0){
                pos = 4;
            } else{
                pos = 3;
            }
        } else {
            if (y == 0){
                pos = ORIGEN;
            } else {
                pos = EJE_X;
            }
        }
        
        if (x > 0 && y > 0){
            pos = 1;
        } else if (x > 0 && y < 0) {
            pos = 2;
        } else if (x < 0 && y > 0) {
            pos = 3;
        } else 
            pos = 4;
            System.out.println("Estoy en el cuadrante 4");
        
        return pos;
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
