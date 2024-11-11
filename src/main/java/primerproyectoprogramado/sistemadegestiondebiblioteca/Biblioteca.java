
package primerproyectoprogramado.sistemadegestiondebiblioteca;
import java.util.*;

public class Biblioteca {
    private static final ArrayList<Libro> libros = new ArrayList<>();
    private static final Set<Usuario> usuarios = new HashSet<>();
    private static final Stack<Prestamo> prestamos = new Stack<>();
    private static final HashMap<String, Libro> librosIsbn = new HashMap<>();
    
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
    
    public static void devolverlibro(Libro libro){
         try {
            libro.devolver();
            System.out.println("Libro devuelto: " + libro);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void mostrarLibros(){
        System.out.println("Lista de Libros ");
        for(Libro libro : libros){
            System.out.println(libro);
        }
    }
    
    public static void mostrarPrestamos(){
        System.out.println("Historial de préstamos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
    
}
