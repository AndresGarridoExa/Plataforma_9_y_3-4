import java.time.LocalDate;
import java.util.ArrayList;

public class Pasaje {
    private String origen;
    private String destino;
    private LocalDate fechaViaje;
    //private ArrayList<Asiento> asientos;
    //private int cantAsientos;
    private double costo;

    public Pasaje(String origen, String destino, LocalDate fechaViaje, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        //this.cantAsientos = cantAsientos;
        this.costo = costo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    /*public ArrayList<Asiento> getAsientos() {
        return asientos;
    }*/

    /*public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }*/
    /*public  int getCantAsientos(){
        return this.cantAsientos;
    }
    public void setCantAsientos(int cant){
        this.cantAsientos = cant;
    }*/

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
