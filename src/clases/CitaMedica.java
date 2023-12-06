
package Clases;

public class CitaMedica {
    private Doctor nombreDoctor;
    private Paciente nombrePaciente;
    private int numeroCita;
    private Horario Dia;
    private Horario Hora;

    public CitaMedica() {
    }

    public CitaMedica(int numeroCita, Doctor nombreDoctor, Paciente nombrePaciente, Horario Dia, Horario Hora) {
        this.numeroCita = numeroCita;
        this.nombreDoctor = nombreDoctor;
        this.nombrePaciente = nombrePaciente;
        this.Dia = Dia;
        this.Hora = Hora;
    }

    public Doctor getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(Doctor nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public Paciente getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(Paciente nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(int numeroCita) {
        this.numeroCita = numeroCita;
    }

    public Horario getDia() {
        return Dia;
    }

    public void setDia(Horario Dia) {
        this.Dia = Dia;
    }

    public Horario getHora() {
        return Hora;
    }

    public void setHora(Horario Hora) {
        this.Hora = Hora;
    }
    
    

     public static void imprimirCita(CitaMedica cita) {
        if (cita != null && cita.getNombreDoctor() != null && cita.getNombrePaciente() != null) {
            System.out.println("------------------------------------------");
            System.out.println("            CLINICA NUEVA VIDAD");
            System.out.println("SI NO TE SALVAMOS, SI TE COMBRAMOS XD");
            System.out.println("------------------------------------------");
            System.out.println("Nombre del doctor: " + cita.getNombreDoctor().NombreCompletoD());
            System.out.println("Especialidad: " + cita.getNombreDoctor().getEspecialidad().getDescripcion());
            System.out.println("Costo: " + cita.getNombreDoctor().getEspecialidad().getPrecio());
            System.out.println("Nombre del paciente: " + cita.getNombrePaciente().NombreCompletoP());
            System.out.println("DNI: " + cita.getNombrePaciente().getDni());
            System.out.println("Numero de contacto: " + cita.getNombrePaciente().getTelefono());
            System.out.println("-------------------------------------------");
            System.out.println();
        } else {
            System.out.println("La cita médica es inválida");
        }
    }
}