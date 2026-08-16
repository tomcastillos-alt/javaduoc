public class EntradaCine {
    String idComprador;
    String nombrePelicula;
    int numeroAsiento;
    double precio;
    int salaPelicula;

    public String getIdComprador() {
        return idComprador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public EntradaCine(String idComprador, String nombrePelicula, int numeroAsiento, double precio, int salaPelicula) {
        this.idComprador = idComprador;
        this.nombrePelicula = nombrePelicula;
        this.numeroAsiento = numeroAsiento;
        this.precio = precio;
        this.salaPelicula = salaPelicula;
    }

}

// no añadi: se me ocurrió hacer un booleano para establecer si se compró más de una entrada bajo el mismo id, o para significar si la entrada esta sujeta a alguna promocion. Como en otros casos, preferi no añadirlo para no complicar el ejercicio.

