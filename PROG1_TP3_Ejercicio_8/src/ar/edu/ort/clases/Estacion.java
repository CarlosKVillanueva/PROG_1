package ar.edu.ort.clases;

import java.util.ArrayList;

public class Estacion {
    private long id;
    private String descripcion;
    private ArrayList<Cabina> cabinas;

    public Estacion(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.cabinas = new ArrayList<>();
    }

    public static int getHoraActual(){
        return 14;
    }

    public void agregarCabinas(Cabina c){
        cabinas.add(c);
    }
    public ArrayList<Cabina> cabinasConEfectivo(){
        ArrayList<Cabina> cabinasE = new ArrayList<>();

        for (Cabina cabina : cabinas) {
            if (cabina.esEfectivo()) {
                cabinasE.add(cabina);
            }
        }
        return cabinasE;
    }

    public double promedioDemora() {
        double acum = 0;
        int cont = 0;
        for (Cabina cabina : cabinas) {
            if (!cabina.esEfectivo()) {
                acum += cabina.demora();
                cont++;
            }
        }
        return (cont != 0) ? (acum/cont) : 0;
    }
}
