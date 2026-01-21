public class SistemaUniversitario {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA Universitario CARMEN ===");

       
        Alumno est = new Alumno(12345, "Keylibeth Jimenez");

   
        Materia mat = new Materia(12345, "Procesamiento de Datos");

     
        Parciales eva = new Parciales(12345, 15.0, 18.0);

   
        System.out.println("ID: " + est.getIdEst());
        System.out.println("Alumno: " + est.getNombre());
        System.out.println("Materia: " + mat.getNombreMateria());
        System.out.println("Promedio Final: " + eva.calcularPromedio());
    }
}