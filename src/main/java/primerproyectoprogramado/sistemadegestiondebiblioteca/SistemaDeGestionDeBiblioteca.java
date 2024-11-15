
package primerproyectoprogramado.sistemadegestiondebiblioteca;

import PaqueteExepciones.LibroNoDisponibleException;
import PaqueteExepciones.OperacionNoPermitidaException;
import Vistas.BibliotecaGUI;


public class SistemaDeGestionDeBiblioteca {
    
    //Instancia estática de BibliotecaGUI
    private static BibliotecaGUI bibliotecaGUI;
    
    public static void inicializarBiblioteca(){
        //Se crea la instancia de la clase BibliotecaGUI, se invoca como visible y su posicion que no tenga referencia a nada para que se muestre en el centro
       BibliotecaGUI BibliotecaGUI = new BibliotecaGUI();
       BibliotecaGUI.setVisible(true);
       BibliotecaGUI.setSize(1100, 600);
       BibliotecaGUI.setLocationRelativeTo(null);
       
    }

    public static void main(String[] args) {
       
        //Crear libros 
        Libro libro1 = new Libro("Harry Potter y La Piedra Filosofal","J.K Rowling","9788498382662");
        Libro libro2 = new Libro("Habitos Atomicos","James Clear","9788418118036");
        Libro libro3 = new Libro("La Tormenta","Runyx","9788466679336");
        Referencia referencia1 = new Referencia("Manuscritos Antiguos", "Varios Autores Desconocidos", "ISBN No aplica");
        Referencia referencia2 = new Referencia("Enciclopedia Access Medicina", "McGraw Hill", "ISBN 1213141516171");
        Usuario usuario1 = new Usuario("Daniel Sequeira", "503720273","Estudiante");
        Usuario usuario2 = new Usuario("Lucia Castro", "102340456", "Profesora");
        
        Biblioteca.agregarLibro(libro1);
        Biblioteca.agregarLibro(libro2);
        Biblioteca.agregarLibro(libro3);
        Biblioteca.agregarUsuario(usuario1);
        Biblioteca.agregarUsuario(usuario2);
        Biblioteca.agregarLibroDeReferencia(referencia1);
        Biblioteca.agregarLibroDeReferencia(referencia2);
        
        inicializarBiblioteca();

        Biblioteca.mostrarPrestamos();
        
        // Mostrar información de los libros
        libro1.mostrarInformacion();
        referencia1.mostrarInformacion();
        referencia1.mostrarInformacionEspecial();

        // Intentar prestar y devolver los libros
        try{
        libro1.prestar();
        libro1.prestar();// Intento de prestar nuevamente
        }catch(LibroNoDisponibleException | OperacionNoPermitidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
         try {
            libro1.devolver();
            libro1.devolver(); // Intento de devolver nuevamente 
        } catch (OperacionNoPermitidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
          try {
            referencia1.prestar(); // Intento de prestar un libro de referencia 
        } catch (OperacionNoPermitidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            referencia1.devolver(); // Intento de devolver un libro de referencia 
        } catch (OperacionNoPermitidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
         

        }
    
    // Método para obtener la instancia de BibliotecaGUI
    public static BibliotecaGUI getBibliotecaGUI() {
        return bibliotecaGUI;
    }
    
    
}
