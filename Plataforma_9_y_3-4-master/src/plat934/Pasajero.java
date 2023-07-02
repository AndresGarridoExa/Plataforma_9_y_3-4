package plat934;

import java.io.Serializable;
import java.util.ArrayList;

public class Pasajero implements Serializable {
    private String apellido;
    private String nombre;
    private int dni;
    private String claveAcceso;
    private String tarjeta;
    private ArrayList<Pasaje> pasajes;

    public Pasajero(String apellido, String nombre, int dni, String claveAcceso) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.claveAcceso = claveAcceso;
        pasajes = new ArrayList<>();
        this.tarjeta="";
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    public String getTarjeta(){
        return this.tarjeta;
    }

    public void agregarPasaje(Pasaje pasaje) {
        pasajes.add(pasaje);
    }
    public void viaja(Pasaje pasaje){
        pasajes.remove(pasaje);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public ArrayList<Pasaje> getPasajes() {
        return pasajes;
    }

    public void setPasajes(ArrayList<Pasaje> pasajes) {
        this.pasajes = pasajes;
    }
}

