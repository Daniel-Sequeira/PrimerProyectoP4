
package primerproyectoprogramado.sistemadegestiondebiblioteca;

import PaqueteExepciones.LibroNoDisponibleException;
import PaqueteExepciones.OperacionNoPermitidaException;


public class Libro extends ElementoBiblioteca implements Prestable {
    
    private final String autor;
    private final String isbn;
    private EstadoLibro estado;
    
    public Libro(String titulo, String autor, String isbn){
        super(titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.estado = EstadoLibro.DISPONIBLE;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

   public EstadoLibro getEstado(){
       return this.estado;
   }
    
   public void setEstado(EstadoLibro estado){
       this.estado = estado;
   }
   
    @Override
    public void prestar() throws LibroNoDisponibleException, OperacionNoPermitidaException {
        if (estado == EstadoLibro.DISPONIBLE) {
            estado = EstadoLibro.PRESTADO;
            System.out.println("El libro ha sido prestado.");
        } else {
            throw new LibroNoDisponibleException("El libro " + titulo + " no está disponible para préstamo.");
        }
    }
    
     @Override
    public void devolver() throws OperacionNoPermitidaException {
        if (estado == EstadoLibro.PRESTADO) {
            estado = EstadoLibro.DISPONIBLE;
            System.out.println("El libro ha sido devuelto.");
        } else {
            throw new OperacionNoPermitidaException("El libro " + titulo + " no estaba en préstamo.");
        }
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Estado: " + estado);
    }

    
}
