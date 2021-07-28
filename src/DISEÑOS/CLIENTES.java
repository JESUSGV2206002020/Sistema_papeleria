package DISEÑOS;
import MODELO.Clientes;
import MODELO.EntidadCliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CLIENTES extends javax.swing.JInternalFrame {

 Clientes cli=new Clientes();
 EntidadCliente ec=new EntidadCliente();
 DefaultTableModel modelo=new DefaultTableModel();
 int ID_CLIENTE;
    public CLIENTES() {
        initComponents();
        listar();
        
    }
    void listar(){
        List<EntidadCliente> lista=cli.listar();
        modelo=(DefaultTableModel)jTable1.getModel();
        Object[]ob=new Object[7];
        for(int i=0;i<lista.size();i++){
        ob[0]=lista.get(i).getID_CLIENTE();
        ob[1]=lista.get(i).getCODIGO_CLIENTE();
        ob[2]=lista.get(i).getNOMBRE();
        ob[3]=lista.get(i).getAPELLIDO_P();
        ob[4]=lista.get(i).getAPELLIDO_M();
        ob[5]=lista.get(i).getEMAIL();
        ob[6]=lista.get(i).getTELEFONO();
        modelo.addRow(ob);
        }
       jTable1.setModel(modelo);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido_P = new javax.swing.JTextField();
        txtApellido_M = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MODULO CLIENTES");
        setAutoscrolls(true);
        setDoubleBuffered(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("NOMBRE CLIENTE:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("APELLIDO PATERNO:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("APELLIDO MATERNO:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("EMAIL:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("TELEFONO:");

        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/AGREGAR.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ACTUALIZAR.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ELIMINAR.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/NUEVO.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 0));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("CODIGO CLIENTE:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(98, 98, 98)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido_P, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido_M, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(56, 56, 56)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        txtCodigo.getAccessibleContext().setAccessibleName("");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setBackground(new java.awt.Color(153, 153, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_CLIENTE", "CODIGO_CLIENTE", "NOMBRE", "APELLIDO_P", "APELLIDO_M", "EMAIL", "TELEFONO"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila=jTable1.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un registro");

        }else{
            ID_CLIENTE=Integer.parseInt(jTable1.getValueAt(fila,0).toString());
            String CODIGO_CLIENTE=jTable1.getValueAt(fila, 1).toString();
            String NOMBRE=jTable1.getValueAt(fila,2).toString();
            String APELLIDO_P=jTable1.getValueAt(fila,3).toString();
            String APELLIDO_M=jTable1.getValueAt(fila,4).toString();
            String EMAIL=jTable1.getValueAt(fila,5).toString();
            String TELEFONO=jTable1.getValueAt(fila,6).toString();
            txtCodigo.setText(CODIGO_CLIENTE);
            txtNombre.setText(NOMBRE);
            txtApellido_P.setText(APELLIDO_P);
            txtApellido_M.setText(APELLIDO_M);
            txtEmail.setText(EMAIL);
            txtTelefono.setText(TELEFONO);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed
    void agregar(){
    String CODIGO_CLIENTE=txtCodigo.getText();    
    String NOMBRE=txtNombre.getText();
    String APELLIDO_P=txtApellido_P.getText();
    String APELLIDO_M=txtApellido_M.getText();
    String EMAIL=txtEmail.getText();
    String TELEFONO=txtTelefono.getText();
    Object[] ob=new Object[6];
    ob[0]=CODIGO_CLIENTE;
    ob[1]=NOMBRE;
    ob[2]=APELLIDO_P;
    ob[3]=APELLIDO_M;
    ob[4]=EMAIL;
    ob[5]=TELEFONO;
    cli.add(ob);
    }

    void actualizar(){  
        int fila=jTable1.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un registro");
        }
        else{
            String CODIGO_CLIENTE=txtCodigo.getText(); 
            String NOMBRE=txtNombre.getText();
            String APELLIDO_P=txtApellido_P.getText();
            String APELLIDO_M=txtApellido_M.getText();
            String EMAIL=txtEmail.getText();
            String TELEFONO=txtTelefono.getText();
            Object[] ob=new Object[7];
            ob[0]=CODIGO_CLIENTE;
            ob[1]=NOMBRE;
            ob[2]=APELLIDO_P;
            ob[3]=APELLIDO_M;
            ob[4]=EMAIL;
            ob[5]=TELEFONO;
            ob[6]=ID_CLIENTE;
            cli.actualizar(ob);
        }
    
    }

    void eliminar(){
    int fila=jTable1.getSelectedRow();
    if(fila==-1){
        JOptionPane.showMessageDialog(this,"Debe seleccionar un registro");
    }else{
        cli.eliminar(ID_CLIENTE);
    }
    }
    
    void nuevo(){
     txtCodigo.setText("");
     txtNombre.setText("");
     txtApellido_P.setText("");
     txtApellido_M.setText("");
     txtEmail.setText("");
     txtTelefono.setText("");
     txtCodigo.requestFocus();
    }
    
    void limpiarTabla(){
        for(int i=0;i<modelo.getRowCount();i++){
         modelo.removeRow(i);
         i=i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido_M;
    private javax.swing.JTextField txtApellido_P;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
