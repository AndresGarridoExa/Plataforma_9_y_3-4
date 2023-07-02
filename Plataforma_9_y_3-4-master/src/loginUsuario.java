import java.io.*;
import java.util.Scanner;

public class loginUsuario {
    private String csvFile;

    public loginUsuario(String csvFile) {
        this.csvFile = csvFile;
    }

    public void registrarUsuario(String apellido, String nombre, String dni, String contrasenia) {
        // Verificar si el usuario ya está registrado
        if (csvFile.isEmpty() != true){
            if (buscarUsuario(dni) != null) {
                System.out.println("El usuario ya está registrado.");
                return;
            }

            // Verificar si la contraseña cumple con los requisitos
            if (!validarContraseña(contrasenia)) {
                System.out.println("La contraseña no cumple con los requisitos.");
                return;
            }

            // Registrar al usuario en el archivo CSV
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile, true))) {
                writer.write(apellido + "," + nombre + "," + dni + "," + contrasenia);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Usuario registrado exitosamente.");
        }
    }

    public String[] buscarUsuario(String dni) {
        try (Scanner scanner = new Scanner(new File(csvFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data[2].equals(dni)) {
                    return data; // Retorna los datos del usuario si es encontrado
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean validarContraseña(String contraseña) {
        // Verificar la longitud mínima
        if (contraseña.length() < 8) {
            return false;
        }

        // Verificar si hay al menos una letra minúscula, una letra mayúscula y un número
        boolean tieneMinúscula = false;
        boolean tieneMayúscula = false;
        boolean tieneNúmero = false;

        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) {
                tieneMinúscula = true;
            } else if (Character.isUpperCase(c)) {
                tieneMayúscula = true;
            } else if (Character.isDigit(c)) {
                tieneNúmero = true;
            }
        }

        return tieneMinúscula && tieneMayúscula && tieneNúmero;
    }
    public boolean ingresar(String dni, String contraseña) {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[2].equals(dni) && data[3].equals(contraseña)) {
                    System.out.println("Ingreso exitoso");
                    return true; // Ingreso exitoso si el DNI y la contraseña coinciden
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Usuario/contraseña incorrecta");
        return false; // Ingreso fallido si no se encuentra una coincidencia
    }
}

