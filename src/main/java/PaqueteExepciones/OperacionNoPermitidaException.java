
package PaqueteExepciones;
/**
 * La clase OperacionNoPermitidaException es una excepción personalizada que se lanza
 * cuando un libro no está disponible para préstamo. Extiende de la clase Exception
 */
public class OperacionNoPermitidaException extends Exception {
    public OperacionNoPermitidaException(String mensaje) {
        super(mensaje);
    }
}