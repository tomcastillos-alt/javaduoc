public class Producto {
    String nombre;
    String id;
    int precio;
    int stock;
    boolean estadoStock;

    public boolean estadoConsulta(){
        return true;
    }
    public int GetPrecio(){
        return 0;
    }

    public String getNombre(){
        return nombre;}


    public String getId(){
        return id;}

    public boolean isEstadoStock() {
        return estadoStock;
    }

    public int getStock() {
        return stock;
    }

    public Producto(String nombre, String id, int precio, int stock, boolean estadoStock) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.stock = stock;
        this.estadoStock = estadoStock;
    }
}

// no añadi:
// Pensé en añadir el atributo marca para diferenciar productos iguales de distintas marcas (ej: dos marcas de cuadernos, o tres marcas de barras de chocolate).
// No lo añadi para no complicar el ejercicio