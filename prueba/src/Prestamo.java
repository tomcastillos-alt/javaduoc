public class Prestamo {
    String nombre_usuario;
    String Nombre_libro;
    double p_multa;
    boolean estado;
    String fecha_pedida;

    public boolean solicitud(){
        return true;
    }
    public int pagarCuota(){
        return 0;
    }

    public boolean pedirOtro(){
        return true;
    }

    public Prestamo(String nombre_usuario, String nombre_libro, double p_multa, String fecha_pedida, boolean estado) {}
    public void leer(){
        System.out.println("Ingrese nombre del usuario: ");
    }
    public static void main(String[] args) {}
}

