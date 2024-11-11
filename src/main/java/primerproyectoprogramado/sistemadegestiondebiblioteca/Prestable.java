
package primerproyectoprogramado.sistemadegestiondebiblioteca;

import PaqueteExepciones.LibroNoDisponibleException;
import PaqueteExepciones.OperacionNoPermitidaException;

public interface Prestable {
    void prestar()throws LibroNoDisponibleException, OperacionNoPermitidaException;
    void devolver()throws OperacionNoPermitidaException;
}
