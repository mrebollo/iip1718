
/**
 * Write a description of class Punto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto {
    private double[] x;

    
    public Punto(int n){
        x = new double[n];
        for(int i = 0; i < n; i++){
                x[i] = 0;
        }
    }
    
    public void aleatorio(){
        for( int i = 0; i < x.length; i++){
            x[i] = Math.random();
        }
    }
    
    public String toString(){
        return "";
    }
    
    public boolean equals(Object o){
        return true;
    }
}
