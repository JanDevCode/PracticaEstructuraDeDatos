import java.util.Scanner;

public class Asignatura {
    private String nombre;
    private String profesor;

    public Asignatura(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getProfesor() {
        return profesor;
    }



    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }



    public static Asignatura registroAsignatura(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la asignatura: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el nombre del profesor: ");
        String profesor = scanner.nextLine();
        

        return new Asignatura(profesor, nombre);
    }
}
