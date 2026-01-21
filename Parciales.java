// Definimos la interfaz aquí mismo para no crear otro archivo
interface ICalculable {
    double calcularPromedio();
}

public class Parciales implements ICalculable {
    private int idEst;
    private double nota1;
    private double nota2;

    public Parciales(int idEst, double nota1, double nota2) {
        this.idEst = idEst;
        setNotas(nota1, nota2);
    }

    public void setNotas(double n1, double n2) {

        if (n1 >= 0 && n1 <= 20 && n2 >= 0 && n2 <= 20) {
            this.nota1 = n1;
            this.nota2 = n2;
        } else {
            System.out.println("Notas fuera de rango (0-20).");
        }
    }

    
    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }
    
    public int getIdEst() { return idEst; }
}