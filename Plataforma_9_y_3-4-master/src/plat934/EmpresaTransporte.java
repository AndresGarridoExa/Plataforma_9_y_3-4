package plat934;

import java.io.Serializable;
import java.util.ArrayList;

public class EmpresaTransporte implements Serializable {
    private String nombre;
    private ArrayList<Servicio> servicios;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public ArrayList<Servicio> buscarServicios(String origen, String destino ) {
        // Buscar servicios disponibles que cumplan con los criterios de origen, destino
        //Tuvimos problemas con las fechas ingresadas por teclado y las guardadas.
        ArrayList<Servicio> salida = new ArrayList<>();
        for(int i=0 ; i< servicios.size(); i++){
            Servicio s = servicios.get(i);
            if(s.getOrigen().equals(origen) && s.getDestino().equals(destino) ){
                salida.add(s);
            }
        }
        return salida;
    }


}
