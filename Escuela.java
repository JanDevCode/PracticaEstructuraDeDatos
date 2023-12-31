import java.util.Scanner;

public class Escuela {
    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[100];
        int numEstudiantes = 0;

        Asignatura[] asignaturas = new Asignatura[20];
        int numAsignaturas = 0;

        Profesor[] profesores = new Profesor[20];
        int numProfesores = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------------------------------------");
            System.out.println("Seleccione la opcion que desea aplicar");
            System.out.println("1.- Registrar estudiante");
            System.out.println("2.- Registrar asignaturas");
            System.out.println("3.- Agregar profesor");
            System.out.println("4.- Agregar asignatura a un estidante");
            System.out.println("5.-Mostrar lista de estudiantes");
            System.out.println("6.-Mostrar lista de asignaturas");
            System.out.println("7.-Buscar estudiante por nombre");
            System.out.println("8.- Calcular estadisticas ");
            System.out.println("9.-Ordernar estudiantes por nombre");
            System.out.println("10.-Ordenar estudiante por nombre, edad, nota promedio");
            System.out.println("---------------------------------------------------------");
            opcion = scanner.nextInt();
            System.out.println("Ingrese 0 para salir del programa");

            switch (opcion) {
                case 1:
                    if (numEstudiantes < estudiantes.length) {
                        Estudiante nuevoEstudiante = Estudiante.crearAlumno();
                        estudiantes[numEstudiantes] = nuevoEstudiante;
                        numEstudiantes++;
                        System.out.println("Estudiate registrado correctamente");
                    } else {
                        System.out.println("No hay espacio para mas estudiantes");
                    }
                    break;
                case 2:
                    System.out.println("Usted va a registrar asignaturas disponibles");
                    if (numAsignaturas < asignaturas.length) {
                        Asignatura nuevAsignatura = Asignatura.registroAsignatura();
                        asignaturas[numAsignaturas] = nuevAsignatura;
                        numAsignaturas++;
                    } else {
                        System.out.println("No hay espacio para mas asignaturas");
                    }
                    break;
                case 3:
                    System.out.println("usted va a registrar un profesor");
                    if (numProfesores < profesores.length) {
                        Profesor nuevoProfesor = Profesor.agregarProfesor();
                        profesores[numProfesores] = nuevoProfesor;
                        numProfesores++;
                    } else {
                        System.out.println("No hay mas espacio para registros");
                    }
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("------MOSTRANDO--LISTA-DE-ESTUDIANTES---------");
                    for (int i = 0; i < numEstudiantes; i++) {
                        Estudiante estudiante = estudiantes[i];
                        System.out.println("Estudiante " + (i + 1) + ":");
                        System.out.println("Nombre: " + estudiante.getNombre());
                        System.out.println("Edad: " + estudiante.getEdad());
                        System.out.println("Nota promedio: " + estudiante.getNotapromedio());
                        System.out.println("Número de cursos aprobados: " + estudiante.getNum_cursosAprobados());
                        System.out.println("----------------------------------------------------------");
                    }
                    break;
                case 6:
                    System.out.println("------------------------------------------------------------");
                    for (int i = 0; i < numAsignaturas; i++) {
                        Asignatura asignatura = asignaturas[i];
                        System.out.println("Asignatura " + (i + 1) + ":");
                        System.out.println("Nombre: " + asignatura.getNombre());
                        System.out.println("Asignatura: " + asignatura.getProfesor());
                        System.out.println("------------------------------------------------------------");
                    }
                    break;
                case 7:
                    System.out.println("Ingrese el nombre del estudiante que busca:");
                    String nombreBuscado = scanner.next();
                    boolean encontrado = false;
                    for (int i = 0; i < numEstudiantes; i++) {
                        Estudiante estudiante = estudiantes[i];
                        if (estudiante.getNombre().equals(nombreBuscado)) {
                            System.out.println("Estudiante encontrado:");
                            System.out.println("Nombre: " + estudiante.getNombre());
                            System.out.println("Edad: " + estudiante.getEdad());
                            System.out.println("Nota promedio: " + estudiante.getNotapromedio());
                            System.out.println("Número de cursos aprobados: " + estudiante.getNum_cursosAprobados());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró un estudiante con el nombre " + nombreBuscado);
                    }
                    break;
                case 8:
                    System.out.println("calcular");
                    break;
                case 9:
                    // Ordena el arreglo usando Bubble Sort. Sacado de la pagina de algoritmos
                    // comunes. ESTUDIAR.
                    //Este arreglo solo es para ordenar los datos del los usuarios
                    for (int i = 0; i < estudiantes.length - 1; i++) {
                        for (int j = 0; j < estudiantes.length - i - 1; j++) {
                            // Verifica si los objetos Estudiante son null antes de compararlos
                            if (estudiantes[j] != null && estudiantes[j + 1] != null) {
                                if (estudiantes[j].getNombre().compareTo(estudiantes[j + 1].getNombre()) > 0) {
                                    // Intercambia estudiantes[j] y estudiantes[j + 1]
                                    Estudiante temp = estudiantes[j];
                                    estudiantes[j] = estudiantes[j + 1];
                                    estudiantes[j + 1] = temp;
                                }
                            }
                        }
                    }

                    //Con esta parte se muestran los datos de los usuarios
                    //Recorro con el for para posteriormente mostrarlos con sout y .getDatoAmostrar
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante != null) {
                            System.out.println("Nombre: " + estudiante.getNombre());
                            System.out.println("Edad: " + estudiante.getEdad());
                            System.out.println("Calificación promedio: " + estudiante.getNotapromedio());
                            System.out.println("Número de cursos aprobados: " + estudiante.getNum_cursosAprobados());
                            System.out.println("-------------------------");
                        }
                    }
                    break;
                case 10:
                    System.out.println("Ingrese la edad mínima:");
                    int edadMinima = scanner.nextInt();
                    System.out.println("Ingrese la nota promedio mínima:");
                    double notaPromedioMinima = scanner.nextDouble();

                    for (int i = 0; i < numEstudiantes; i++) {
                        Estudiante estudiante = estudiantes[i];
                        if (estudiante.getEdad() > edadMinima && estudiante.getNotapromedio() > notaPromedioMinima) {
                            System.out.println("Estudiante que cumple con los criterios:");
                            System.out.println("Nombre: " + estudiante.getNombre());
                            System.out.println("Edad: " + estudiante.getEdad());
                            System.out.println("Nota promedio: " + estudiante.getNotapromedio());
                            System.out.println("Número de cursos aprobados: " + estudiante.getNum_cursosAprobados());
                        }
                    }
                    break;
            }
        } while (opcion != 0);
        System.out.println("Usted salio del programa");
    }
}
