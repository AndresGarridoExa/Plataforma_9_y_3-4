public class Servicio {
    private String origen;
    private String destino;
    private LocalDate fechaViaje;
    private List<Asiento> asientos;

    public Servicio(String origen, String destino, LocalDate fechaViaje) {
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        asientos = new ArrayList<>();
    }

    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }
}
