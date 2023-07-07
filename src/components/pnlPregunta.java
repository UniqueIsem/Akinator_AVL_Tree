package components;

public class pnlPregunta extends javax.swing.JPanel {

    public pnlPregunta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedorPregunta = new javax.swing.JPanel();
        lblTuPersonaje = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        btnSi = new javax.swing.JButton();
        lblPregunta = new javax.swing.JLabel();

        pnlContenedorPregunta.setBackground(new java.awt.Color(51, 51, 51));

        lblTuPersonaje.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblTuPersonaje.setForeground(new java.awt.Color(255, 255, 255));
        lblTuPersonaje.setText("Tu personaje :");

        btnNo.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btnNo.setText("NO");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        btnSi.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btnSi.setText("SI");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });

        lblPregunta.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlContenedorPreguntaLayout = new javax.swing.GroupLayout(pnlContenedorPregunta);
        pnlContenedorPregunta.setLayout(pnlContenedorPreguntaLayout);
        pnlContenedorPreguntaLayout.setHorizontalGroup(
            pnlContenedorPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorPreguntaLayout.createSequentialGroup()
                .addGroup(pnlContenedorPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorPreguntaLayout.createSequentialGroup()
                        .addGroup(pnlContenedorPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenedorPreguntaLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContenedorPreguntaLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(lblTuPersonaje)))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(pnlContenedorPreguntaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlContenedorPreguntaLayout.setVerticalGroup(
            pnlContenedorPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorPreguntaLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblTuPersonaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnlContenedorPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenedorPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenedorPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        /*tree.detectarIzq();
        if (tree.detectarIzq() == null) {
            setLabelPersonaje();
        }*/
        //suposicionPersonaje();
        //n++;
        //tree.insertar(n, personaje, pregunta);
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        /*tree.detectarDer();
        if (tree.detectarDer() == null) {
            setLabelPersonaje();
        }*/
        //suposicionPersonaje();
    }//GEN-LAST:event_btnSiActionPerformed

    public void setPregunta(String p){
        String pregunta = "¿" +p + "?";
        lblPregunta.setText(p);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblTuPersonaje;
    private javax.swing.JPanel pnlContenedorPregunta;
    // End of variables declaration//GEN-END:variables
}
