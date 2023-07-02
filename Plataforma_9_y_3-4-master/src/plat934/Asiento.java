package plat934;

import java.io.Serializable;

public class Asiento implements Serializable {
    private int numero;
    private boolean disponible;
    private Pasajero pasajero;

    public Asiento(int numero) {
        this.numero = numero;
        this.disponible = true;
        this.pasajero = null;
    }

    public void reservar(Pasajero pasajero) {
        this.disponible = false;
        this.pasajero = pasajero;
    }

    public void liberar() {
        this.disponible = true;
        this.pasajero = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
