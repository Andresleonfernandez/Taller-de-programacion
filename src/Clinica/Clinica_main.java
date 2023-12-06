
package Clinica;

import Clases.CitaMedica;
import Clases.Doctor;
import Clases.Especialidad;
import Clases.Horario;
import Clases.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica_main{
    public static void main(String[] args) {
        
        ArrayList<CitaMedica> citas = new ArrayList<>();
        Paciente P1 = new Paciente();
        Scanner sc = new Scanner(System.in);
        String respuesta;
        
        Especialidad E1=new Especialidad("Cardiologia", "318", 135); 
        Doctor D1=new Doctor("Jose","Perez", "Dominguez", E1, Horario.HorariosCardiologia(),1);        
        
        Especialidad E2=new Especialidad("Nutricion", "079", 50);
        Doctor D2=new Doctor("Jose", "Delgado", "Padilla", E2,Horario.HorariosNutricion(),2);
               
        Especialidad E3=new Especialidad("Psicologia", "361", 40);
        Doctor D3=new Doctor("Joan", "Esther", "Smith", E3,Horario.HorariosPsicologia(),3);
               
        Especialidad E4=new Especialidad("Medicina Genereal", "859", 45);
        Doctor D4=new Doctor("Nicole", "Rodriguez", "Sanches",E4, Horario.HorariosMedicinaGenereal(),4);
        
        Especialidad E5=new Especialidad("Pediatria", "394", 60);
        Doctor D5 = new Doctor("William", "Afton", "P.", E5,Horario.HorariosPediatria(),5);
        
        System.out.println(" ----- CLINICA NUEVA VIDA ----- ");
        System.out.println(" ______________________________ ");
        System.out.println("      RESERVA TU CITA AQUI ");
        System.out.println("___________________________________");

            System.out.println("Lista de Especialidades disponibles:");
            System.out.println("");
        do {
            D1.MostrarInfoD();
            D2.MostrarInfoD();
            D3.MostrarInfoD();
            D4.MostrarInfoD();
            D5.MostrarInfoD();

            System.out.print("Seleccione la Especialidad deseada de la Cita (0 para salir): ");
            int opcionD = sc.nextInt();
            if (opcionD != 0) {
                System.out.println("Horarios Disponibles:");
                CitaMedica nuevaCita = new CitaMedica();
                switch (opcionD) {
                    case 1:
                        D1.programarCita();
                        P1.leerDatosP();
                        nuevaCita.setNombreDoctor(D1);
                        nuevaCita.setNombrePaciente(P1);
                        nuevaCita.getDia();
                        nuevaCita.getHora();
                        citas.add(nuevaCita);
                        CitaMedica.imprimirCita(nuevaCita);
                        break;
                    case 2:
                        D1.programarCita();
                        P1.leerDatosP();
                        nuevaCita.setNombreDoctor(D2);
                        nuevaCita.setNombrePaciente(P1);
                        nuevaCita.getDia();
                        nuevaCita.getHora();
                        citas.add(nuevaCita);
                        CitaMedica.imprimirCita(nuevaCita);
                        break;
                    case 3:
                        D1.programarCita();
                        P1.leerDatosP();
                        nuevaCita.setNombreDoctor(D3);
                        nuevaCita.setNombrePaciente(P1);
                        nuevaCita.getDia();
                        nuevaCita.getHora();
                        citas.add(nuevaCita);
                        CitaMedica.imprimirCita(nuevaCita);
                        break;
                    case 4:
                        D1.programarCita();
                        P1.leerDatosP();
                        nuevaCita.setNombreDoctor(D4);
                        nuevaCita.setNombrePaciente(P1);
                        nuevaCita.getDia();
                        nuevaCita.getHora();
                        citas.add(nuevaCita);
                        CitaMedica.imprimirCita(nuevaCita);
                        break;
                    case 5:
                        D1.programarCita();
                        P1.leerDatosP();
                        nuevaCita.setNombreDoctor(D5);
                        nuevaCita.setNombrePaciente(P1);
                        nuevaCita.getDia();
                        nuevaCita.getHora();
                        citas.add(nuevaCita);
                        CitaMedica.imprimirCita(nuevaCita);
                        break;
                    default:
                        System.out.println("Opcion no valida, intente de nuevo :3 ");
                        break;
                }
                System.out.print("¿Desea agendar otra cita? (Si/No): ");
                respuesta = sc.next();
            } else {
                respuesta = "no";
            }
        } while ("si".equalsIgnoreCase(respuesta));
    }   
}
