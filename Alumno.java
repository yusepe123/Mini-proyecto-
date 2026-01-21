public class Alumno extends Persona {
    private String nombre;

    public Alumno(int idEst, String nombre) {
        super(idEst); 
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin Nombre";
        }
    }
}