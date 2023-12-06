
package Clases;

import java.util.ArrayList;

public class Horario {
    private int opcion;
    private String Dia;
    private String Hora;
    private boolean ocupado;

    public Horario(int opcion,String Dia, String Hora) {
        this.opcion=opcion;
        this.Dia = Dia;
        this.Hora = Hora;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "["+opcion+"] "+"Dia: " + Dia + ", Hora: " + Hora;
    }
    
    public static ArrayList<Horario> HorariosCardiologia(){
    ArrayList<Horario> horariosC = new ArrayList<>();
        horariosC.add(new Horario(1,"Sabado   ", "15:00\n"));
        horariosC.add(new Horario(2,"Lunes    ", "13:00\n"));
        horariosC.add(new Horario(3,"Miercoles", "13:00\n"));
        horariosC.add(new Horario(4,"Viernes  ", "13:00\n"));
        horariosC.add(new Horario(5,"Sabado   ", "15:00\n"));
        return horariosC;
    }
    
    public static ArrayList<Horario> HorariosNutricion() {
        ArrayList<Horario> horariosN = new ArrayList<>();
        horariosN.add(new Horario(1,"Lunes    ", "16:00\n"));
        horariosN.add(new Horario(2,"Miercoles", "15:00\n"));
        horariosN.add(new Horario(3,"Viernes  ", "16:00\n"));
        horariosN.add(new Horario(4,"Domingo  ", "19:00\n"));
        horariosN.add(new Horario(5,"Martes   ", "10:00\n"));
        return horariosN;
    }
    public static ArrayList<Horario> HorariosPsicologia() {
        ArrayList<Horario> horariosP = new ArrayList<>();
        horariosP.add(new Horario(1,"Sabado   ", "13:00\n"));
        horariosP.add(new Horario(2,"Lunes    ", "15:00\n"));
        horariosP.add(new Horario(3,"Martes   ", "16:00\n"));
        horariosP.add(new Horario(4,"Miercoles", "14:00\n"));
        horariosP.add(new Horario(5,"Jueves   ", "13:00\n"));
        return horariosP;
    }
    public static ArrayList<Horario> HorariosMedicinaGenereal() {
        ArrayList<Horario> horariosMG = new ArrayList<>();
        horariosMG.add(new Horario(1,"Domingo", "08:00\n"));
        horariosMG.add(new Horario(2,"Lunes" , "09:00\n"));
        horariosMG.add(new Horario(3,"Martes ", "10:00\n"));
        horariosMG.add(new Horario(4,"Jueves ", "11:00\n"));
        horariosMG.add(new Horario(5,"Viernes", "12:00\n"));
        return horariosMG;
    }
    public static ArrayList<Horario> HorariosPediatria() {
        ArrayList<Horario> horariosPe = new ArrayList<>();
        horariosPe.add(new Horario(1,"Lunes    ", "12:00\n"));
        horariosPe.add(new Horario(2,"Martes   ", "13:00\n"));
        horariosPe.add(new Horario(3,"Miercoles", "14:00\n"));
        horariosPe.add(new Horario(4,"Jueves   ", "13:00\n"));
        horariosPe.add(new Horario(5,"Viernes  ", "12:00\n"));
        return horariosPe;
    }

    public boolean HoraOcupada() {
        return ocupado;
    }

    public void marcarComoOcupado() {
        this.ocupado = true;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
