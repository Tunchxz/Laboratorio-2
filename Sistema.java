import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de Horarios para el laboratorio de computación avanzada CIT-411.");
        System.out.println("Por favor, ingresa la capacidad máxima del Laboratorio en este momento:");
        int capacidad = entrada.nextInt();
        entrada.nextLine();
        Laboratorio laboratorio = new Laboratorio(capacidad);
        String opciones = "---------- Horarios Laboratorio ----------\n" + "1. Asignar curso\n"
                + "2. Visualizar un curso del horario\n" + "3. Eliminar un curso del horario\n"
                + "4. Cambiar un curso de horario\n" + "5. Reiniciar el horario\n"
                + "6. Mostrar profesor encargado en un horario\n" + "7. Mostrar días a cargo de un profesor\n"
                + "8. Mostrar frecuencia y responsabilidad de un profesor\n" + "9. Salir";
        int op = 0;

        while (op >= 0 && op < 9) {
            System.out.println(opciones);
            System.out.println("Ingrese la opción deseada: ");
            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1: {
                    System.out.println("Ingrese el codigo del curso: ");
                    String codigo = entrada.nextLine();
                    if (laboratorio.existeElCurso(codigo)) {
                        System.out.println("Ingrese el nombre del curso: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese el numero de peridos por cada día de la semana: ");
                        int periodosPorDia = entrada.nextInt();
                        entrada.nextLine();
                    }

                }
            }
        }
    }
}
