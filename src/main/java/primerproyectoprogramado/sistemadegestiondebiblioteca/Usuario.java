
package primerproyectoprogramado.sistemadegestiondebiblioteca;
//Clase usuario que extiende de Persona hereda los atribustos de persona y contiene el atributo tipo usuario


public class Usuario extends Persona {
    private String tipoUsuario;
    //Constructor
    public Usuario(String nombre, String idUsuario, String tipoUsuario){
        super(nombre, idUsuario);
        this.tipoUsuario = tipoUsuario;
    }
//Metodos de acceso al atributo privado
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    //sobrescritura de toString para que muestre tipo usuario
    @Override
    public String toString(){
        return super.toString() + " Tipo de Usuario: " + tipoUsuario;
    }
    
     // Sobrescribir equals para comparar Usuarios por idUsuario
    //El método equals() se utiliza para comparar si dos objetos Usuario son iguales.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Comparación de referencia
        if (obj == null || getClass() != obj.getClass()) return false; // Comparación de clase
        Usuario usuario = (Usuario) obj;
        return this.getIdUsuario() != null && this.getIdUsuario().equals(usuario.getIdUsuario()); // Comparación por idUsuario
    }
    /*Muy importatnte
    if (this == obj) return true;
    Se compara this (el objeto actual) con obj (el objeto que se está comparando).
    Si ambos objetos tienen la misma referencia en la memoria (es decir, son el mismo objeto), se retorna true porque son iguales.
    if (obj == null || getClass() != obj.getClass()) return false;
    Se verifica si obj es null. Si lo es, se retorna false porque no se puede comparar null con un objeto Usuario.
    Se verifica si las clases de this y obj son diferentes usando getClass(). Si las clases no coinciden, se retorna false porque los objetos de diferentes clases no pueden ser iguales.
    Usuario usuario = (Usuario) obj;
    Se realiza un casting (conversión) de obj al tipo Usuario para poder acceder a sus métodos y atributos.
    return this.getIdUsuario() != null && this.getIdUsuario().equals(usuario.getIdUsuario());
    Se compara el idUsuario del objeto actual (this) con el idUsuario del objeto usuario, Primero, se verifica que this.getIdUsuario() no sea null
    Luego, se usa equals() para comparar ambos idUsuario de forma segura
    Si los idUsuario son iguales, se retorna true, indicando que los objetos Usuario son iguales; de lo contrario, se retorna false.
    */

    // Sobrescribir hashCode para usar idUsuario como base del hash
    //hashCode() se utiliza para generar un valor de hash único para cada objeto Usuario
    @Override
    public int hashCode() {
        //Si idUsuario no es null, se llama al método hashCode() de String para generar el valor de hash basado en el idUsuario
        return this.getIdUsuario() != null ? this.getIdUsuario().hashCode() : 0;
        //Si idUsuario es null, se retorna 0 como valor de hash predeterminado.
    }
    //Devuelve el valor del idUsuario
     public String getIdUsuario() {
        return super.getIdUsuario();
        //Se usa super para hacer referencia a la implementación del método en la clase padre
     }    
    

}
