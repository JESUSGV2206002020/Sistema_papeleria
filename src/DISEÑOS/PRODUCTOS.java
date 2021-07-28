package DISEÑOS;
import MODELO.Productos;
import MODELO.EntidadProductos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class PRODUCTOS extends javax.swing.JInternalFrame {

Productos p=new Productos();
EntidadProductos ep=new EntidadProductos();

DefaultTableModel modelo=new DefaultTableModel();
 int ID_PRODUCTO;
    public PRODUCTOS() {
        initComponents();
        listar();
    }
    void listar(){
        List<EntidadProductos> lista=p.listar();
        modelo=(DefaultTableModel)jTable2.getModel();
        Object[]ob=new Object[4];
        for(int i=0;i<lista.size();i++){
        ob[0]=lista.get(i).getID_PRODUCTO();
        ob[1]=lista.get(i).getNOMBRE_PRODUCTO();
        ob[2]=lista.get(i).getPRECIO_PRODUCTO();
        ob[3]=lista.get(i).getEXISTENCIAS_PRODUCTO();
        modelo.addRow(ob);
        }
       jTable2.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        txtExistencias = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODULO PRODUCTOS");
        setAutoscrolls(true);
        setDoubleBuffered(true);
        setInheritsPopupMenu(true);
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(153, 153, 0));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("NOMBRE PRODUCTO:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("PRECIO PRODUCTO:");

        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ACTUALIZAR.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/AGREGAR.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ELIMINAR.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("EXISTENCIAS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProducto)
                            .addComponent(txtPrecioProducto)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(52, 52, 52))
        );

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "NOMBRE PRODUCTO", "PRECIO PRODUCTO", "EXISTENCIAS"
            }
        ));
        jTable2.setDoubleBuffered(true);
        jTable2.setDragEnabled(true);
        jTable2.setFillsViewportHeight(true);
        jTable2.setFocusCycleRoot(true);
        jTable2.setFocusTraversalPolicyProvider(true);
        jTable2.setSurrendersFocusOnKeystroke(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        jTable2.getAccessibleContext().setAccessibleParent(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("INVENTARIO");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
  int fila=jTable2.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un registro");
        }else{
            ID_PRODUCTO=Integer.parseInt(jTable2.getValueAt(fila,0).toString());
            String NOMBRE_PRODUCTO=jTable2.getValueAt(fila,1).toString();
            double PRECIO_PRODUCTO=Double.parseDouble(jTable2.getValueAt(fila,2).toString());
            int EXISTENCIAS=Integer.parseInt(jTable2.getValueAt(fila,3).toString());
            txtNombreProducto.setText(NOMBRE_PRODUCTO);
            txtPrecioProducto.setText(Double.toString(PRECIO_PRODUCTO));
            txtExistencias.setText(Integer.toString(EXISTENCIAS)); 
        }
    }//GEN-LAST:event_jTable2MouseClicked
    void agregar(){
    String NOMBRE_PRODUCTO=txtNombreProducto.getText(); 
    double PRECIO_PRODUCTO=Double.parseDouble(txtPrecioProducto.getText());
    int EXISTENCIAS=Integer.parseInt(txtExistencias.getText()) ;
    Object[] ob=new Object[3];
    ob[0]=NOMBRE_PRODUCTO;
    ob[1]=PRECIO_PRODUCTO;
    ob[2]=EXISTENCIAS;
    p.add(ob);
    }

    void actualizar(){  
        int fila=jTable2.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un registro");
        }
        else{
            String NOMBRE_PRODUCTO=txtNombreProducto.getText(); 
            double PRECIO_PRODUCTO=Double.parseDouble(txtPrecioProducto.getText());
            int EXISTENCIAS=Integer.parseInt(txtExistencias.getText()) ;
            Object[] ob=new Object[4];
            ob[0]=NOMBRE_PRODUCTO;
            ob[1]=PRECIO_PRODUCTO;
            ob[2]=EXISTENCIAS;
            ob[3]=ID_PRODUCTO;
            p.actualizar(ob);
        }
    
    }

    void eliminar(){
    int fila=jTable2.getSelectedRow();
    if(fila==-1){
        JOptionPane.showMessageDialog(this,"Debe seleccionar un registro");
    }else{
        p.eliminar(ID_PRODUCTO);
    }
    }
    
    void nuevo(){
     txtNombreProducto.setText("");
     txtPrecioProducto.setText("");
     txtExistencias.setText("");
     txtNombreProducto.requestFocus();
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
