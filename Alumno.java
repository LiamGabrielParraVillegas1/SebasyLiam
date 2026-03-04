public class Alumno {
    private String nombre;
    private String matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void Calificaciones(double calificacion1, double calificacion2, double calificacion3) {
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public double CalcularPromedio() {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    void mostraInfo() {
        System.out.println("Nombre del Alumno: " + nombre);
        System.out.println("Matrícula del Alumno: " + matricula);
        System.out.println("Promedio del Alumno: " + CalcularPromedio());
    }

    public String ObtenerMatricula() {
        return matricula;
    }
}