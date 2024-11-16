
package primerproyectoprogramado.sistemadegestiondebiblioteca;

import PaqueteExepciones.LibroNoDisponibleException;
import PaqueteExepciones.OperacionNoPermitidaException;
import Vistas.BibliotecaGUI;
/*
La clase principal que ejecuta la entrada al programa y en este caso por defeto he creado unos libros para que se carguen en la lista
asi como usuarios con el fin de prueba del programa, que tembien permite desde sus funciones agregar libros y usuarios, al tener varios
vuelve mas interactivo realizar prestamos devoluciones, probar las excepciones.
El proyecto se separo en paquetes de vistas para contener las clases referentes a interfaz grafica y primer proyecto program... para 
las clases de codigo que gestionan el back end de la aplicacion.
*/

public class SistemaDeGestionDeBiblioteca {
    
    //Instancia estática de BibliotecaGUI
    private static BibliotecaGUI bibliotecaGUI;
    //Metodo para inicializar el formulario principal (interfaz grafica)
    public static void inicializarBiblioteca(){
        //Se crea la instancia de la clase BibliotecaGUI, se invoca como visible y su posicion que no tenga referencia a nada para que se muestre en el centro
       BibliotecaGUI BibliotecaGUI = new BibliotecaGUI();
       BibliotecaGUI.setVisible(true);
       BibliotecaGUI.setSize(1100, 600);
       BibliotecaGUI.setLocationRelativeTo(null);
       
    }
    //metodoprincipal que carga el formulario principal a traves del cual accedemos a las diferentes herramientas
    public static void main(String[] args) {
       
        //Crear libros para cargar listas y probar el programa y sus funcionalidades
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
        //Importatnte el metodo agregar usuario recibe 2 parametros el objeto usuario y un objeto component que en este caso es JOptionPane
        //Como esos usuarios se estan agregando desde consola y no desde interfaz grafica no hay elemento que mostrar por lo que se envia null
        //para indicar que no hay parametro y no nos produzca error
        Biblioteca.agregarUsuario(usuario1,null);
        Biblioteca.agregarUsuario(usuario2,null);
        
        Biblioteca.agregarLibroDeReferencia(referencia1);
        Biblioteca.agregarLibroDeReferencia(referencia2);
        
        inicializarBiblioteca();
 
        }
    
    // Método para obtener la instancia de BibliotecaGUI
    public static BibliotecaGUI getBibliotecaGUI() {
        return bibliotecaGUI;
    }
    
    
}
