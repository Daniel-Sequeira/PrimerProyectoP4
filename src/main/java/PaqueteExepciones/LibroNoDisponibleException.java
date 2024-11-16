
package PaqueteExepciones;
/**
 * La clase LibroNoDisponibleException es una excepción personalizada que se lanza
 * cuando un libro no está disponible para préstamo. Extiende de la clase Exception
 */
public class LibroNoDisponibleException extends Exception {
    public LibroNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}
