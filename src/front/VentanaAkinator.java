package front;
import back.ArbolAVL;
import components.pnlPregunta;
import components.pnlPersonaje;
import components.pnlDiferencia;
import javax.swing.JOptionPane;

public class VentanaAkinator extends javax.swing.JFrame {
    ArbolAVL tree = new ArbolAVL();
    pnlPregunta pnlPreg= new pnlPregunta();
    pnlPersonaje pnlPers = new pnlPersonaje();
    pnlDiferencia pnlDif = new pnlDiferencia();
    
    String primerPersonaje, primerCaracteristica;
    int n = 1;
    
    public VentanaAkinator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.tree = tree;
        inicio();
    }
    
    public void inicio(){ //el usuario crea un primerPersonaje por defecto para que la memoria no esté vacia
        do{
            primerPersonaje = JOptionPane.showInputDialog("¿Quién es tu personaje?");
        } while (primerPersonaje == null || primerPersonaje.isEmpty());
        do{
            primerCaracteristica = JOptionPane.showInputDialog("¿Qué caracteristica tiene tu personaje?");
        } while (primerCaracteristica == null || primerCaracteristica.isEmpty());
        
        tree.insertar(n, primerPersonaje, primerCaracteristica);
        n++;
        //Se muestra el pnlPregunta con los datos ingresados
        pnlContenedor.add(pnlPreg);
        pnlPreg.setPregunta(primerCaracteristica);
    }
    
    public String setLabelPregunta(){
        String c = "¿tiene ";
        return c + tree.obtenerRaiz().toString() +"?";
    }
    
    public String setLabelPersonaje(){
        String p = "¿es ";
        return p + tree.buscar(1).toString() +"?";
    }
    
    /*public void suposicionPersonaje(){
        int res;
        res = JOptionPane.showConfirmDialog(this, "¿tu primerPersonaje es " + +"?", "Suposicion Personaje", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            ganoAkinator();
        } else if (res == JOptionPane.NO_OPTION){
            abrirCardPersonaje();
        }
    }*/
    
    public void ganoAkinator(){
        int res = JOptionPane.showConfirmDialog(this, "BINGO!\n¿Quiéres volver a jugar?", "Ganó Akinator", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            //se reinicia el progama
        } else if (res == JOptionPane.NO_OPTION){
            System.exit(0);
        }
    }
    
    public void abrirCardPregunta(){
        pnlContenedor.removeAll();
        //pnlContenedor.add(pnlContenedorPregunta);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }
    
    public void abrirCardPersonaje(){
        pnlContenedor.removeAll();
       //pnlContenedor.add(pnlContenedorPersonaje);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }
    
    public void abrirCardInput(){
        pnlContenedor.removeAll();
        //pnlContenedor.add(pnlContenedorDiferencia);
        pnlContenedor.repaint();
        pnlContenedor.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgorund = new javax.swing.JPanel();
        pnlContenedor = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlBackgorund.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenedor.setBackground(new java.awt.Color(51, 51, 51));
        pnlContenedor.setLayout(new java.awt.CardLayout());
        pnlBackgorund.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 390, 160));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        pnlBackgorund.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackgorund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackgorund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAkinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAkinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAkinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAkinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAkinator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnlBackgorund;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}
