
/**
 * Write a description of class Triangulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangulo {
    private Punto v1;  
    private Punto v2;
    private Punto v3; 
    
    public Triangulo() {
        v1 = new Punto(0.0, 0.0);
        v2 = new Punto(1.0, 0.0);
        v3 = new Punto(0.0, 1.0);
    }
    
    public  Triangulo(Punto p1, Punto p2, Punto p3) {
        /* 
        double p1_x = p1.getX();
        double p1_y = p1.getY();
        v1 = new Punto(p1_x, p1_y);
        */
        v1 = new Punto(p1.getX(), p1.getY());
        v2 = p2;
        v3 = p3;
    }
    
    public Triangulo (double x1, double y1,
                      double x2, double y2,
                      double x3, double y3) {
        v1 = new Punto(x1, y1);
        v2 = new Punto(x2, y2);
        v3 = new Punto(x3, y3);
    }

    public double perimetro() {
        double lado1 = distancia(v1, v2);
        double lado2 = distancia(v2, v3);
        double lado3 = distancia(v3, v1);
        return lado1 + lado2 + lado3;
    }
    
    public double distancia(Punto p1, Punto p2) {
        p1.setPunto(50,50);
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + 
                         Math.pow(p2.getY() - p1.getY(), 2));
    }
    
    
}
