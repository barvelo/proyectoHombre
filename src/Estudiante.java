package proyectoHombre.src;

import java.util.ArrayList;

public class Estudiante extends Persona {

    private ArrayList<Double> notas = new ArrayList<>();

    private double media;
    private double maxima;
    private double minima;

    public void getMedia() {
        System.out.println("nota media " + media);
    }

    public void getMaxima() {
        System.out.println("nota máxima " + maxima);
    }

    public void getMinima() {
        System.out.println("nota mínima " + minima);
    }

    public void ponerNota(Double nota) {
        try {
            if (nota > 10 || nota < 0) {
                throw new Exception("Error: la nota debe ser entre 0 y 10");
            } else {
                this.notas.add(nota);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        minima = nota;

        media = 0;

        for (int x = 0; x < notas.size(); x++) {
            if (maxima < notas.get(x)) {
                maxima = notas.get(x);
            }
            if (minima > notas.get(x)) {
                minima = notas.get(x);
            }
            media += notas.get(x);
        }
        media = media / notas.size();
    }

    @Override
    public String obtenerDatos() {
        return "Persona con nombre: " + this.getNombre() + " y con DNI: " + this.getDni() + " (ESTUDIANTE con nota/s: "
                + notas.toString() + ")";
    }

}
