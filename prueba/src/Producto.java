public class Producto {
    String nombre;
    String id;
    int precio;
    int cantidad;
    boolean estado;
    public Producto(String nombre, String id, int precio, int cantidad) {
    }

    public Producto(String nombre, String id, int precio, boolean estado, int cantidad) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.estado = estado;
        this.cantidad = cantidad;
    }
}
