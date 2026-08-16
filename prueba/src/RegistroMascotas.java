public class RegistroMascotas {
    String nombreMascota;
    String nombreDueno;
    int edadMascota;
    String tipoAnimal;
    String razaMascota;
    boolean vacunasAlDia;
    String vacuna;
    boolean estadoEstirilizacion;


    public String getNombreDueno() {
        return nombreDueno;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public RegistroMascotas(String nombreMascota, String nombreDueno, int edadMascota, String tipoAnimal, String razaMascota, boolean vacunasAlDia, String vacuna, boolean estadoEstirilizacion) {
        this.nombreMascota = nombreMascota;
        this.nombreDueno = nombreDueno;
        this.edadMascota = edadMascota;
        this.tipoAnimal = tipoAnimal;
        this.razaMascota = razaMascota;
        this.vacunasAlDia = vacunasAlDia;
        this.vacuna = vacuna;
        this.estadoEstirilizacion = estadoEstirilizacion;
    }
}

// No añadi
// Entiendo que los registros de los veterinarios incorporan datos como el rut del dueño, o el numero de telefono y direccion de la persona a cargo del animal. Preferi no añadirlo aca para hacer un registro mas limpio, pero entiendo que son atributos que deberian estar en una BDD mas compleja.



