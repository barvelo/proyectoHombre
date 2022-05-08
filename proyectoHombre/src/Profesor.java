package proyectoHombre.src;

public class Profesor extends Persona {

    private double sueldo;

    public double obtenerSueldo() {
        return sueldo;
    }

    public void cambiarSueldo(float sueldo) {
        try {
            if (sueldo > 3000) {
                throw new Exception("Error: No se puede poner más de 3000 euros");
            } else if (sueldo < 0) {
                throw new Exception("Error: No se puede poner menos de 0 euros tampoco te pases");
            } else {
                this.sueldo = sueldo;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String obtenerDatos() {
        return "Persona con nombre: " + this.getNombre() + " y con DNI: " + this.getDni() + " (PROFE con sueldo: "
                + sueldo + ")";

    }
}
