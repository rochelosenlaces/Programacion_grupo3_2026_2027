import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 500.0; // Variable local en main
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEnteroEnRango(sc, "Elige una opción (1-4): ", 1, 4);

            switch (opcion) {
                case 1:
                    mostrarSaldo(saldo);
                    break;
                case 2:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    double cantidadIngreso = leerCantidad(sc);
                    saldo = ingresar(saldo, cantidadIngreso);
                    System.out.println("Ingreso realizado correctamente.");
                    mostrarSaldo(saldo);
                    break;
                case 3:
                    System.out.print("Introduce la cantidad a retirar: ");
                    double cantidadRetirada = leerCantidad(sc);
                    if (puedeRetirar(saldo, cantidadRetirada)) {
                        saldo = retirar(saldo, cantidadRetirada);
                        System.out.println("Retirada realizada correctamente.");
                        mostrarSaldo(saldo);
                    } else {
                        System.out.printf("Operación denegada. Recuerda que el límite por operación es de %.2f € y tu saldo es de %.2f €.%n", 
                                          300.0, saldo);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro cajero. ¡Hasta pronto!");
                    break;
            }
            System.out.println(); // Línea en blanco para mejorar la legibilidad
        } while (opcion != 4);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("=== CAJERO AUTOMÁTICO ===");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
    }

    public static int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            numero = sc.nextInt();
            if (numero >= min && numero <= max) {
                return numero;
            } else {
                System.out.println("Error: El número debe estar entre " + min + " y " + max + ".");
            }
        }
    }

    public static double leerCantidad(Scanner sc) {
        double cantidad;
        while (true) {
            cantidad = sc.nextDouble();
            if (cantidad > 0) {
                return cantidad;
            } else {
                System.out.print("Error: La cantidad debe ser mayor que 0. Inténtalo de nuevo: ");
            }
        }
    }

    public static double ingresar(double saldo, double cantidad) {
        return saldo + cantidad;
    }

    public static boolean puedeRetirar(double saldo, double cantidad) {
        return cantidad <= saldo && cantidad <= 300.0;
    }

    public static double retirar(double saldo, double cantidad) {
        return saldo - cantidad;
    }

    public static void mostrarSaldo(double saldo) {
        System.out.printf("Tu saldo actual es: %.2f €%n", saldo);
    }
}