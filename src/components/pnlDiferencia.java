package components;

import back.ArbolAVL;

public class pnlDiferencia extends javax.swing.JPanel {
    ArbolAVL tree;
    public pnlDiferencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedorDiferencia = new javax.swing.JPanel();
        lblDiferencia = new javax.swing.JLabel();
        txtDiferencia = new javax.swing.JTextField();
        btnGuardarDiferencia = new javax.swing.JButton();

        pnlContenedorDiferencia.setBackground(new java.awt.Color(51, 51, 51));

        lblDiferencia.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblDiferencia.setForeground(new java.awt.Color(255, 255, 255));
        lblDiferencia.setText("¿Entonces en qué se diferencia tu personaje?");

        txtDiferencia.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        txtDiferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGuardarDiferencia.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btnGuardarDiferencia.setText("Guardar");
        btnGuardarDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDiferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContenedorDiferenciaLayout = new javax.swing.GroupLayout(pnlContenedorDiferencia);
        pnlContenedorDiferencia.setLayout(pnlContenedorDiferenciaLayout);
        pnlContenedorDiferenciaLayout.setHorizontalGroup(
            pnlContenedorDiferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorDiferenciaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlContenedorDiferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiferencia)
                    .addComponent(txtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(pnlContenedorDiferenciaLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnGuardarDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlContenedorDiferenciaLayout.setVerticalGroup(
            pnlContenedorDiferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorDiferenciaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblDiferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenedorDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenedorDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDiferenciaActionPerformed
        /*caracteristica = txtDiferencia.getText();
        n++;
        tree.insertar(n, caracteristica);
        limpiarCajas();
        abrirCardPregunta();

        System.out.println(tree.buscar(1));
        System.out.println(tree.buscar(2));
        System.out.println(tree.buscar(3));*/
    }//GEN-LAST:event_btnGuardarDiferenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDiferencia;
    private javax.swing.JLabel lblDiferencia;
    private javax.swing.JPanel pnlContenedorDiferencia;
    private javax.swing.JTextField txtDiferencia;
    // End of variables declaration//GEN-END:variables
}
