package ar.edu.ort.clases;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:11 PM
 */
public class Academia {
    private CursosOrdenadosPorCodAsc cursosXCodAsc;
    private CursosOrdenadosPorNivel cursosXNivelAsc;

    public Academia() {
        cursosXCodAsc = new CursosOrdenadosPorCodAsc();
    }

    public Estadistica obtenerEstadistica(String codigo) {
        Estadistica estadistica = null;
        Curso curso;
        if (codigo == null || codigo.isEmpty()) {
            throw new RuntimeException("El codigo no puede ser nulo o Vacio");
        }
        curso = cursosXCodAsc.search(codigo);
        if (curso != null) {
            estadistica = new Estadistica(curso.getTitulo(), curso.getPromEdad());
        }

        return estadistica;
    }

    public CursosOrdenadosPorNivel listadoDeCursosPorNivel() {
        cursosXNivelAsc = new CursosOrdenadosPorNivel();

        for (Curso curso : cursosXCodAsc) {
            cursosXNivelAsc.add(curso);
        }

        return cursosXNivelAsc;
    }

    public void agregarCursos(Curso curso) {
        cursosXCodAsc.add(curso);
    }

    public Alumno[] mostrarTop5PorCurso(String pr1) {
        return cursosXCodAsc.search(pr1).top5AlumnosMasLongevos();
    }

    @Override
    public String toString() {
        return "Academia{" +
                "cursosXCodAsc=" + cursosXCodAsc +
                ", cursosXNivelAsc=" + cursosXNivelAsc +
                '}';
    }
}
