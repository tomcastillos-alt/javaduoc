public class BusesColegio {
    String nombreConductor;
    String patenteVehiculo;
    int capacidadBus;
    boolean estadoBus;
    String inicioViaje;
    String destinoViaje;
    boolean estadoViaje;
    String fechaHoraPartida;

    public void setInicioViaje(String inicioViaje) {
        this.inicioViaje = inicioViaje;
    }

    public void setDestinoViaje(String destinoViaje) {
        this.destinoViaje = destinoViaje;
    }

    public void setFechaHoraPartida(String fechaHoraPartida) {
        this.fechaHoraPartida = fechaHoraPartida;
    }

    public boolean isEstadoBus() {
        return estadoBus;
    }

    public boolean isEstadoViaje() {
        return estadoViaje;
    }

    public int getCapacidadBus() {
        return capacidadBus;
    }

    public BusesColegio(String nombreConductor, String patenteVehiculo, int capacidadBus, boolean estadoBus, String inicioViaje, String destinoViaje, boolean estadoViaje, String fechaHoraPartida) {
        this.nombreConductor = nombreConductor;
        this.patenteVehiculo = patenteVehiculo;
        this.capacidadBus = capacidadBus;
        this.estadoBus = estadoBus;
        this.inicioViaje = inicioViaje;
        this.destinoViaje = destinoViaje;
        this.estadoViaje = estadoViaje;
        this.fechaHoraPartida = fechaHoraPartida;
    }
}
