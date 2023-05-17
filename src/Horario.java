import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Horario {
    public class Horario {
        private LocalTime horaInic,horaFin;
        private int duracion;
        private ArrayList<Pasaje> pasaje = new ArrayList<>();

        Horario(LocalTime horaInic, LocalTime horaFin, int duracion){
            this.horaInic = horaInic;
            this.horaFin = horaFin;
            this.duracion = duracion;
        }

        public LocalTime getHoraInic() {
            return horaInic;
        }

        public LocalTime getHoraFin() {
            return horaFin;
        }

        public void borrarPasaje(int index){
            pasaje.remove(index);
        }
        public int getDuracion() {
            return duracion;
        }
        public ArrayList<LocalTime> PasajeDisponibles(LocalDate dia){
            ArrayList<LocalTime> pasajeDisponibles = new ArrayList<>();
            for(LocalTime i = horaInic;i.isBefore(horaFin);i=i.plusMinutes(duracion)) {//recorre todos los horarios de inicio posibles
                boolean libre = true;//    si hay pasaje con fecha() -> si  que hora? esta ocupada?
                for (Pasaje pasaje : pasaje) {//recorre la lista de todos los pasajes
                    if (pasaje.getFecha().isEqual(dia) && i.equals(pasaje.getHoraInicio())) {//pregunta si existe otro pasaje con misma fecha y horario
                        libre = false;
                    }
                }
                if (libre) {/*agrega la hora de inicio del posible pasaje */
                    pasajeDisponibles.add(i);
                }
            }
            return pasajeDisponibles;
        }
        public ArrayList<Pasaje> listarPasaje(){return new ArrayList<>(pasaje); }//devuelve lista de pasajes

        public ArrayList<Pasaje> listarpasaje(Filter f){
            ArrayList<Pasaje> salida=new ArrayList<>();
            for(Pasaje p:pasaje){
                if (f.evaluar(p) {
                    salida.add(p);
                }
            }
            return salida;
        }
        public boolean existePasaje(Pasaje p){
            return pasaje.contains(p);

        }


    }
