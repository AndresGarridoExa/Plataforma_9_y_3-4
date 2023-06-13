import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Plataforma934 {
    private ArrayList<EmpresaTransporte> empresas;
    private ArrayList<Pasajero> pasajeros;

    public Plataforma934() {
        empresas = new ArrayList<>();
        pasajeros = new ArrayList<>();
    }

    public void registrarPasajero(String apellido, String nombre, int dni, String claveAcceso, String tarjetaCredito) {
        if (validarClaveAcceso(claveAcceso)) {
            Pasajero pasajero = new Pasajero(apellido, nombre, dni, claveAcceso);
            if (tarjetaCredito != null) {
                pasajero.setTarjetaCredito(tarjetaCredito);
            }
            pasajeros.add(pasajero);
        } else {
            System.out.println("La clave de acceso no cumple los requisitos de seguridad.");
        }
    }

    private boolean validarClaveAcceso(String claveAcceso) {
        // Validar que la clave cumple con los requisitos (8 caracteres mínimo, una minúscula, una mayúscula y un número)
        // Retorna true si cumple los requisitos, false en caso contrario.
        return claveAcceso.length()>=8;
    }

    public boolean comprarPasaje(Pasajero pasajero, Servicio serv) {
        if(validarPago(pasajero)) {
            if (serv.getAsientosDisponibles() > 0) {
                serv.reservar(pasajero);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean validarPago(Pasajero p1) {
        //valida que el pasajero tenga plata,se haga el pago, etc.
        return true;
    }

    private void mostrarViajes(ArrayList<Servicio> servicios, Pasajero p1){
        mostrarViajes(servicios);
        Scanner leer = new Scanner(System.in);
        System.out.println("Si quiere comprar uno de los servicios ingrese la letras s o S:");
        String opcion = leer.nextLine();
        if(opcion.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el número del Servicio que de desea comprar: ");
            opcion = leer.nextLine();
            if(isNumeric(opcion)) {
                int op = Integer.parseInt(opcion);
                if(op>0 && op<= servicios.size()) {
                    comprarPasaje(p1,servicios.get(op));
                }
            }
        }
    }

    private void mostrarViajes(ArrayList<Servicio> servicios){
        for (int i = 0; i< servicios.size(); i++) {
            Servicio aux = servicios.get(i);
            System.out.println( "Servicio: " + (i+1) );
            System.out.println("Origen: "+ aux.getOrigen() + " | "+
                    "Destino " + aux.getDestino() + " | "+
                    "Cantidad de Asientos: " + aux.getCantAsientos()+ " | "+
                    "Cantidad de Asientos disponibles: "+ aux.getAsientosDisponibles() + " | " +
                    "Costo: " + aux.getCosto() );
        }
    }

    private boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

    private ArrayList<Servicio> buscarServicios(String origen, String destino, LocalDate fechaViaje) {
        ArrayList<Servicio> serviciosDisponibles = new ArrayList<>();

        for (EmpresaTransporte empresa : empresas) {
            ArrayList<Servicio> servicios = empresa.buscarServicios(origen, destino, fechaViaje);
            serviciosDisponibles.addAll(servicios);
        }

        return serviciosDisponibles;
    }

    public void suscribirViajeImprovisado(Pasajero pasajero, String origen, String destino) {
        // Suscribir al pasajero para recibir alertas de pasajes con descuento para el viaje improvisado
    }

    public void generarEstadisticas(Pasajero pasajero) {
        // Generar estadísticas a partir de los datos de los pasajes del pasajero
    }

    public void devolverPasaje(Pasajero pasajero, Pasaje pasaje) {
        // Calcular el porcentaje de devolución según la antelación a la fecha del viaje
        // Realizar la devolución a la tarjeta de crédito del pasajero
        // Informar a la empresa de transporte sobre la devolución del pasaje
    }
}

