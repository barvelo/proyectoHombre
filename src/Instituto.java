package proyectoHombre.src;

import java.util.ArrayList;

public class Instituto {

    private ArrayList<Persona> personas = new ArrayList<>();
    private String nombre;

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public void imprimirInformacion() {
        System.out.println("Instituto " + nombre + ". Lista de personas:");
        System.out.println("*.*.*.*.*.*.*.*.*.*");
        for (Persona persona : personas) {
            System.out.println(persona.obtenerDatos());
            System.out.println("*.*.*.*.*.*.*.*.*.*");
        }
    }
}
