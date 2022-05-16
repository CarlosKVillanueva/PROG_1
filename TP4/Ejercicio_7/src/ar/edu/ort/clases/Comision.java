package ar.edu.ort.clases;

import java.util.Random;

/**
 * Ejercicio_7 @author CKVillanueva el 5/16/2022 | 8:05 AM
 */
public class Comision {
    public static final int PRESENTISMO_MINIMO = 75;
    public static final int LIMITE_DESVINCULADO = 4;
    private String codigo;
    private int cantAlumnos;
    private char[][] jornadas;
    private Alumno[] alumnos;
    private int contadorTardes = 0;


    public Comision(String codigo, int cantAlumnos) {
        this.codigo = codigo;
        this.cantAlumnos = cantAlumnos;
        generarAlumnos();
        generarJornadas();
    }

    private void generarJornadas() {
        this.jornadas = new char[][]{   {'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P'},
                                        {'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P'},
                                        {'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                                        {'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
                                        {'T', 'P', 'T', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A'},
                                        {'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P'},
                                        {'P', 'T', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A'},
                                        {'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A'},
                                        {'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'T', 'P', 'P', 'P'}
                                    };
    }

    private void generarAlumnos() {
        this.alumnos = new Alumno[cantAlumnos];

        for (int i = 0; i < cantAlumnos; i++) {
            String[] proceres = new String[]{"Alberti", "Azcuenaga", "Belgrano", "Castelli", "Larrea", "Matheu", "Moreno", "Paso", "Saavedra"};
            this.alumnos[i] = new Alumno(i, proceres[i], 18);
        }
    }

    public void mostrarApellidosAptos() {
        for (int a = 0; a < jornadas.length; a++) {
            double acumPresentes = 0;
            for (int j = 0; j < jornadas[a].length; j++) {
                acumPresentes += contadorPresentes(jornadas[a][j]);
                //controlTardes(jornadas[a][j]);
            }
            double presentismo = acumPresentes / jornadas[a].length * 100;
            if (presentismo >= PRESENTISMO_MINIMO) {
                System.out.printf("%s %.2f%s\n", alumnos[a].getApellido(), presentismo, "%");
            }
        }
    }

    private double contadorPresentes(char c) {
        double retorno = 0;
        if (c == 'P') {
            retorno = 1;
        } else if (c == 'A') {
            retorno = 0.5;
        }
        return retorno;
    }

    public int obtenerLlegadasTarde() {
        for (int a = 0; a < jornadas.length; a++) {
            for (int j = 0; j < jornadas[a].length; j++) {
                contadorTardes += controlTardes(jornadas[a][j]);
            }
        }
        return contadorTardes;
    }

    private int controlTardes(char t) {
        return (t == 'T') ? 1 : 0;
    }

    public int diasConAsistenciaPerfecta() {
        int diasAP = 0;
        for (int iCol = 0; iCol < jornadas[0].length; iCol++) {
            boolean hayAusente = false;
            int iFil = 0;
            while (iFil < jornadas.length && !hayAusente) {
                if (jornadas[iFil][iCol] == 'A') {
                    hayAusente = true;
                }
                iFil++;
            }
            if (!hayAusente) {
                diasAP++;
            }
        }
        return diasAP;
    }

    public String[] porcentajePresentismo() {
        String[] porcentajes = new String[jornadas[0].length];
        for (int iCol = 0; iCol < jornadas[0].length; iCol++) {
        double presentismo = 0;
            for (int iFill = 0; iFill < jornadas.length; iFill++) {
                if (jornadas[iFill][iCol] != 'A') {
                    presentismo++;
                }
            }
            porcentajes[iCol] = String.format("%.2f%s", (presentismo / jornadas.length * 100), "%");
        }
        return porcentajes;
    }

    public void mostrarDesertores() {
        for (int a = 0; a < jornadas.length; a++) {
            if (esAlumnoDesertor(jornadas[a])) {
                System.out.println(alumnos[a].getApellido());
            }
        }
    }

    private boolean esAlumnoDesertor(char[] jornada) {
        int i = 0;
        int cont = 0;
        boolean deserto = false;
        while (i < jornada.length && !deserto) {
            if (jornada[i] == 'A') {
                cont++;
                if (cont == LIMITE_DESVINCULADO) {
                    deserto = true;
                }
            } else {
                cont = 0;
            }
            i++;
        }
        return deserto;
    }

}

