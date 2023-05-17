public class Pasaje {
    private String origen;
    private String destino;
    private LocalDate fechaViaje;
    private List<Asiento> asientos;
    private double costo;

    public Pasaje(String origen, String destino, LocalDate fechaViaje, List<Asiento> asientos, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientos = asientos;
        this.costo = costo;
    }
}
