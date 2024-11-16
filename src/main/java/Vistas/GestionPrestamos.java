package Vistas;

import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import primerproyectoprogramado.sistemadegestiondebiblioteca.Biblioteca;
import primerproyectoprogramado.sistemadegestiondebiblioteca.Libro;
import primerproyectoprogramado.sistemadegestiondebiblioteca.Referencia;
import primerproyectoprogramado.sistemadegestiondebiblioteca.Usuario;

/**
 * Clase GestionPrestamos que proporciona una ventana emergente (JDialog)
 * para gestionar los préstamos y devoluciones de libros en la biblioteca.
 * Permite seleccionar un usuario y un libro y realizar un préstamo o devolución.
 */

public class GestionPrestamos extends JDialog {
   
    //Constructor de la clase GestionPrestamos.
    public GestionPrestamos(JFrame parent) {
        super(parent, "Gestión de Préstamos", true);// Configura el diálogo como modal y define titulo
        setLocationRelativeTo(parent);
        initComponents();
        cargarDatos();// Carga los datos de usuarios y libros
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnRealizarDevolucion = new javax.swing.JButton();
        btnRealizarPrestamo = new javax.swing.JButton();
        lblSeleccionarUs = new javax.swing.JLabel();
        cbUsuarios = new javax.swing.JComboBox<>();
        lblSeleccionarLib = new javax.swing.JLabel();
        cbLibros = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRealizarDevolucion.setText("Realizar Devolución");
        btnRealizarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarDevolucionActionPerformed(evt);
            }
        });

        btnRealizarPrestamo.setText("Realizar Préstamo");
        btnRealizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPrestamoActionPerformed(evt);
            }
        });

        lblSeleccionarUs.setText("Selecionar Usuario:");

        lblSeleccionarLib.setText("Selecionar Libro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(btnRealizarPrestamo)
                .addGap(50, 50, 50)
                .addComponent(btnRealizarDevolucion)
                .addGap(43, 43, 43)
                .addComponent(btnCancelar)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbLibros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSeleccionarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeleccionarUs, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeleccionarUs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSeleccionarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRealizarDevolucion)
                    .addComponent(btnRealizarPrestamo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * Método que se ejecuta cuando se presiona el botón "Realizar Préstamo".
     * Obtiene el usuario y el libro seleccionados, y realiza el préstamo.*/
    private void btnRealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPrestamoActionPerformed
       Usuario usuario = (Usuario)cbUsuarios.getSelectedItem();
       Libro libro = (Libro)cbLibros.getSelectedItem();
        if (usuario != null && libro != null) {
            Biblioteca.realizarPrestamo(libro, usuario,this);
        }
        dispose(); 
    }//GEN-LAST:event_btnRealizarPrestamoActionPerformed
//Cierra la ventana sin realizar ninguna acción.
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
/**
     * Método que se ejecuta cuando se presiona el botón "Realizar Devolución".
     * Obtiene el libro seleccionado y realiza la devolución.*/
    private void btnRealizarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarDevolucionActionPerformed
       
       Libro libro = (Libro)cbLibros.getSelectedItem();
        
       if (libro != null ) {
            Biblioteca.devolverLibro(libro,this);// Realizar la devolución a través de la clase Biblioteca
        }
       dispose(); 
    }//GEN-LAST:event_btnRealizarDevolucionActionPerformed
         
    private void cargarDatos() {
    // Obtener el modelo actual del combo box para los usuarios
    // Un DefaultComboBoxModel se utiliza para manejar los elementos que se mostrarán en el combo box
     // Obtener el modelo actual del combo box
    DefaultComboBoxModel modelUsuarios = (DefaultComboBoxModel) cbUsuarios.getModel();
    DefaultComboBoxModel modelLibros = (DefaultComboBoxModel) cbLibros.getModel();
    // Limpiar el modelo existente (opcional)asegura que los combo boxes no tengan elementos duplicados
    modelUsuarios.removeAllElements();
     modelLibros.removeAllElements();
        // Cargar usuarios  y añadirlos al combo box
    // La clase Biblioteca tiene un método getUsuarios() que devuelve un conjunto (Set) de usuarios
        Set<Usuario> usuarios = Biblioteca.getUsuarios();
        // Recorremos cada libro en la lista y lo añadimos al modelo del combo box
    for (Usuario usuario : usuarios) {
        modelUsuarios.addElement(usuario); // Añadir el objeto Usuario al modelo
    }
       
    // Cargar libros disponibles en la lista ademas de libros de referencia
         List<Libro> libros = Biblioteca.obtenerLibros();
     for (Libro libro : libros) {
    modelLibros.addElement(libro); 
    }
         Set<Referencia> librosDeReferencia = Biblioteca.getLibrosDeReferencia();
         // Añadir cada libro al modelo de la tabla
        for (Referencia libro : librosDeReferencia) {
            modelLibros.addElement(libro);    
        }
    // Asignar los modelos a los combo boxes
    cbUsuarios.setModel(modelUsuarios);
    cbLibros.setModel(modelLibros);        
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRealizarDevolucion;
    private javax.swing.JButton btnRealizarPrestamo;
    private javax.swing.JComboBox<String> cbLibros;
    private javax.swing.JComboBox<String> cbUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSeleccionarLib;
    private javax.swing.JLabel lblSeleccionarUs;
    // End of variables declaration//GEN-END:variables
}
