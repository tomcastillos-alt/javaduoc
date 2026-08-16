public class SocioGimnasio {
    String idCliente;
    String rutCliente;
    boolean estadoSocio;
    boolean estadoPago;
    int diasAsistidos;
    int precioSuscripcion;

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public boolean isEstadoSocio() {
        return estadoSocio;
    }

    public int getDiasAsistidos() {
        return diasAsistidos;
    }

    public SocioGimnasio(String idCliente, String rutCliente, boolean estadoSocio, boolean estadoPago, int diasAsistidos, int precioSuscripcion) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
        this.estadoSocio = estadoSocio;
        this.estadoPago = estadoPago;
        this.diasAsistidos = diasAsistidos;
        this.precioSuscripcion = precioSuscripcion;
    }
}
