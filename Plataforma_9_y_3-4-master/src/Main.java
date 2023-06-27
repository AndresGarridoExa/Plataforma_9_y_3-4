import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String usuariocsvFile = "usuarios.csv";
        loginUsuario loginUsuario = new loginUsuario(usuariocsvFile);
        String empresacsvFile = "empresas.csv";
        loginEmpresa loginEmpresa = new loginEmpresa(empresacsvFile);

        // Registrar usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        loginUsuario.registrarUsuario(apellido, nombre, dni, contraseña);

        scanner.close();

        // Solicitar al usuario que ingrese el DNI y la contraseña
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese su DNI: ");
            String dniInput = reader.readLine();

            System.out.print("Ingrese su contraseña: ");
            String contraseñaInput = reader.readLine();
        } finally {
            //
        }
    }
}

