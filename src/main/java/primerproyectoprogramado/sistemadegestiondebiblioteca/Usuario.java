
package primerproyectoprogramado.sistemadegestiondebiblioteca;


public class Usuario extends Persona {
    private String tipoUsuario;
    
    public Usuario(String nombre, String idUsuario, String tipoUsuario){
        super(nombre, idUsuario);
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Tipo de Usuario: " + tipoUsuario;
    }
}
