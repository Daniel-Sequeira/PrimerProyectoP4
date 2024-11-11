
package primerproyectoprogramado.sistemadegestiondebiblioteca;

public abstract class ElementoBiblioteca {
    protected String titulo;

     public ElementoBiblioteca(String titulo) {
        this.titulo = titulo;
    }
     
      public String getTitulo() {
        return titulo;
    }

    public abstract void mostrarInformacion(); // Método abstracto

    public void descripcion() { // Método concreto
        System.out.println("Este es un elemento de la biblioteca: " + titulo);
    }
}


