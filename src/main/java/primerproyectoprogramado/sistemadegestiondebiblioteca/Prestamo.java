
package primerproyectoprogramado.sistemadegestiondebiblioteca;
import java.util.Date;

public class Prestamo {
    private final Libro libro;
    private final Usuario usuario;
    private final Date fechaPrestamo;
    
    public Prestamo(Libro libro, Usuario usuario){
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = new Date();
        this.libro.setEstado(EstadoLibro.PRESTADO);
    }
    
    public Libro getLibro(){
        return this.libro;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public Date getFechaPrestamo(){
        return this.fechaPrestamo;
    }
    
    @Override
    public String toString(){
        return "Prestamo de " + libro.getTitulo() + " a " + usuario.getNombre() + " el " + fechaPrestamo;
    }
}
