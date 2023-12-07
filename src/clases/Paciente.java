
package Clases;

import java.util.Scanner;

public class Paciente {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private int dni;
    private int telefono;
    
    Scanner sc= new Scanner(System.in);
    
    public Paciente(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellido2) {
        this.apellidoM = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void leerDatosP(){
        System.out.println("Ingrese los datos del Paciente: ");
        System.out.print("Nombre: ");
        setNombre(sc.nextLine());
        System.out.print("Apellido Paterno: ");
        setApellidoP(sc.nextLine());
        System.out.print("Apellido Materno: ");
        setApellidoM(sc.nextLine());
        System.out.print("Edad: ");
        setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("DNI: ");
        setDni(sc.nextInt());
        sc.nextLine();
        System.out.print("Telefono: ");
        setTelefono(sc.nextInt());
        sc.nextLine();
    }
    
    public String NombreCompletoP(){
        return getNombre()+" "+getApellidoP()+" "+getApellidoM();
    }
}