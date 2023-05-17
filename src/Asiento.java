public class Asiento {
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
}
