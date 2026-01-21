public class Persona {
    protected int idEst; 

    public Persona(int idEst) {
        setIdEst(idEst);
    }

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {

        if (idEst > 10000 && idEst < 99999) {
            this.idEst = idEst;
        } else {
            System.out.println("Error: ID inválido, se asignará 0.");
            this.idEst = 0;
        }
    }
}