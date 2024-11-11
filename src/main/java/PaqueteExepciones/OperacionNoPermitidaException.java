
package PaqueteExepciones;
// OperacionNoPermitidaException personalizada
public class OperacionNoPermitidaException extends Exception {
    public OperacionNoPermitidaException(String mensaje) {
        super(mensaje);
    }
}