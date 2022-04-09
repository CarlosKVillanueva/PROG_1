package ar.edu.ort.clases;

public enum Categoria {
    AUTO(10), MOTO(8), CAMION(15);

    private double tarifaBase;

    Categoria(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }
}
