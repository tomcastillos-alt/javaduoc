public class PacienteClinica {
    String nombrePaciente;
    String rutPaciente;
    String fechaNacimiento;
    int idPaciente;
    int edadPaciente;
    String diagnosticoPaciente;
    boolean enfermedadCronica;
    String tipoEnfermedad;
    int pesoPaciente;
    int alturaPaciente;

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public boolean isEnfermedadCronica() {
        return enfermedadCronica;
    }

    public void setEnfermedadCronica(boolean enfermedadCronica) {
        this.enfermedadCronica = enfermedadCronica;
    }

    public PacienteClinica(String nombrePaciente, String rutPaciente, String fechaNacimiento, int idPaciente, int edadPaciente, String diagnosticoPaciente, boolean enfermedadCronica, String tipoEnfermedad, int pesoPaciente, int alturaPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.rutPaciente = rutPaciente;
        this.fechaNacimiento = fechaNacimiento;
        this.idPaciente = idPaciente;
        this.edadPaciente = edadPaciente;
        this.diagnosticoPaciente = diagnosticoPaciente;
        this.enfermedadCronica = enfermedadCronica;
        this.tipoEnfermedad = tipoEnfermedad;
        this.pesoPaciente = pesoPaciente;
        this.alturaPaciente = alturaPaciente;
    }
}
// En este caso, siento que muchos datos quedaron fuera. Es necesario saber el tipo de sangre, tener una BDD con todos los datos de contacto, un registro de temperatura, presión arterial, frecuencia cardíaca y saturación de oxígeno. También, creo que debería existir algo asociado al id de paciente para poder combinar todo en una ficha única e ubicable dentro de esta clínica ficticia.