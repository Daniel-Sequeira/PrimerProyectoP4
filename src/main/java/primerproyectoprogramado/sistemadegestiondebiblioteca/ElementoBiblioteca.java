
package primerproyectoprogramado.sistemadegestiondebiblioteca;
// Clase abstracta que representa un elemento genérico de la biblioteca
public abstract class ElementoBiblioteca {
     // Atributo protegido que almacena el título del elemento
    protected String titulo;
// Constructor que inicializa el título del elemento
     public ElementoBiblioteca(String titulo) {
        this.titulo = titulo;
    }
      // Método que devuelve el título del elemento
      public String getTitulo() {
        return titulo;
    }
    // Método abstracto que debe ser implementado por las subclases
    // Las subclases deben definir cómo se muestra la información de cada elemento específico
    public abstract void mostrarInformacion(); // Método abstracto
    // Método concreto que muestra una descripción general del elemento
    public void descripcion() { // Método concreto
        System.out.println("Este es un elemento de la biblioteca: " + titulo);
    }
}


