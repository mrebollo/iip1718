
/**
 * Write a description of class Pi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pi {
   public static void main(){
       int radio = 1;
       int dentro = 0;
       Punto centro = new Punto();
       
       for(int i = 0; i < 1e6; i++){
           Punto p = new Punto(-1, 1);   
           if (p.distancia(centro) <= radio){
               dentro++;
            }
        }
       
       int puntos = (Punto.totalPuntos()-1);
       double div = (double)dentro / puntos;
       System.out.println(4 * div);
    }
}
