public class Pasajero {
    private String apellido;
    private String nombre;
    private int dni;
    private String claveAcceso;
    private String tarjetaCredito;
    private List<Pasaje> pasajes;

    public Pasajero(String apellido, String nombre, int dni, String claveAcceso) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.claveAcceso = claveAcceso;
        pasajes = new ArrayList<>();
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void agregarPasaje(Pasaje pasaje) {
        pasajes.add(pasaje);
    }
}

