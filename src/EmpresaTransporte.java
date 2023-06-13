import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaTransporte {
    private String nombre;
    private ArrayList<Servicio> servicios;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public ArrayList<Servicio> buscarServicios(String origen, String destino, LocalDate fechaViaje) {
        // Buscar servicios disponibles que cumplan con los criterios de origen, destino y fechaViaje
        ArrayList<Servicio> salida = new ArrayList<>();
        for(int i=0 ; i< servicios.size(); i++){
            Servicio s = servicios.get(i);
            if(s.getOrigen().equals(origen) && s.getDestino().equals(destino) && s.getFechaViaje().equals(fechaViaje)){
                salida.add(s);
            }
        }
        return salida;
    }

}
