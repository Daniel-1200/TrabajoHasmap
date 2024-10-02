// daniel felipe barrera segura
// daniel-barrera.se@uniminuto.edu.co
// Id: 903363


import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer>
                calificaciones = new HashMap<>();
        Scanner scanner = new
                Scanner (System.in);
        int opcion;

        do {
            System.out.println("\n---- Sistema de Calificaciones ----");
            System.out.println("1. Agregar calificación de un estudiante");
            System.out.println("2. Mostrar todas las calificaciones");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion) {
                case 1:
                    // Agregar calificación de un estudiante
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la calificación del estudiante: ");
                    int calificacion = scanner.nextInt();

                    // Agregar al HashMap
                    calificaciones.put(nombre, calificacion);
                    System.out.println("Calificación agregada para " + nombre);
                    break;



                case 2:
                    // Mostrar todas las calificaciones
                    if (calificaciones.isEmpty()) {
                        System.out.println("No hay calificaciones registradas.");
                    } else {
                        System.out.println("Calificaciones de los estudiantes:");
                        for (String estudiante : calificaciones.keySet()) {
                            System.out.println(estudiante + ": " + calificaciones.get(estudiante));
                        }
                    }
                    break;



                case 3:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();





    }}