/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmacia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public class JfBajas extends javax.swing.JFrame {

    /**
     * Creates new form JfBajas
     */
    public JfBajas() {
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

        BajasMenu = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnEliminaEx = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombrebaja = new javax.swing.JTextField();
        btnAlta3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombrebm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadbm = new javax.swing.JTextField();
        BtnBajaMerma = new javax.swing.JButton();
        txbtotalM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        menu2 = new javax.swing.JButton();
        fechaD = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTmermas = new javax.swing.JTable();
        btnDesplegar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        txtTotal2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BajasMenu.setBackground(new java.awt.Color(240, 65, 116));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        btnEliminaEx.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnEliminaEx.setText("eliminar existencias");
        btnEliminaEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaExActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("nombre del producto:");

        btnAlta3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAlta3.setText("Menu");
        btnAlta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlta3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombrebaja, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnAlta3)
                        .addGap(74, 74, 74)
                        .addComponent(btnEliminaEx)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombrebaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminaEx)
                    .addComponent(btnAlta3))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        BajasMenu.addTab("baja de existencia de productos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("nombre del producto:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("cantidad a eliminar:");

        BtnBajaMerma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        BtnBajaMerma.setText("aceptar");
        BtnBajaMerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaMermaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("valor total:");

        menu2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        menu2.setText("Menu");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Fecha:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(menu2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                        .addComponent(BtnBajaMerma)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombrebm, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtCantidadbm)
                            .addComponent(txbtotalM))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombrebm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidadbm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbtotalM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBajaMerma)
                    .addComponent(menu2))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        BajasMenu.addTab("Registro de las mermas", jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        JTmermas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Total", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(JTmermas);

        btnDesplegar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnDesplegar.setText("Desplegar");
        btnDesplegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesplegarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("LISTADO DE MERMAS");
        jLabel8.setToolTipText("");

        txtTotal2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        txtTotal2.setText("Mermas totales: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(fecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDesplegar)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, Short.MAX_VALUE)
                .addComponent(btnDesplegar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        BajasMenu.addTab("Reporte de mermas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BajasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BajasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminaExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaExActionPerformed
        Coneccion2 query=new Coneccion2();
        String Insert = "update FARMAPRODUCTO set CANTIDAD=0 where NOMBRE='"+txtNombrebaja.getText()+"'";
        query.query(Insert);
    }//GEN-LAST:event_btnEliminaExActionPerformed

    private void BtnBajaMermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaMermaActionPerformed
        String formato = "dd/MM/yyyy";     
        Date date3= fechaD.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String dia3=sdf.format(date3);
        Coneccion2 query=new Coneccion2();
        String Insert = "insert into FARMAMERMAS values ('"+txtNombrebm.getText()+"', "+txtCantidadbm.getText()+", "+txbtotalM.getText()+",'"+dia3+"')";
        query.query(Insert);
    }//GEN-LAST:event_BtnBajaMermaActionPerformed

    private void btnAlta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlta3ActionPerformed
        Seleccion menu=new Seleccion();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAlta3ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        Seleccion menu=new Seleccion();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu2ActionPerformed

    private void btnDesplegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesplegarActionPerformed
        try {
            CargarMermas();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDesplegarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JfBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfBajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane BajasMenu;
    private javax.swing.JButton BtnBajaMerma;
    private javax.swing.JTable JTmermas;
    private javax.swing.JButton btnAlta3;
    private javax.swing.JButton btnDesplegar;
    private javax.swing.JButton btnEliminaEx;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private com.toedter.calendar.JDateChooser fechaD;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu2;
    private javax.swing.JTextField txbtotalM;
    private javax.swing.JTextField txtCantidadbm;
    private javax.swing.JTextField txtNombrebaja;
    private javax.swing.JTextField txtNombrebm;
    private javax.swing.JLabel txtTotal2;
    // End of variables declaration//GEN-END:variables

    private void CargarMermas() throws SQLException {
        txtTotal2.setText("Mermas totales: ");
        String formato = "dd/MM/yyyy HH:mm:ss";     
        Date date1= fecha1.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String dia1=sdf.format(date1);  
        Date date2=fecha2.getDate();
        String dia2=sdf.format(date2);
        DefaultTableModel modelo=(DefaultTableModel)JTmermas.getModel();
        modelo.setRowCount(0);
        Coneccion2 query=new Coneccion2();
        String Insert="select *FROM farmamermas WHERE fecha >= '"+dia1+"' AND  fecha <'"+dia2+"'";
        query.query(Insert);
        ResultSet rs;
        rs=query.conn().executeQuery(Insert);
        try{
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                modelo.addRow(v);
                JTmermas.setModel(modelo);
            }
        }catch(SQLException e){
            
        }
        int operando=JTmermas.getRowCount();
        double total=0.00;
        for(int i=0;i<operando;i++){
            total=total+Integer.parseInt(JTmermas.getValueAt(i,2).toString());}
        String totalS=""+total;
        txtTotal2.setText(txtTotal2.getText()+totalS);
    }
}