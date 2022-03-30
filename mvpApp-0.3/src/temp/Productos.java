/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package temp;
import Automatizacion.conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Productos extends javax.swing.JPanel {

    /**
     * Creates new form Productos
     */
    public Productos() {
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

        jPanel1 = new javax.swing.JPanel();
        pCabecera = new javax.swing.JPanel();
        lProducto = new javax.swing.JLabel();
        bHome = new javax.swing.JToggleButton();
        bCarrito = new javax.swing.JToggleButton();
        lFotoProducto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lDescripcionProducto = new javax.swing.JPanel();
        lSupermercado = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        lLocalidad = new javax.swing.JLabel();
        lTipoProducto = new javax.swing.JLabel();
        lUnidades = new javax.swing.JLabel();
        bMasProducto = new javax.swing.JToggleButton();
        bMenosProducto = new javax.swing.JToggleButton();
        lCantidadProducto = new javax.swing.JLabel();
        pBajo = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();

        lProducto.setText("Producto");

        bHome.setText("<--");

        bCarrito.setText("Carrito");
        bCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCabeceraLayout = new javax.swing.GroupLayout(pCabecera);
        pCabecera.setLayout(pCabeceraLayout);
        pCabeceraLayout.setHorizontalGroup(
            pCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCabeceraLayout.createSequentialGroup()
                .addComponent(bHome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(bCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pCabeceraLayout.setVerticalGroup(
            pCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lProducto)
                .addComponent(bHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).jpg"))); // NOI18N

        javax.swing.GroupLayout lFotoProductoLayout = new javax.swing.GroupLayout(lFotoProducto);
        lFotoProducto.setLayout(lFotoProductoLayout);
        lFotoProductoLayout.setHorizontalGroup(
            lFotoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lFotoProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        lFotoProductoLayout.setVerticalGroup(
            lFotoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lFotoProductoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lSupermercado.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lSupermercado.setText("SUPERMERCADO");

        lPrecio.setText("12,65€");

        lLocalidad.setText("Localización: Xativa");

        lTipoProducto.setText("Producto: Leche");

        lUnidades.setText("Unidades: 62");

        javax.swing.GroupLayout lDescripcionProductoLayout = new javax.swing.GroupLayout(lDescripcionProducto);
        lDescripcionProducto.setLayout(lDescripcionProductoLayout);
        lDescripcionProductoLayout.setHorizontalGroup(
            lDescripcionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lDescripcionProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lDescripcionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lDescripcionProductoLayout.createSequentialGroup()
                        .addComponent(lSupermercado)
                        .addGap(56, 56, 56)
                        .addComponent(lPrecio))
                    .addComponent(lLocalidad)
                    .addComponent(lTipoProducto)
                    .addComponent(lUnidades))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        lDescripcionProductoLayout.setVerticalGroup(
            lDescripcionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lDescripcionProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lDescripcionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSupermercado)
                    .addComponent(lPrecio))
                .addGap(18, 18, 18)
                .addComponent(lLocalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTipoProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lUnidades)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bMasProducto.setText("+");

        bMenosProducto.setText("-");

        lCantidadProducto.setText("1");

        jToggleButton4.setText("Añadir Carrito");

        javax.swing.GroupLayout pBajoLayout = new javax.swing.GroupLayout(pBajo);
        pBajo.setLayout(pBajoLayout);
        pBajoLayout.setHorizontalGroup(
            pBajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBajoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        pBajoLayout.setVerticalGroup(
            pBajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBajoLayout.createSequentialGroup()
                .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lDescripcionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lFotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bMasProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMenosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCantidadProducto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pBajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lFotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMasProducto)
                    .addComponent(bMenosProducto)
                    .addComponent(lCantidadProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCarritoActionPerformed
        conexion conecta = new conexion();
        
        Connection con = conecta.getConexion();

        JOptionPane.showMessageDialog(null, "Conexión establecida con éxito");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bCarritoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bCarrito;
    private javax.swing.JToggleButton bHome;
    private javax.swing.JToggleButton bMasProducto;
    private javax.swing.JToggleButton bMenosProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel lCantidadProducto;
    private javax.swing.JPanel lDescripcionProducto;
    private javax.swing.JPanel lFotoProducto;
    private javax.swing.JLabel lLocalidad;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JLabel lProducto;
    private javax.swing.JLabel lSupermercado;
    private javax.swing.JLabel lTipoProducto;
    private javax.swing.JLabel lUnidades;
    private javax.swing.JPanel pBajo;
    private javax.swing.JPanel pCabecera;
    // End of variables declaration//GEN-END:variables
}