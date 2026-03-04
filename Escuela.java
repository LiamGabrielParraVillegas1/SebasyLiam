public class Escuela {

    private String alumno1;
    private String alumno2;

    private int contador = 0;

    public void agregarAlumno(String alumno){
        if (contador == 0) {
            alumno1 = alumno;
            contador++;
            System.out.print("Alumno agregado correctamente !!!1");

        } else if (contador == 1) {
            alumno2 = alumno ;
            contador++;


        } else {
            System.out.print("Error");

        }
    }


    public void mostrarAlumnos(){

        if (contador == 0){
            System.out.println("No hay registros");
        } else if (contador == 1){

        } else if (contador == 2){


        }else {
            System.out.println("Error");
        }
    }
    
}
