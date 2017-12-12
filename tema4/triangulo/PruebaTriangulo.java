
/**
 * Write a description of class PruebaTriangulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PruebaTriangulo {
    public static void main() {
        Punto p1 = new Punto();
        Punto p2 = new Punto(0,1);
        Punto p3 = new Punto();     
        
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)){
            System.out.println("Triańgulo no válido");
        }
        else {
            Triangulo tri = new Triangulo(p1, p2, p3);
            System.out.println( tri );
            System.out.println("El perímetro es: " + tri.perimetro());
        }   
    }
}
