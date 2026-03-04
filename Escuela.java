public class Escuela {

    private Alumno alumno1;
    private Alumno alumno2;

    private int contador = 0;

    public void agregarAlumno(Alumno alumno) {
        if (contador == 0) {
            alumno1 = alumno;
            contador++;
            System.out.println("Alumno agregado correctamente!");
        } else if (contador == 1) {
            alumno2 = alumno;
            contador++;
            System.out.println("Alumno agregado correctamente!");
        } else {
            System.out.println("Error: No se pueden agregar más alumnos.");
        }
    }

    public void mostrarAlumnos() {
        if (contador == 0) {
            System.out.println("No hay registros.");
        } else if (contador == 1) {
            alumno1.mostraInfo();
        } else if (contador == 2) {
            alumno1.mostraInfo();
            alumno2.mostraInfo();
        } else {
            System.out.println("Error: No se pueden mostrar más de 2 alumnos.");
        }
    }
}