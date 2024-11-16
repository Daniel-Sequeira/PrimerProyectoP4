
package primerproyectoprogramado.sistemadegestiondebiblioteca;

import PaqueteExepciones.LibroNoDisponibleException;
import PaqueteExepciones.OperacionNoPermitidaException;
import javax.swing.JOptionPane;

// La clase Libro extiende ElementoBiblioteca e implementa la interfaz Prestable
public class Libro extends ElementoBiblioteca implements Prestable {
    // Atributos específicos de un libro
    private final String autor;
    private final String isbn;
    private EstadoLibro estado;
    // Constructor que inicializa el título, autor, ISBN y estado del libro
    public Libro(String titulo, String autor, String isbn){
        super(titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.estado = EstadoLibro.DISPONIBLE;
    }
    //Metodos de acceso para obtener (get) los diferentes atributos
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
   
    // Implementación del método prestar() de la interfaz Prestable
    @Override
    public void prestar() throws LibroNoDisponibleException, OperacionNoPermitidaException {
        if (estado == EstadoLibro.DISPONIBLE) {// Verifica si el libro está disponible
            estado = EstadoLibro.PRESTADO;// Cambia el estado a prestado
            JOptionPane.showMessageDialog(null, "El libro ha sido prestado.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Lanza una excepción si el libro no está disponible
            String mensaje = "El libro " + titulo + " no está disponible para préstamo.";
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        throw new LibroNoDisponibleException(mensaje);
        }
    }
    
    // Implementación del método devolver() de la interfaz Prestable
     @Override
    public void devolver() throws OperacionNoPermitidaException {
        if (estado == EstadoLibro.PRESTADO) {// Verifica si el libro está prestado
            estado = EstadoLibro.DISPONIBLE;// Cambia el estado a disponible
            JOptionPane.showMessageDialog(null, "El libro ha sido devuelto.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String mensaje = "El libro " + titulo + " no estaba en préstamo.";
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            throw new OperacionNoPermitidaException(mensaje);
        }
    }
    // Método que muestra la información completa del libro por sobrescritura
    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Estado: " + estado);
    }
    // Método toString() para representar el libro como una cadena de texto
    @Override
    public String toString() {
        return getTitulo() + " - " + getAutor() + " (ISBN: " + getIsbn() + ")";
    }
    
}
