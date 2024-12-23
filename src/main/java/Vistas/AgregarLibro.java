package Vistas;

import primerproyectoprogramado.sistemadegestiondebiblioteca.Biblioteca;
import primerproyectoprogramado.sistemadegestiondebiblioteca.Libro;
import javax.swing.JDialog;
import primerproyectoprogramado.sistemadegestiondebiblioteca.Referencia;
 /**
     * Clase AgregarLibro que permite agregar libros a la biblioteca y actualiza la interfaz de BibliotecaGUI. selecionando el tipo de libro
     * ya sea un libro de acceso a todo publico o libro de referencia
     */
public class AgregarLibro extends JDialog {
private BibliotecaGUI bibliotecaGUI; // Referencia a la instancia de BibliotecaGUI
    // Constructor que recibe la instancia de BibliotecaGUI
    public AgregarLibro(BibliotecaGUI bibliotecaGUI) {
        this.bibliotecaGUI = bibliotecaGUI;
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloAgregarLibro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblIsbn = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbTipoLibro = new javax.swing.JComboBox<>();
        lblTipoLibro = new javax.swing.JLabel();

        lblTituloAgregarLibro.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        lblTituloAgregarLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAgregarLibro.setText("Agregar Libro");

        lblTitulo.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        lblTitulo.setText("Titulo");

        lblAutor.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        lblAutor.setText("Autor");

        lblIsbn.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        lblIsbn.setText("ISBN");

        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbTipoLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro ", "Libro Referencia", " " }));
        cbTipoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoLibroActionPerformed(evt);
            }
        });

        lblTipoLibro.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        lblTipoLibro.setText("Tipo Libro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbTipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnGuardar)
                                .addGap(22, 22, 22))
                            .addComponent(lblIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(lblTipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloLibro)
                    .addComponent(txtAutor)
                    .addComponent(txtIsbn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIsbn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblTipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbTipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar))
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(lblTituloAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTituloAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que se ejecuta cuando el botón "Guardar" es presionado.
     * Captura los datos ingresados, crea un objeto Libro o Referencia, y lo agrega a la biblioteca.
     * También actualiza la interfaz principal si es necesario.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      //capturar y asignar el contenido de cajas de texto a sus variables.
       String titulo = txtTituloLibro.getText();
       String autor = txtAutor.getText();
       String isbn = txtIsbn.getText();
       String tipo = (String) cbTipoLibro.getSelectedItem();
       
       // Llama al método adecuado basado en la selección donde tipo es la variable que almacena la seleccion del combo box tipo libro (Libro o Libro Referencia)
        if ("Libro".equals(tipo.trim())) {
            //Crear el objeto Libro y agregar a la biblioteca
            Libro libro = new Libro(titulo,autor,isbn);
            Biblioteca.agregarLibro(libro);
            if (bibliotecaGUI != null) {
            bibliotecaGUI.actualizarTablaLibros();// Actualizar la tabla de libros Ref en la interfaz principal
            }
        } else if ("Libro Referencia".equals(tipo.trim())) {
            // Crear el objeto Referencia y agregarlo a la biblioteca
            Referencia referencia = new Referencia(titulo, autor, isbn);
            Biblioteca.agregarLibroDeReferencia(referencia);
            if (bibliotecaGUI != null) {
            bibliotecaGUI.actualizarTablaLibrosReferencia();
            }
        }
       //Limpiar las cajas de texto
       txtTituloLibro.setText("");
       txtAutor.setText("");
       txtIsbn.setText("");
       
       //Cierre de la ventana al completar sin cerrar todo el programa
      dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

     /**
     * Método que se ejecuta cuando el botón "Cancelar" es presionado.
     * Cierra el diálogo sin realizar ninguna acción.
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void cbTipoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoLibroActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbTipoLibro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblTipoLibro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAgregarLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
