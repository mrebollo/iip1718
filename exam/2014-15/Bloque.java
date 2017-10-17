public class Bloque {
    private int color;
    private int dimension;
    private boolean comodin;
    public static final int AZUL = 0;
    public static final int ROJO = 1;
    
    public Bloque() {
        this.color = AZUL;
        this.dimension = (int) (1 + Math.random() * 50);
        this.comodin = false;
    }

    public Bloque(int color, int dimension, boolean comodin) {
        this.color = color;
        this.dimension = dimension;
        this.comodin = comodin;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dim) {
        dimension = dim;
    }

    public boolean puedeEstarEncimaDe(Bloque b) {
        return this.dimension <= b.dimension
        && (this.comodin || this.color != b.color);
    }

    public boolean equals(Object o) {
        return o instanceof Bloque
        && this.color == ((Bloque) o).color
        && this.dimension == ((Bloque) o).dimension
        && this.comodin == ((Bloque) o).comodin;
    }

    public String toString() {
        String col = "azul";
        if (this.color == ROJO) col = "rojo";
        String com = "NO";
        if (this.comodin) com = "SÍ";
        return "(Color: "+ col + ", dimensión: " + dimension + ", ";
    } 
}