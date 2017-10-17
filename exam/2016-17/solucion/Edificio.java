
public class Edificio {
    public static final int DEPARTAMENTO = 0;
    public static final int ESCUELA = 1;
    public static final int SERVICIOS = 2;
    
    private String codigo, entidad;
    private int tipo; 
    private Punto coordenadas;
    
    public Edificio(String c, String e, int t, Punto p) {
        codigo = c;
        entidad = e;
        tipo = t;
        coordenadas = p;
    }

    public Edificio() {
        this("1F", "DSIC", DEPARTAMENTO, new Punto(39.4625, -0.3472));
    }

    public Punto getCoordenadas() { return coordenadas; }
    
    public void setCoordenadas(Punto p) { coordenadas = p; }
    
    public boolean equals(Object o) {
        return o instanceof Edificio 
            && codigo.equals(((Edificio) o).codigo)
            && coordenadas.equals(((Edificio) o).coordenadas);
    }
    
    public String toString() {
        String res = "Edificio ";
        switch (tipo) {
            case DEPARTAMENTO: 
                res += "departamental "; break;
            case ESCUELA: 
                res += "docente "; break;
            case SERVICIOS: 
                res += "de servicios "; break;
        }
        res += codigo + " (" + entidad + "), GPS: " + coordenadas;
        return res;
    }
    
    public int masCercaRectorado(Edificio e) {
        Punto rectorado = new Punto(39.4823, -0.3457);
        double distThis = coordenadas.distancia(rectorado);
        double distE = e.coordenadas.distancia(rectorado);        
        int resultado = 0;
        if (distThis < distE) { resultado = -1; }
        else if (distThis > distE) { resultado = 1; }
        else if (tipo < e.tipo) { resultado = 1; }
        else if (tipo > e.tipo) { resultado = -1; }
        return resultado;
    }   
} 
