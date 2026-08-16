public class CitaMedica {
    String rutPaciente;
    String nombrePaciente;
    String nombreDoctor;
    String especialidadDoctor;
    boolean estadoConfirmacion;
    String fechaHoracita;
    boolean estadoPago;
    boolean estadoAtencion;

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public boolean isEstadoConfirmacion() {
        return estadoConfirmacion;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public String getFechaHoracita() {
        return fechaHoracita;
    }

    public boolean isEstadoAtencion() {
        return estadoAtencion;
    }

    public CitaMedica(String rutPaciente, String nombrePaciente, String nombreDoctor, String fechaHoracita, String especialidadDoctor, boolean estadoConfirmacion, boolean estadoPago) {
        this.rutPaciente = rutPaciente;
        this.nombrePaciente = nombrePaciente;
        this.nombreDoctor = nombreDoctor;
        this.fechaHoracita = fechaHoracita;
        this.especialidadDoctor = especialidadDoctor;
        this.estadoConfirmacion = estadoConfirmacion;
        this.estadoPago = estadoPago;
    }
}

// no añadi: Pensé en añadir datos relacionados con la afiliación al sistema previsional de salud (como un booleano que marcara si es fonasa o isapre según true/false), pero no me convenció del todo la aplicación.