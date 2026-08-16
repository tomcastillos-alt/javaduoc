public class PedidoComida {
    String nombreRestaurant;
    String DireccionEnvio;
    String idComprador;
    double precioPedido;
    int idPedido;
    boolean EstadoPago;
    double totalPago;
    double precioEnvio;

    public boolean isEstadoPago() {
        return EstadoPago;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        DireccionEnvio = direccionEnvio;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public PedidoComida(String nombreRestaurant, String direccionEnvio, String idComprador, double precioPedido, int idPedido, boolean estadoPago, double totalPago, double precioEnvio) {
        this.nombreRestaurant = nombreRestaurant;
        DireccionEnvio = direccionEnvio;
        this.idComprador = idComprador;
        this.precioPedido = precioPedido;
        this.idPedido = idPedido;
        EstadoPago = estadoPago;
        this.totalPago = totalPago;
        this.precioEnvio = precioEnvio;
    }
}

// no añadi: Pensé en un booleano para representar un descuento (aplica descuento) y un String e double para significar la id de la promocion y el monto de dcto respectivos. Decidi no hacerlo para no complicar los atributos existentes (y porque creo que podrian colocarse en otro objeto)

