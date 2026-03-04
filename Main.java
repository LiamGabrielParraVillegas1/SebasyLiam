import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escuela escuela = new Escuela();

        int opcion;

        do {
            System.out.println("---Menú---");
            System.out.println("1.- Ingresa el nombre del alumno");
            System.out.println("2.- Mostrar alumnos");
            System.out.println("3.- Salir");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre del alumno: ");
                    String nombre = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Calificación 1: ");
                    double c1 = sc.nextDouble();

                    System.out.print("Calificación 2: ");
                    double c2 = sc.nextDouble();

                    System.out.print("Calificación 3: ");
                    double c3 = sc.nextDouble();
                    sc.nextLine();  // Limpiar el buffer

                    Alumno alumno = new Alumno(nombre, matricula);
                    alumno.Calificaciones(c1, c2, c3);
                    escuela.agregarAlumno(alumno);
                    break;

                case 2:
                    escuela.mostrarAlumnos();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);

        sc.close();
    }
}