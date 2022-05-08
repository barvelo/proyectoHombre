package proyectoHombre.src;

public class Persona {

    private String dni;
    private String nombre;
    private boolean dniAsignado = false;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarDni(String dni) {
        try {
            if (dniAsignado == false) {
                this.dni = dni;
                dniAsignado = true;
            } else {
                throw new Exception("Error: No se puede cambiar el dni de nuevo, haber estudiao");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String obtenerDatos() {
        try {
            if (dni == null || nombre == null) {
                throw new Exception("Error: faltan datos de la persona");
            } else
                return "Dni: " + dni + "\nNombre: " + nombre;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
