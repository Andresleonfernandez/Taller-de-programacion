
package Clinica;

import Clases.CitaMedica;
import Clases.Doctor;
import Clases.Especialidad;
import Clases.Horario;
import Clases.Paciente;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Clinica_main{
    public static void main(String[] args) {
        
        Paciente P1 = new Paciente();
        Scanner sc = new Scanner(System.in);
        int maxCitas;
    
        
        Especialidad E1=new Especialidad("Cardiologia", "318", 135); 
        Doctor D1=new Doctor("Jose","Perez", "Dominguez", E1, Horario.HorariosCardiologia(),1,"https://pbs.twimg.com/profile_images/1309266094889332737/G-o2UUH2_400x400.jpg");        
        
        Especialidad E2=new Especialidad("Nutricion", "079", 50);
        Doctor D2=new Doctor("Jose", "Delgado", "Padilla", E2,Horario.HorariosNutricion(),2,"https://www.hackensackmeridianhealth.org/-/media/project/hmh/hmh/public/healthu/harsouni-imad-cropped.jpg");
               
        Especialidad E3=new Especialidad("Psicologia", "361", 40);
        Doctor D3=new Doctor("Joan", "Esther", "Smith", E3,Horario.HorariosPsicologia(),3,"https://s3-eu-west-1.amazonaws.com/intercare-web-public/wysiwyg-uploads%2F1569586526901-doctor.jpg");
               
        Especialidad E4=new Especialidad("Medicina Genereal", "859", 45);
        Doctor D4=new Doctor("Nicole", "Rodriguez", "Sanches",E4, Horario.HorariosMedicinaGenereal(),4,"https://www.wellingtonregional.com/sites/wellingtonregional.com/files/doctors_visit_1200x900.jpg");
        
        Especialidad E5=new Especialidad("Pediatria", "394", 60);
        Doctor D5 = new Doctor("William", "Afton", "P.", E5,Horario.HorariosPediatria(),5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLJkxZXPsiXcGWGiI34EXwnlT0-hUMVNSrBQ&usqp=CAU");
        
        System.out.println("  ----- CLINICA NUEVA VIDA ----- ");
        System.out.println("___________________________________");
        System.out.println("      RESERVA TU CITA AQUI ");
        System.out.println("___________________________________");
        System.out.print("Por Favor ingrese la cantidad de citas que desea aguendar: ");
        do{
            maxCitas=sc.nextInt();
            if(maxCitas<=0){
                System.out.println("VALOR INVALIDO. INGRESE UN VALOR OTRO VALOR");
            }
        }while (maxCitas<=0);

        System.out.println("Lista de Especialidades disponibles:");
        System.out.println("");
        CitaMedica []citasClinica=new CitaMedica[maxCitas];
        for (int i = 0; i < citasClinica.length; i++) {
            System.out.println("CITA :"+(i+1));
            citasClinica[i]=new CitaMedica();
            D1.MostrarInfoD();
            D2.MostrarInfoD();
            D3.MostrarInfoD();
            D4.MostrarInfoD();
            D5.MostrarInfoD();

            System.out.print("Seleccione la Especialidad deseada de la Cita (0 para salir): ");
            int opcionD = sc.nextInt();
            if (opcionD != 0) {
                System.out.println("Horarios Disponibles:");
                switch (opcionD) {
                    case 1:
                        D1.programarCita();
                        P1.leerDatosP();
                        citasClinica[i].setNombreDoctor(D1);
                        citasClinica[i].setNombrePaciente(P1);
                        citasClinica[i].getDia();
                        citasClinica[i].getHora();
                        break;
                    case 2:
                        D2.programarCita();
                        P1.leerDatosP();
                        citasClinica[i].setNombreDoctor(D2);
                        citasClinica[i].setNombrePaciente(P1);
                        citasClinica[i].getDia();
                        citasClinica[i].getHora();
                        break;
                    case 3:
                        D3.programarCita();
                        P1.leerDatosP();
                        citasClinica[i].setNombreDoctor(D3);
                        citasClinica[i].setNombrePaciente(P1);
                        citasClinica[i].getDia();
                        citasClinica[i].getHora();
                        break;
                    case 4:
                        D4.programarCita();
                        P1.leerDatosP();
                        citasClinica[i].setNombreDoctor(D4);
                        citasClinica[i].setNombrePaciente(P1);
                        citasClinica[i].getDia();
                        citasClinica[i].getHora();
                        break;
                    case 5:
                        D5.programarCita();
                        P1.leerDatosP();
                        citasClinica[i].setNombreDoctor(D5);
                        citasClinica[i].setNombrePaciente(P1);
                        citasClinica[i].getDia();
                        citasClinica[i].getHora();
                        break;
                    default:
                System.out.println("Opcion no valida, intente de nuevo :3 ");
                break;
            }            
            }
        }
        System.out.println("________________________________________________________________");
        System.out.println("                       CLINICA NUEVA VIDAD");
        System.out.println("               SI NO TE SALVAMOS, SI TE COMBRAMOS XD            ");
        System.out.println("________________________________________________________________");
        for(int i=0;i<citasClinica.length;i++){
        CitaMedica.imprimirCita(citasClinica[i]);
        }
        System.out.println("GRACIAS POR SU PREFERENCIA VUELVA PRONTO :3");
        
        StringBuilder HTML = new StringBuilder();
        HTML.append("<html><head><title>CLINICA NUEVA VIDA</title></head><body>");
        HTML.append("<h1>CITAS CLINICAS</h1>");
        HTML.append("<p></p>");
        
        for(int i=0;i<citasClinica.length;i++){
        HTML.append("<div>");
        HTML.append("<h2>CITA N°"+(i+1)+"</H2>");
        HTML.append("</div>");
        HTML.append("<img src=\"" + citasClinica[i].getNombreDoctor().getImagen() + "\">");
        HTML.append("<p>________________________________________________________________</p>");
        HTML.append("<p>NOMBRE DEL DOCTOR:"+citasClinica[i].getNombreDoctor().NombreCompletoD()+"</p>");
        HTML.append("<p>ESPECIALIDAD: "+citasClinica[i].getNombreDoctor().getEspecialidad().getNombre()+"</p>");
        HTML.append("<p>PRECIO: "+citasClinica[i].getNombreDoctor().getEspecialidad().getPrecio()+"</p>");
        HTML.append("<p>NOMBRE DEL PACIENTE: "+citasClinica[i].getNombrePaciente().NombreCompletoP()+"</p>");
        HTML.append("<p>DNI DEL PACIENTE:"+citasClinica[i].getNombrePaciente().getDni()+"</p>");
        HTML.append("<p>NUMERO DE CONTACTO:"+citasClinica[i].getNombrePaciente().getTelefono()+"</p>");
        HTML.append("<p>________________________________________________________________</p>");
        HTML.append("<footer><p>ESTA CLINICA ES PRIVADA, PAGA O TE MANDAMOS A MATATAR XD</p></footer>");
        HTML.append("</body></html>");
        
        String rutaArcivo="C:\\Users\\NILTON.PRINCIPAL.000\\Desktop\\doctorimgenes\\Citas.html";
        
        try(FileWriter writer = new FileWriter(rutaArcivo)){
            writer.write(HTML.toString());
            System.out.println("Cita HTML generada y creada en: "+rutaArcivo);
            } catch(IOException e){
            e. printStackTrace();
            }
        }
    }
}