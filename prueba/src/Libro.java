public class Libro {
    String titulo;
    int anio;
    String autor;
    String isbn;
    String Genero;
    int precio;

    public int Pagar(int precio){
        return 0;
    }
    public boolean Consulta(){
        return true;
    }
    public String buscar(String titulo){
        return null;
    }
    public void leer(){
        System.out.println("Ingrese título: ");
    }
    public static void main(String[] args) {}

    public Libro(int anio, String titulo, String autor, String isbn, String genero, int precio) {
        this.anio = anio;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        Genero = genero;
        this.precio = precio;
    }
}

// no añadí:
// pensé en añadir un booleano para significar un descuento o un int para stock. Deberían estar, pero preferí colocarlos en otro ejemplo
