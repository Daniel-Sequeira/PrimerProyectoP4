
package primerproyectoprogramado.sistemadegestiondebiblioteca;

import PaqueteExepciones.OperacionNoPermitidaException;
import java.util.ArrayList;
import java.util.List;

public final class Referencia extends Libro{
    
    public Referencia(String titulo, String autor,String isbn){
        super(titulo,autor,isbn);
        setEstado(EstadoLibro.RESERVADO); //Los libros de referencia no se prestan
    }
    
     @Override
    public void prestar() throws OperacionNoPermitidaException {
         throw new OperacionNoPermitidaException("Este libro es de referencia y no puede ser prestado.");
    }

    @Override
    public void devolver() throws OperacionNoPermitidaException {
         throw new OperacionNoPermitidaException("Este libro es de referencia y no estaba en préstamo.");
    }
    
     @Override
    public final void mostrarInformacion() { // Método sobrescrito que no puede ser sobrescrito nuevamente
        System.out.println("Referencia - Título: " + getTitulo() + ", Autor: " + getAutor() + ", ISBN: " + getIsbn());
    }

    public final void mostrarInformacionEspecial() { // Método final específico de Referencia
        System.out.println("Este es un libro de referencia especial.");
    }
    
    
}
