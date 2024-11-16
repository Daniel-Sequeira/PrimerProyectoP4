
package primerproyectoprogramado.sistemadegestiondebiblioteca;

public class Persona {
    //Clase Persona que es la clase padre de Usuario contiene sus atributos nombre id usuario que son comunes entre cualquier tipo de usuario
    
    private  final String nombre;
    private  final String idUsuario;
    //constructor de la clase
    public Persona(String nombre, String idUsuario){
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }
    //Sus metods de acceso a los atributos privados
    public String getNombre(){
        return this.nombre;
    }
    
    public String getIdUsuario(){
        return this.idUsuario;
    }
    //Sobrescritura del metodo toString que devuelve cedena id usuario
    @Override
    public String toString(){
        return nombre + " (ID Usuario: " + idUsuario + ")";
    }
    
}
