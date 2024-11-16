
package primerproyectoprogramado.sistemadegestiondebiblioteca;
import java.awt.Component;
import java.util.*;
import javax.swing.JOptionPane;
//Estas clases son el backend de l programa ya que ejecutan funciones que son llamadas desde las clases que son interfaz grafica

public class Biblioteca {
    // Lista que almacena todos los libros en la biblioteca
    private static final List<Libro> libros = new ArrayList<>();
     // Conjunto que almacena todos los usuarios registrados en la biblioteca
    private static final Set<Usuario> usuarios = new HashSet<>();
    // Pila que almacena los préstamos realizados, el último préstamo se registra primero
    private static final Stack<Prestamo> prestamos = new Stack<>();
    // Mapa que asocia cada ISBN de un libro con el libro correspondiente
    private static final HashMap<String, Libro> librosIsbn = new HashMap<>();
    // Pila que almacena los libros de referencia
    private static Set<Referencia> librosDeReferencia = new HashSet<>();
    
    
    // Método para agregar un libro de referencia
    public static void agregarLibroDeReferencia(Referencia libro) {
        librosDeReferencia.add(libro);
    }
    
    // Método para obtener la lista de libros de referencia
    public static Set<Referencia> getLibrosDeReferencia() {
        return librosDeReferencia;
    }
    // Método para agregar un libro a la biblioteca
    public static void agregarLibro(Libro libro){
        libros.add(libro);
        librosIsbn.put(libro.getIsbn(), libro);
        System.out.println("Libro agregado: " + libro);
    }
     // Método para agregar un usuario a la biblioteca
    public static void agregarUsuario(Usuario usuario, java.awt.Component parentComponent){
         // Validar si el usuario ya existe en el Set
    if (usuarios.contains(usuario)) {
        JOptionPane.showMessageDialog(parentComponent, "El usuario ya existe en la colección.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } else {
        // Si no existe, agregar al Set
        usuarios.add(usuario);
        
        }
    }
     // Método para realizar un préstamo de un libro a un usuario
    public static void realizarPrestamo(Libro libro, Usuario usuario, Component parentComponent){
        try {
            libro.prestar();
            Prestamo prestamo = new Prestamo(libro, usuario);
            prestamos.push(prestamo); // Agregar préstamo al historial
            // Mostrar un mensaje indicando que el préstamo se ha realizado con éxito
            JOptionPane.showMessageDialog(parentComponent, "Préstamo realizado: " + prestamo, "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
             // Si ocurre un error, mostrar un mensaje de excepcion
            JOptionPane.showMessageDialog(parentComponent, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      // Método para devolver un libro prestado
    public static void devolverLibro(Libro libro,Component parentComponent){
         try {
            libro.devolver();
            JOptionPane.showMessageDialog(parentComponent, "Libro devuelto: " + libro, "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parentComponent, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
      // Método para obtener la lista de libros
    public static List<Libro> obtenerLibros() {
        return new ArrayList<>(libros); // Se devuelve una copia de la lista para proteger los datos originales
    }
    // Método para obtener la lista de todos los préstamos realizados
    public static List<Prestamo> mostrarPrestamos(){
        return new ArrayList<>(prestamos);
    }
    
    public static Set<Usuario> getUsuarios() {
    // Devuelve el conjunto de usuarios registrados en la biblioteca
    return usuarios; // Asegúrate de usar el nombre correcto de tu colección
}
    
}
