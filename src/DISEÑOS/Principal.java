
package DISEÑOS;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JInternalFrame;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setBackground(new java.awt.Color(128, 128, 128));
        VentanaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1365, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 102)));
        jMenuBar1.setForeground(new java.awt.Color(0, 51, 102));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MENU_2.png"))); // NOI18N
        jMenu1.setText("MENU");
        jMenu1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem1.setText("AYUDA");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem2.setText("SALIR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/VENTAS.png"))); // NOI18N
        jMenu2.setText("VENTAS");
        jMenu2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem3.setText("GENERAR VENTA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/COMPRAS.png"))); // NOI18N
        jMenu3.setText("COMPRAS");
        jMenu3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem6.setText("REALIZAR COMPRA");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/REPORTES.png"))); // NOI18N
        jMenu4.setText("REPORTES");
        jMenu4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem4.setText("REPORTE DE VENTAS");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem5.setText("REPORTE DE COMPRAS");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MANTENIMIENTO.png"))); // NOI18N
        jMenu5.setText("MANTENIMIENTO");
        jMenu5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem7.setText("CLIENTES");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem8.setText("INVENTARIO");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem9.setText("USUARIOS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CLIENTES c=new CLIENTES();        
        CentrarVentana(c);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VENTAS v=new VENTAS();        
        CentrarVentana(v);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        PRODUCTOS p=new PRODUCTOS();        
        CentrarVentana(p);        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        USUARIOS u=new USUARIOS();        
        CentrarVentana(u);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        COMPRAS cs=new COMPRAS();        
        CentrarVentana(cs);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    void CentrarVentana(JInternalFrame frame){
    VentanaPrincipal.add(frame);
    Dimension dimension=VentanaPrincipal.getSize();
    Dimension Dframe=frame.getSize();
    frame.setLocation((dimension.width -Dframe.width)/2,(dimension.height-Dframe.height)/2);
    frame.show();
}
            
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel VentanaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
