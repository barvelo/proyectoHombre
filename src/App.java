package proyectoHombre.src;

import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Instituto ins = new Instituto();
        ins.cambiarNombre("La Guineueta");

        Profesor profe1 = new Profesor();
        profe1.cambiarNombre("Marc");
        profe1.asignarDni("1234");
        profe1.cambiarSueldo(1500);
        ins.addPersona(profe1);

        ProfesorSubstituto profe2 = new ProfesorSubstituto();
        profe2.cambiarNombre("Laura");
        profe2.asignarDni("8888");
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        profe2.asignarSubstitucion(dataInici, dataFi);
        profe2.cambiarSueldo(300);

        ins.addPersona(profe2);

        Estudiante estudiant1 = new Estudiante();
        estudiant1.cambiarNombre("Joan");
        estudiant1.asignarDni("6666");
        estudiant1.ponerNota(7.5);
        estudiant1.ponerNota(7.8);
        estudiant1.ponerNota(1.0);
        estudiant1.ponerNota(6.0);
        estudiant1.ponerNota(5.0);

        ins.addPersona(estudiant1);

        // estudiant1.getMaxima();
        // estudiant1.getMinima();
        // estudiant1.getMedia();

        ins.imprimirInformacion();

        System.out.println("-------EXCEPCIONES------\n");

        try {
            profe1.asignarDni("9696");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            estudiant1.ponerNota(15.7);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            profe1.cambiarSueldo(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Estudiante estudiant2 = new Estudiante();
            estudiant2.asignarDni("5050");
            estudiant2.ponerNota(8.3);
            estudiant2.obtenerDatos();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
