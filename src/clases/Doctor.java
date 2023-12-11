
package Clases;

import java.util.Scanner;
import java.util.ArrayList;

public class Doctor {
    
    Scanner sc = new Scanner(System.in);
    
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private Especialidad Especialidad;
    private ArrayList<Horario> horario;
    private int opcion;
    private String imagen;
    
    public Doctor(String nombre,String ApellidoP,String ApellidoM,Especialidad Especialidad,ArrayList<Horario> horario,int opcion,String imagen){
        this.Nombre=nombre;
        this.ApellidoP=ApellidoP;
        this.ApellidoM=ApellidoM;
        this.Especialidad=Especialidad;
        this.horario=horario;
        this.opcion=opcion;
        this.imagen=imagen;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoPM) {
        this.ApellidoP = ApellidoPM;
    }
    
    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public Especialidad getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(Especialidad Especialidad) {
        this.Especialidad = Especialidad;
    }

    public ArrayList<Horario> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<Horario> horario) {
        this.horario = horario;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public String NombreCompletoD(){
        return getNombre()+" "+getApellidoP()+" "+getApellidoM();
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public void MostrarInfoD() {
        System.out.println("["+opcion+"]"+" Especialidad: " + Especialidad.getNombre());
        System.out.println("    Doctor: " + getNombre() + " " + getApellidoP()+" "+getApellidoM());
        System.out.println();
    }
    
    
    public void MostrarHorarioD() {
        for(int i=0;i<5;i++){
            System.out.println(horario.get(i));
        }
    }
    
    
    public String programarCita() {
        do {
            MostrarHorarioD();
            System.out.print("Seleccione el horario deseado para su cita: ");
            int opcionS = sc.nextInt();
            sc.nextLine();

            if (opcionS > 0 && opcionS <= getHorario().size()) {
                Horario horarioSelec = getHorario().get(opcionS - 1);

                if (!horarioSelec.HoraOcupada()) {
                    System.out.print("La fecha seleccionada es: " + horarioSelec.toString());
                    horarioSelec.marcarComoOcupado();
                    return "Dia: "+horarioSelec.getDia()+" Hora: "+horarioSelec.getHora();
                } else {
                    System.out.println("\nEl horario seleccionado ya está ocupado.\nPor favor, elige otro horario.");
                }
            } else {
                System.out.println("\nOpción de horario inválida.\nInténtelo de nuevo.\n");
            }
        } while (true);
    }
    
}