package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:12 PM
 */
public class Compania {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Area> areas;

    public Compania(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<Empleado>();
        this.areas = new ArrayList<>();
    }

    public int obtenerCantObservaciones(){
        int cant = 0;
        for (Area area : areas) {
             cant += area.obtenerCantObservacionesExternas();
        }
        return cant;
    }

    public void agregarArea(Area area) {
        areas.add(area);
    }

}
