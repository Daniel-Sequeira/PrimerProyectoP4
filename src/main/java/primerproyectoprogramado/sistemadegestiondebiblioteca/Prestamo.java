
package primerproyectoprogramado.sistemadegestiondebiblioteca;
import java.util.Date;
//Clse prestamo que contiene sus atributos de libro usuario y fecha prestamo
public class Prestamo {
    private final Libro libro;
    private final Usuario usuario;
    private final Date fechaPrestamo;
    //Constructor de la calse que inicializa atributos
    public Prestamo(Libro libro, Usuario usuario){
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = new Date();
        this.libro.setEstado(EstadoLibro.PRESTADO);
    }
    //Metods de acceso a los atributos privados que retornan libro, usuario, fechaPrestamo
    public Libro getLibro(){
        return this.libro;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public Date getFechaPrestamo(){
        return this.fechaPrestamo;
    }
    //Sobrescritura metodo to String que devuelve cadena prestamo y su descripcion
    @Override
    public String toString(){
        return "Prestamo de " + libro.getTitulo() + " a " + usuario.getNombre() + " el " + fechaPrestamo;
    }
}
