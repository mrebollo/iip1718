
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
    
    public double[] getCoordenadas(){
        double[] a = new double[x.length];

       
        for ( int i = 0; i < x.length; a[i] = x[i++] )
            ;
        return a;
    }
    
    public void setCoordenadas(double[] array){
        x = array;
    }
    
    public void suma(double valor){
        for(int i = 0; i < x.length; i++){
            x[i] += valor;
        }
    }
 
    public void producto(double valor){
        for(int i = 0; i < x.length; i++){
            x[i] *= valor;
        }
    }
    
    public boolean suma(Punto p){
        boolean res = false;
        if( x.length == p.x.length){
            res = true;
            for(int i = 0; i < x.length; i++){
                x[i] += p.x[i];
            }
        }
        return res;
    }
    public String toString(){
        return "";
    }
    
    public boolean equals(Object o){
        return true;
    }
}
