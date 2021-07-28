package DISEÑOS;

import MODELO.Clientes;
import MODELO.EntidadCliente;
import MODELO.EntidadProductos;
import MODELO.EntidadVenta;
import MODELO.Productos;
import MODELO.EntidadDetalleVentas;
import MODELO.Ventas;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VENTAS extends javax.swing.JInternalFrame {

   Clientes cli=new Clientes();
   Ventas v=new Ventas();
   Productos p=new Productos();
   EntidadProductos ep=new EntidadProductos();
   EntidadVenta ev=new EntidadVenta();
   EntidadDetalleVentas edv=new EntidadDetalleVentas();
   EntidadCliente cliente=new EntidadCliente();
   
   DefaultTableModel modelo=new DefaultTableModel();
   int ID_PRODUCTO;
   int CANTIDAD;
   double PRECIO;
   double TOTALAPAGAR;
   
   public VENTAS() {
   initComponents();
   Calendar calendar=new GregorianCalendar();
   txtFECHA.setText(""+calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnNUMEROVENTA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCODIGOCLIENTE = new javax.swing.JTextField();
        txtNOMBRECLIENTE = new javax.swing.JTextField();
        btnBUSCARCLIENTE = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCODIGOPRODUCTO = new javax.swing.JTextField();
        btnBUSCARCODIGOPRODUCTO = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNOMBREPRODUCTO = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPRECIO = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAGREGARPRECIO = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtEXISTENCIAS = new javax.swing.JTextField();
        spCANTIDAD = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txtUSUARIO = new javax.swing.JTextField();
        txtFECHA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        TOTAL = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTOTALAPAGAR = new javax.swing.JTextField();
        btnGENERARVENTA = new javax.swing.JButton();
        btnCANCELARVENTA = new javax.swing.JButton();

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MODULO VENTAS");
        setAutoscrolls(true);
        setDoubleBuffered(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("VENTA DE PRODUCTOS DE PAPELERIA Y OFICINA");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("NUMERO DE VENTA");

        txtnNUMEROVENTA.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("TEL:5585949710");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("EMAIL:PAPEROFFVENTAS@GMAIL.COM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnNUMEROVENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jLabel4)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnNUMEROVENTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(51, 51, 51))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(2, 140));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("CODIGO CLIENTE:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("NOMBRE CLIENTE:");

        txtCODIGOCLIENTE.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        txtNOMBRECLIENTE.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        btnBUSCARCLIENTE.setText("BUSCAR");
        btnBUSCARCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARCLIENTEActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("CODIGO PRODUC:");

        txtCODIGOPRODUCTO.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        btnBUSCARCODIGOPRODUCTO.setText("BUSCAR");
        btnBUSCARCODIGOPRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARCODIGOPRODUCTOActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 0));
        jLabel9.setText("NOMBRE PRODUC:");

        txtNOMBREPRODUCTO.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("PRECIO:");

        txtPRECIO.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setText("CANTIDAD:");

        btnAGREGARPRECIO.setText("AGREGAR");
        btnAGREGARPRECIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARPRECIOActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 0));
        jLabel12.setText("EXISTENCIAS:");

        txtEXISTENCIAS.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        spCANTIDAD.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 0));
        jLabel13.setText("USUARIO:");

        txtUSUARIO.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        txtFECHA.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCODIGOCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBUSCARCLIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCODIGOPRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBUSCARCODIGOPRODUCTO, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spCANTIDAD, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPRECIO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAGREGARPRECIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFECHA))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNOMBRECLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEXISTENCIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNOMBREPRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtCODIGOCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNOMBRECLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBUSCARCLIENTE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCODIGOPRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBUSCARCODIGOPRODUCTO)
                    .addComponent(jLabel9)
                    .addComponent(txtNOMBREPRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAGREGARPRECIO)
                    .addComponent(jLabel12)
                    .addComponent(txtEXISTENCIAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(spCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(2, 140));

        tabladetalle.setBackground(new java.awt.Color(153, 153, 0));
        tabladetalle.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        tabladetalle.setForeground(new java.awt.Color(0, 0, 102));
        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO VENTA", "CODIGO PRODUCTO", "NOMBRE PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tabladetalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TOTAL.setBackground(new java.awt.Color(0, 51, 102));
        TOTAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TOTAL.setForeground(new java.awt.Color(0, 51, 102));
        TOTAL.setPreferredSize(new java.awt.Dimension(2, 140));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 0));
        jLabel14.setText("TOTAL A PAGAR:");

        txtTOTALAPAGAR.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N

        btnGENERARVENTA.setText("GENERAR VENTA");
        btnGENERARVENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENERARVENTAActionPerformed(evt);
            }
        });

        btnCANCELARVENTA.setText("CANCELAR VENTA");

        javax.swing.GroupLayout TOTALLayout = new javax.swing.GroupLayout(TOTAL);
        TOTAL.setLayout(TOTALLayout);
        TOTALLayout.setHorizontalGroup(
            TOTALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOTALLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCANCELARVENTA)
                .addGap(18, 18, 18)
                .addComponent(btnGENERARVENTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTOTALAPAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        TOTALLayout.setVerticalGroup(
            TOTALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TOTALLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(TOTALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTOTALAPAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGENERARVENTA)
                    .addComponent(btnCANCELARVENTA))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addComponent(TOTAL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBUSCARCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARCLIENTEActionPerformed
       buscarCliente();
    }//GEN-LAST:event_btnBUSCARCLIENTEActionPerformed

    private void btnAGREGARPRECIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARPRECIOActionPerformed
       agregarProducto();
    }//GEN-LAST:event_btnAGREGARPRECIOActionPerformed

    private void btnBUSCARCODIGOPRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARCODIGOPRODUCTOActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBUSCARCODIGOPRODUCTOActionPerformed

    private void btnGENERARVENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENERARVENTAActionPerformed
        GuardarVenta();
        GuardarDetalleVentas();
    }//GEN-LAST:event_btnGENERARVENTAActionPerformed
      
   void GuardarVenta(){
      int ID_USUARIO=10;
      int ID_CLIENTE=cliente.getID_CLIENTE();
      String NUMERO_VENTA=txtnNUMEROVENTA.getText();
      double MONTO=TOTALAPAGAR;
      String FECHA=txtFECHA.getText();
      
      ev.setID_CLIENTE(ID_CLIENTE);
      ev.setID_USUARIO(ID_USUARIO);
      ev.setNUMERO_VENTA(NUMERO_VENTA);
      ev.setMONTO(MONTO);
      ev.setFECHA(FECHA);
      v.GuardarVentas(ev);
   } 
   
   void GuardarDetalleVentas(){
       String ID_VENTA=v.ID_VENTA();
       int idve=Integer.parseInt(ID_VENTA);
       for(int i=0;i<tabladetalle.getRowCount();i++){
         int ID_PRODUCTO=Integer.parseInt(tabladetalle.getValueAt(i,1).toString());
         int CANTIDAD=Integer.parseInt(tabladetalle.getValueAt(i,3).toString());
         double PRECIO=Double.parseDouble(tabladetalle.getValueAt(i,4).toString());
         edv.setID_VENTA(idve);
         edv.setID_PRODUCTO(ID_PRODUCTO);
         edv.setCANTIDAD(CANTIDAD);
         edv.setPRECIO_VENTA(PRECIO);
         v.GuardarDetalleVentas(edv);       }
       
   }
    
    void agregarProducto(){
        double TOTAL;   
        int item=0;
        modelo=(DefaultTableModel)tabladetalle.getModel();
        item=item+1;
        ID_PRODUCTO=ep.getID_PRODUCTO();
        String NOMBRE_PRODUCTO=txtNOMBREPRODUCTO.getText();
        PRECIO=Double.parseDouble(txtPRECIO.getText());
        CANTIDAD=Integer.parseInt(spCANTIDAD.getValue().toString());
        int EXISTENCIAS_PRODUCTO=Integer.parseInt(txtEXISTENCIAS.getText());
        TOTAL=CANTIDAD*PRECIO;
        ArrayList lista=new ArrayList();
        if(EXISTENCIAS_PRODUCTO>0){
            lista.add(item);
            lista.add(ID_PRODUCTO);
            lista.add(NOMBRE_PRODUCTO);
            lista.add(CANTIDAD);
            lista.add(PRECIO);
            lista.add(TOTAL);
            Object[]ob=new Object[6];
            ob[0]=lista.get(0);
            ob[1]=lista.get(1);
            ob[2]=lista.get(2);
            ob[3]=lista.get(3);
            ob[4]=lista.get(4);
            ob[5]=lista.get(5);
            modelo.addRow(ob);
            tabladetalle.setModel(modelo);
            calcularTotal();
        }else{
           JOptionPane.showMessageDialog(this, "Producto no disponible"); 
        }
    }
       void calcularTotal(){
           TOTALAPAGAR=0;
           for(int i=0;i<tabladetalle.getRowCount();i++){
            CANTIDAD=Integer.parseInt(tabladetalle.getValueAt(i,3).toString());
            PRECIO=Double.parseDouble(tabladetalle.getValueAt(i,4).toString());
            TOTALAPAGAR=TOTALAPAGAR+(CANTIDAD*PRECIO);
           }
           txtTOTALAPAGAR.setText(""+TOTALAPAGAR);
       }
       void buscarProducto(){
           int ID_PRODUCTO=Integer.parseInt(txtCODIGOPRODUCTO.getText());
           if(txtCODIGOPRODUCTO.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Debe Ingresar el codigo de producto ");
           }else{
              ep=p.listarID(ID_PRODUCTO);
              if(ep.getID_PRODUCTO()!=0){
                txtNOMBREPRODUCTO.setText(ep.getNOMBRE_PRODUCTO());
                txtPRECIO.setText(""+ep.getPRECIO_PRODUCTO());
                txtEXISTENCIAS.setText(""+ep.getEXISTENCIAS_PRODUCTO());
              }
           }
       }     
    void buscarCliente(){
    int r=0;
    String cod=txtCODIGOCLIENTE.getText();
    if(txtCODIGOCLIENTE.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Ingrese El Codigo Del Cliente");
    }else{
        cliente=cli.listaID(cod);
        if(cliente.getCODIGO_CLIENTE()!=null){
            txtNOMBRECLIENTE.setText(cliente.getNOMBRE());
            txtCODIGOPRODUCTO.requestFocus();
        }else{
            JOptionPane.showMessageDialog(this, "El Cliente no se encuentra en nuestra base de datos, Desea registrar un nuevo cliente");
            if(r==0){
                CLIENTES c=new CLIENTES(); 
                Principal.VentanaPrincipal.add(c);
                c.setVisible(true);
            }
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TOTAL;
    private javax.swing.JButton btnAGREGARPRECIO;
    private javax.swing.JButton btnBUSCARCLIENTE;
    private javax.swing.JButton btnBUSCARCODIGOPRODUCTO;
    private javax.swing.JButton btnCANCELARVENTA;
    private javax.swing.JButton btnGENERARVENTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spCANTIDAD;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtCODIGOCLIENTE;
    private javax.swing.JTextField txtCODIGOPRODUCTO;
    private javax.swing.JTextField txtEXISTENCIAS;
    private javax.swing.JTextField txtFECHA;
    private javax.swing.JTextField txtNOMBRECLIENTE;
    private javax.swing.JTextField txtNOMBREPRODUCTO;
    private javax.swing.JTextField txtPRECIO;
    private javax.swing.JTextField txtTOTALAPAGAR;
    private javax.swing.JTextField txtUSUARIO;
    private javax.swing.JTextField txtnNUMEROVENTA;
    // End of variables declaration//GEN-END:variables
}
