public class Estudiante {
    String nombre;
    String apellido;
    String direccion;
    int edad;
    int fechaMatricula;
    boolean estadoMatricula;

    public String buscarAlumno(){
        return null;
    }
    public String buscarDireccion(){
        return null;
    }
    public int buscarEdad(){
        return 0;
    }

    public String añadirAlumno(){
        return null;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstadoMatricula(boolean estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }

    public Estudiante(String nombre, String apellido, String direccion, int edad, boolean estadoMatricula, int fechaMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.estadoMatricula = estadoMatricula;
        this.fechaMatricula = fechaMatricula;
    }
}

// no coloqué:
// rut y dirección: estos atributos son relevantes, pero quería experimentar con otros datos relevantes.