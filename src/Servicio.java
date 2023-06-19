import java.time.LocalDate;
import java.util.ArrayList;

public class Servicio {
    private String origen;
    private String destino;
    private LocalDate fechaViaje;
    private ArrayList<Asiento> asientos;
    private double costo;
   // private Transporte micro;

    public Servicio(String origen, String destino, LocalDate fechaViaje, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.costo = costo;
        asientos = new ArrayList<>();
    }
    public Servicio(String origen, String destino, LocalDate fechaViaje,ArrayList<Asiento> asientos ,double costo) {
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.costo = costo;
        this.asientos =(ArrayList<Asiento>) asientos.clone();
    }

    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public ArrayList<Asiento> getAsientos() {
        return (ArrayList<Asiento>)asientos.clone();
    }

    public double getCosto() {
        return costo;
    }
    public void setCosto(double c){
        costo = c;
    }

    public int getAsientosDisponibles(){
        int result = 0;
        for (int i = 0 ; i < asientos.size(); i++){
            if(asientos.get(i).isDisponible()){
                result++;
            }
        }
        return result;
    }
    public int getCantAsientos(){
        return asientos.size();
    }

    public void reservar(Pasajero p1, int reserva){
        asientos.get(reserva).reservar(p1);
    }
}
