import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class loginEmpresa {
    private String csvFile;

    public loginEmpresa(String csvFile) {
        this.csvFile = csvFile;
    }

    public boolean ingresar(String dni, String contraseña) {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(dni) && data[1].equals(contraseña)) {
                    return true; // Ingreso exitoso si el DNI y la contraseña coinciden
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // Ingreso fallido si no se encuentra una coincidencia
    }
}
