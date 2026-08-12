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

    public Estudiante(String nombre, String apellido, String direccion, int edad, boolean estadoMatricula, int fechaMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.estadoMatricula = estadoMatricula;
        this.fechaMatricula = fechaMatricula;
    }
}
