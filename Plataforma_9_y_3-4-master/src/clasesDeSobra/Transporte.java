package clasesDeSobra;
import java.util.ArrayList;

import plat934.*;


public class Transporte {
    private ArrayList<Asiento> asientos;
    private Servicio servicio;
    private int capacidad;

    public Transporte(ArrayList<Asiento> asientos, Servicio servicio, int capacidad) {
        this.asientos = asientos;
        this.servicio = servicio;
        this.capacidad = capacidad;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void addAsiento(Asiento nuevo){
        if (asientos.size() < this.capacidad){
            asientos.add(nuevo);
        }else{
            System.out.println("No hay mas capacidad");
        }
    }

    public boolean existeAsiento(Asiento a){
        for (int i=0;i<asientos.size();i++){
            if (a.getNumero() == asientos.get(i).getNumero() && asientos.get(i).isDisponible() == true){
                return true;
            }
        }
        return false;
    }

}
