package proyectoHombre.src;

import java.util.Date;

public class ProfesorSubstituto extends Profesor {

    private Date fechaInicio;
    private Date fechaFin;

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void asignarSubstitucion(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public String obtenerDatos() {
        return "Persona con nombre: " + this.getNombre() + " y con DNI: " + this.getDni() + " (Profe con sueldo: "
                + this.obtenerSueldo() + ", del " + getFechaInicio()
                + " al " + getFechaFin() + ")";
    }
}
