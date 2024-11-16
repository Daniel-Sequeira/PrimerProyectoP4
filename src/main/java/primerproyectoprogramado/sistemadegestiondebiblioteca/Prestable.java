
package primerproyectoprogramado.sistemadegestiondebiblioteca;

import PaqueteExepciones.LibroNoDisponibleException;
import PaqueteExepciones.OperacionNoPermitidaException;
// Interfaz Prestable que define las operaciones de préstamo y devolución
/*
 void prestar()    Método para prestar un elemento
    Puede lanzar la excepción LibroNoDisponibleException si el libro no está disponible
    Puede lanzar la excepción OperacionNoPermitidaException si la operación no es válida
 void devolver()  Método para devolver un elemento
    Puede lanzar la excepción OperacionNoPermitidaException si la operación no es válida
*/
public interface Prestable {
    void prestar()throws LibroNoDisponibleException, OperacionNoPermitidaException;
    void devolver()throws OperacionNoPermitidaException;
}
