package components;

import back.ArbolAVL;

public class pnlPersonaje extends javax.swing.JPanel {
    ArbolAVL tree;
    
    public pnlPersonaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedorPersonaje = new javax.swing.JPanel();
        lblPersonaje = new javax.swing.JLabel();
        txtPersonaje = new javax.swing.JTextField();
        btnGuardarPersonaje = new javax.swing.JButton();
        lblRendicion = new javax.swing.JLabel();

        pnlContenedorPersonaje.setBackground(new java.awt.Color(51, 51, 51));

        lblPersonaje.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblPersonaje.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonaje.setText("¿Quién era tu personaje?");

        txtPersonaje.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        txtPersonaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGuardarPersonaje.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btnGuardarPersonaje.setText("Guardar Personaje");
        btnGuardarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPersonajeActionPerformed(evt);
            }
        });

        lblRendicion.setFont(new java.awt.Font("Bell MT", 1, 20)); // NOI18N
        lblRendicion.setForeground(new java.awt.Color(255, 255, 255));
        lblRendicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRendicion.setText("ME RINDO...");

        javax.swing.GroupLayout pnlContenedorPersonajeLayout = new javax.swing.GroupLayout(pnlContenedorPersonaje);
        pnlContenedorPersonaje.setLayout(pnlContenedorPersonajeLayout);
        pnlContenedorPersonajeLayout.setHorizontalGroup(
            pnlContenedorPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorPersonajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarPersonaje)
                .addGap(137, 137, 137))
            .addGroup(pnlContenedorPersonajeLayout.createSequentialGroup()
                .addGroup(pnlContenedorPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorPersonajeLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(pnlContenedorPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPersonaje)))
                    .addGroup(pnlContenedorPersonajeLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblRendicion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlContenedorPersonajeLayout.setVerticalGroup(
            pnlContenedorPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorPersonajeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lblRendicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPersonaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarPersonaje)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenedorPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenedorPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPersonajeActionPerformed
        /*personaje = txtPersonaje.getText();
        n++;
        tree.insertar(n, personaje);
        abrirCardInput();*/
    }//GEN-LAST:event_btnGuardarPersonajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarPersonaje;
    private javax.swing.JLabel lblPersonaje;
    private javax.swing.JLabel lblRendicion;
    private javax.swing.JPanel pnlContenedorPersonaje;
    private javax.swing.JTextField txtPersonaje;
    // End of variables declaration//GEN-END:variables
}
