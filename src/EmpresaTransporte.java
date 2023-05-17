public class EmpresaTransporte {
    private String nombre;
    private List<Servicio> servicios;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public List<Servicio> buscarServicios(String origen, String destino, LocalDate fechaViaje) {
        // Buscar servicios disponibles que cumplan con los criterios de origen, destino y fechaViaje
        return null;
    }
}
