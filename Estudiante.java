import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notapromedio;
    private int num_cursosAprobados;
    
    public Estudiante(String nombre, int edad, double notapromedio, int num_cursosAprobados) {
        this.nombre = nombre;
        this.edad = edad;
        this.notapromedio = notapromedio;
        this.num_cursosAprobados = num_cursosAprobados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double getNotapromedio() {
        return notapromedio;
    }

    public void setNotapromedio(double notapromedio) {
        this.notapromedio = notapromedio;
    }

    public int getNum_cursosAprobados() {
        return num_cursosAprobados;
    }

    public void setNum_cursosAprobados(int num_cursosAprobados) {
        this.num_cursosAprobados = num_cursosAprobados;
    }

    //Metodo para registrar alumno
    public static Estudiante crearAlumno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la calificacion promedio del alumno");
        double notapromedio=scanner.nextDouble();

        System.out.println("Ingrese el numero de cursos aprobados por el alumno");
        int num_cursosAprobados=scanner.nextInt();

        return new Estudiante(nombre, edad, notapromedio,num_cursosAprobados);
    }
}
