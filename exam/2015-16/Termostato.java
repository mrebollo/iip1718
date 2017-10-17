/**
 *  Clase Termostato: representa un termostato 
 *  @author Examen IIP
 *  @version Primer Parcial - Curso 2015-2016
 */
public class Termostato {          
    public static final int FRIO = 0;
    public static final int CALOR = 1;
    public static final int T_IDEAL_FRIO = 25;
    public static final int T_IDEAL_CALOR = 20;    
    
    private String nombre;
    private int modo;
    private int tConfort;
    private double tActual;
    
    public Termostato(int m, String n, int tC, double tAct) {
        modo = m; nombre = n; tConfort = tC; tActual = tAct;
    }
    
    public Termostato() {  
        this(FRIO, "zona de estar", T_IDEAL_FRIO, generarAleatorio(20.0, 40.0));
    }    
    
    private static double generarAleatorio(double x, double y) {
        return x + Math.random() * (y - x);
    }   
    
    public int getModo() { return modo; }    
    
    public void setModo(int nuevo) { modo = nuevo; }
    
    public boolean equals(Object otro) {
        boolean res = otro instanceof Termostato;
        if (res) {
            Termostato t = (Termostato) otro;
            res = nombre.equals(t.nombre) && modo == t.modo 
                && tConfort == t.tConfort
                && Math.abs(tActual - t.tActual) < 1; 
        }
        return res;
    }
    
    public String toString() {
        String m = "refrigeracion";
        if (this.modo == CALOR) { m = "calefacción"; }
        return nombre + ", modo " + m + ", TConfort = " + tConfort 
               + ", TActual = " + tActual;
    }   
    
    public int diferenciaConIdeal() {
        int res = 0;
        if (modo == FRIO) {
            if (tConfort < T_IDEAL_FRIO) {
                res = Math.abs(tConfort - T_IDEAL_FRIO);
            }
        } else {
            if (tConfort > T_IDEAL_CALOR) {
                res = Math.abs(tConfort - T_IDEAL_CALOR);
            }
        }
        return res;
    }        
}
