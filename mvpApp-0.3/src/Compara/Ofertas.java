/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Compara;

/**
 *
 * @author daniel
 */
public class Ofertas extends javax.swing.JPanel {

    /**
     * Creates new form Ofertas
     */
    public Ofertas() {
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
        lCabecera = new javax.swing.JPanel();
        bHome = new javax.swing.JToggleButton();
        lOfertas = new javax.swing.JLabel();
        pOfertaSuper = new javax.swing.JPanel();
        lOfertaEn = new javax.swing.JLabel();
        lSupermercado = new javax.swing.JLabel();

        bHome.setText("<--");

        lOfertas.setText("Ofertas");

        javax.swing.GroupLayout lCabeceraLayout = new javax.swing.GroupLayout(lCabecera);
        lCabecera.setLayout(lCabeceraLayout);
        lCabeceraLayout.setHorizontalGroup(
            lCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bHome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lOfertas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lCabeceraLayout.setVerticalGroup(
            lCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bHome, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addComponent(lOfertas))
        );

        lOfertaEn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lOfertaEn.setText("Ofertas en");

        lSupermercado.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lSupermercado.setText("SUPERMERCADO");

        javax.swing.GroupLayout pOfertaSuperLayout = new javax.swing.GroupLayout(pOfertaSuper);
        pOfertaSuper.setLayout(pOfertaSuperLayout);
        pOfertaSuperLayout.setHorizontalGroup(
            pOfertaSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOfertaSuperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOfertaSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lOfertaEn)
                    .addComponent(lSupermercado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pOfertaSuperLayout.setVerticalGroup(
            pOfertaSuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOfertaSuperLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lOfertaEn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSupermercado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pOfertaSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pOfertaSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lCabecera;
    private javax.swing.JLabel lOfertaEn;
    private javax.swing.JLabel lOfertas;
    private javax.swing.JLabel lSupermercado;
    private javax.swing.JPanel pOfertaSuper;
    // End of variables declaration//GEN-END:variables
}