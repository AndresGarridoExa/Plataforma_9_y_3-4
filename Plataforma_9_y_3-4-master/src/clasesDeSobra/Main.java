package clasesDeSobra;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import plat934.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String usuariocsvFile = "usuarios.csv";
        loginUsuario loginUsuario = new loginUsuario(usuariocsvFile);
        String empresacsvFile = "empresas.csv";
        loginEmpresa loginEmpresa = new loginEmpresa(empresacsvFile);

        boolean salir = false;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!salir){
            System.out.println("Ingresa una de las siguientes opciones");
            System.out.println("1.Ingresar al sistema");
            System.out.println("2.Registrar nuevo Usuario");
            System.out.println("3.Salir");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1:

                        System.out.print("Ingrese su DNI: ");
                        String dniInput = reader.readLine();

                        System.out.print("Ingrese su contraseña: ");
                        String contraseñaInput = reader.readLine();

                        loginUsuario.ingresar(dniInput,contraseñaInput);
                        break;
                    case 2:
                        System.out.println("Ingrese su apellido: ");
                        String apellido = reader.readLine();

                        System.out.println("Ingrese su nombre: ");
                        String nombre = reader.readLine();

                        System.out.println("Ingrese su DNI: ");
                        String dni = reader.readLine();

                        System.out.println("Ingrese su contraseña: ");
                        String contraseña = reader.readLine();

                        loginUsuario.registrarUsuario(apellido, nombre, dni, contraseña);
                        break;
                    case 3:
                        salir=true;
                        System.out.println("Saliendo del sistema.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                        break;
                }
            } else {
                System.out.println("No se ingresó un número entero válido.");
                scanner.nextLine();
            }
        }

        // Registrar usuario

        /*
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su DNI: ");
        String dni = scanner.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        plat934.loginUsuario.registrarUsuario(apellido, nombre, dni, contraseña);

        //scanner.close();

        // Solicitar al usuario que ingrese el DNI y la contraseña
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese su DNI: ");
            String dniInput = reader.readLine();

            System.out.print("Ingrese su contraseña: ");
            String contraseñaInput = reader.readLine();

            plat934.loginUsuario.ingresar(dniInput,contraseñaInput);
        } finally {
            //
        }
        */
    }
}

