
package primerproyectoprogramado.sistemadegestiondebiblioteca;

public class Persona {
    
    
    private  final String nombre;
    private  final String idUsuario;
    
    public Persona(String nombre, String idUsuario){
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getIdUsuario(){
        return this.idUsuario;
    }
    
    @Override
    public String toString(){
        return nombre + " (ID Usuario: " + idUsuario + ")";
    }
    
}
