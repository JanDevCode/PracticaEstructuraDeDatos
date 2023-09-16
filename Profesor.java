import java.util.Scanner;

public class Profesor {
    private String nombre;
    private String especialidad;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public static Profesor agregarProfesor(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporcione el nombre del profesor");
        String nombre= scanner.nextLine();

        System.out.println("Proporcione la especialidad del profesor");
        String especialidad=scanner.nextLine();
        return new Profesor(nombre, especialidad);

    }
}
