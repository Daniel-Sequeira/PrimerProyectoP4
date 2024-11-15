
package primerproyectoprogramado.sistemadegestiondebiblioteca;
import java.util.*;

public class Biblioteca {
    private static final List<Libro> libros = new ArrayList<>();
    private static final Set<Usuario> usuarios = new HashSet<>();
    private static final Stack<Prestamo> prestamos = new Stack<>();
    private static final HashMap<String, Libro> librosIsbn = new HashMap<>();
    private static Set<Referencia> librosDeReferencia = new HashSet<>();
    
    
    // Método para agregar un libro de referencia
    public static void agregarLibroDeReferencia(Referencia libro) {
        librosDeReferencia.add(libro);
    }
    
    // Método para obtener la lista de libros de referencia
    public static Set<Referencia> getLibrosDeReferencia() {
        return librosDeReferencia;
    }
    
    public static void agregarLibro(Libro libro){
        libros.add(libro);
        librosIsbn.put(libro.getIsbn(), libro);
        System.out.println("Libro agregado: " + libro);
    }
    
    public static void agregarUsuario(Usuario usuario){
         if (usuarios.add(usuario)) { // Añadir al Set, que solo almacena usuarios únicos
            System.out.println("Usuario agregado: " + usuario);
        } else {
            System.out.println("El usuario ya existe en la colección.");
        }
    }
    
    public static void realizarPrestamo(Libro libro, Usuario usuario){
        try {
            libro.prestar();
            Prestamo prestamo = new Prestamo(libro, usuario);
            prestamos.push(prestamo); // Agregar préstamo al historial
            System.out.println("Préstamo realizado: " + prestamo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void devolverLibro(Libro libro){
         try {
            libro.devolver();
            System.out.println("Libro devuelto: " + libro);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
      // Método para obtener la lista de libros
    public static List<Libro> obtenerLibros() {
        return new ArrayList<>(libros); // Se devuelve una copia de la lista para proteger los datos originales
    }
    
    public static List<Prestamo> mostrarPrestamos(){
        return new ArrayList<>(prestamos);
    }
    
    public static Set<Usuario> getUsuarios() {
    // Devuelve el conjunto de usuarios registrados en la biblioteca
    return usuarios; // Asegúrate de usar el nombre correcto de tu colección
}
    
}
