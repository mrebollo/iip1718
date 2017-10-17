public class Accion {
    private String empresa;
    private double apertura, minimo, maximo, actual;
    public Accion(String nom, double ape) {
        empresa = nom;
        apertura = minimo = maximo = actual = ape;
    }

    public Accion(String nom, double ape, double min, double max) {
        empresa = nom;
        apertura = ape;
        minimo = min;
        maximo = max;
        actual = ape;
    }

    public String getEmpresa() { return empresa; }

    public double getApertura() { return apertura; }

    public double getMinimo() { return minimo; }

    public double getMaximo() { return maximo; }

    public double getActual() { return actual; }

    public void setActual(double a) {
        if (a<minimo) minimo = a;
        else if (a>maximo) maximo = a;
        actual = a;
    }

    public boolean alAlza() { return (actual>apertura); }

    public boolean equals(Object o) {
        return o instanceof Accion &&
        empresa.equals(((Accion) o).empresa);
    }

    public String toString() {
        return empresa + ": " + actual + " " + minimo + " " + maximo;
    }
}