public class Materia {
    private int idEst;
    private String nombreMateria;

    public Materia(int idEst, String nombreMateria) {
        this.idEst = idEst;
        setNombreMateria(nombreMateria);
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombre) {

        if (nombre.length() >= 3) {
            this.nombreMateria = nombre;
        } else {
            this.nombreMateria = "Materia Genérica";
        }
    }
    
    public int getIdEst() { return idEst; }
}