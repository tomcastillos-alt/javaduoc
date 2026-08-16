public class Curso {
    String nombreCurso;
    int cantidadDeAlumnos;
    boolean estado;
    String seccion;
    int fechaInicio;
    int fechaFin;
    String nombreAlumno;

    public boolean ConsultarEstado() {
        return estado;
    }
    public String ConsultarSeccion() {
        return seccion;
    }

    public int ConsultarCantidadDeAlumnos() {
        return cantidadDeAlumnos;
    }

    public Curso(String nombreCurso, int cantidadDeAlumnos, boolean estado, String seccion, int fechaFin, String nombreAlumno, int fechaInicio) {
        this.nombreCurso = nombreCurso;
        this.cantidadDeAlumnos = cantidadDeAlumnos;
        this.estado = estado;
        this.seccion = seccion;
        this.fechaFin = fechaFin;
        this.nombreAlumno = nombreAlumno;
        this.fechaInicio = fechaInicio;
    }
}

// no coloqué:
// sede: podría ser un atributo importante si se trata de una casa de estudios con diversas sedes (ej: duoc).
