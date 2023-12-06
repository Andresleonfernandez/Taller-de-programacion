
package Clases;

public class Especialidad {
    private String Nombre;
    private String Id;
    private double precio;
    
    public Especialidad(String Nombre,String Id,double precio){
        this.Nombre=Nombre;
        this.Id=Id;
        this.precio=precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Id;
    }

    public void setDescripcion(String Id) {
        this.Id = Id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}