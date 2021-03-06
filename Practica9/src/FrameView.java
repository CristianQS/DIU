
import javax.swing.ListSelectionModel;
import java.sql.*;
import java.util.List;
import java.util.logging.*;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class FrameView extends javax.swing.JFrame {

    private DefaultListModel model = new DefaultListModel();
    private DefaultListModel modelCampos = new DefaultListModel();
    private DatabaseMetaData md;
    private Dialogo dialogoUsuario;
    private Connection con;
    public FrameView() {
        initComponents();
        multipleButton.setSelected(true);
        setEnables(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Botones = new javax.swing.JPanel();
        intervalButton = new javax.swing.JToggleButton();
        simpleButton = new javax.swing.JToggleButton();
        multipleButton = new javax.swing.JToggleButton();
        tablasPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>(model);
        camposPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>(modelCampos);
        accionesTablas = new javax.swing.JPanel();
        procesarButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        conectarseItem = new javax.swing.JMenuItem();
        cerrarConexiónButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botones.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion"));

        buttonGroup1.add(intervalButton);
        intervalButton.setText("Intervalo");
        intervalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(simpleButton);
        simpleButton.setText("Simple");
        simpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(multipleButton);
        multipleButton.setText("Múltiples Intervalos");
        multipleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(simpleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(intervalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(multipleButton)
                .addGap(42, 42, 42))
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(simpleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(intervalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(multipleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas"));

        jScrollPane1.setViewportView(lista1);

        javax.swing.GroupLayout tablasPanelLayout = new javax.swing.GroupLayout(tablasPanel);
        tablasPanel.setLayout(tablasPanelLayout);
        tablasPanelLayout.setHorizontalGroup(
            tablasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablasPanelLayout.setVerticalGroup(
            tablasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        camposPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos "));

        jScrollPane2.setViewportView(lista2);

        javax.swing.GroupLayout camposPanelLayout = new javax.swing.GroupLayout(camposPanel);
        camposPanel.setLayout(camposPanelLayout);
        camposPanelLayout.setHorizontalGroup(
            camposPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, camposPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        camposPanelLayout.setVerticalGroup(
            camposPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        accionesTablas.setBorder(javax.swing.BorderFactory.createTitledBorder("Funciones"));

        procesarButton.setText("Procesar");
        procesarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarButtonActionPerformed(evt);
            }
        });

        limpiarButton.setText("Limpiar");
        limpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accionesTablasLayout = new javax.swing.GroupLayout(accionesTablas);
        accionesTablas.setLayout(accionesTablasLayout);
        accionesTablasLayout.setHorizontalGroup(
            accionesTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accionesTablasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(accionesTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(procesarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        accionesTablasLayout.setVerticalGroup(
            accionesTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accionesTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(procesarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpiarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Usuario");

        conectarseItem.setText("Conectarse");
        conectarseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarseItemActionPerformed(evt);
            }
        });
        jMenu1.add(conectarseItem);

        cerrarConexiónButton.setText("Cerrar conexion");
        cerrarConexiónButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarConexiónButtonActionPerformed(evt);
            }
        });
        jMenu1.add(cerrarConexiónButton);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(camposPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accionesTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(camposPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accionesTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleButtonActionPerformed
        // TODO add your handling code here:
        lista1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        System.out.println("Simple");
    }//GEN-LAST:event_simpleButtonActionPerformed

    private void intervalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalButtonActionPerformed
        // TODO add your handling code here:
        lista1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                System.out.println("interval");

    }//GEN-LAST:event_intervalButtonActionPerformed

    private void multipleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleButtonActionPerformed
        // TODO add your handling code here:
        lista1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                System.out.println("multiple");

    }//GEN-LAST:event_multipleButtonActionPerformed

    private void procesarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarButtonActionPerformed
        // TODO add your handling code here:
        modelCampos.removeAllElements();
        procesar();
    }//GEN-LAST:event_procesarButtonActionPerformed

    private void limpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButtonActionPerformed
        // TODO add your handling code here:
        lista1.clearSelection();
    }//GEN-LAST:event_limpiarButtonActionPerformed

    private void conectarseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarseItemActionPerformed
        // TODO add your handling code here:
        dialogoUsuario = new Dialogo(this, true);
        dialogoUsuario.setVisible(true);
    }//GEN-LAST:event_conectarseItemActionPerformed

    private void cerrarConexiónButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarConexiónButtonActionPerformed
        try {
            // TODO add your handling code here:
            con.close();
            setEnables(false);
            limpiarListas(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cerrarConexiónButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel accionesTablas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel camposPanel;
    private javax.swing.JMenuItem cerrarConexiónButton;
    private javax.swing.JMenuItem conectarseItem;
    private javax.swing.JToggleButton intervalButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    private javax.swing.JToggleButton multipleButton;
    private javax.swing.JButton procesarButton;
    private javax.swing.JToggleButton simpleButton;
    private javax.swing.JPanel tablasPanel;
    // End of variables declaration//GEN-END:variables

    protected void conectarUsuario(String usuario, String contraseña) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrameView.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db?zeroDateTimeBehavior=convertToNull","root","");
            con = DriverManager.getConnection("jdbc:mysql://mozart.dis.ulpgc.es/PracticaDIU?useSSL=true","estudiante-DIU","diU-17-18");
            md = con.getMetaData();
            String[] types ={"TABLE"};
            ResultSet rs = md.getTables(null,null,"%",types);
            while(rs.next()){
                String nombreTabla = rs.getString("TABLE_NAME");
                //System.out.println("Tabla:"+nombreTabla);
                model.addElement(nombreTabla);
            }
            dialogoUsuario.cerrarVentana();
            setEnables(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void muestraCampos(String tabla){
        try {
            ResultSet rs2 = md.getColumns(null,null,tabla,null);
            while(rs2.next()){
                String nombreCampo = rs2.getString("COLUMN_NAME");
                modelCampos.addElement(tabla+"."+nombreCampo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrameView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void procesar() {
        List<String> tablas = lista1.getSelectedValuesList();
        for (String tabla : tablas) {
            muestraCampos(tabla);
        }
    }
    
    private void setEnables(boolean control){
        conectarseItem.setEnabled(!control);
        procesarButton.setEnabled(control);
        limpiarButton.setEnabled(control);
        simpleButton.setEnabled(control);
        multipleButton.setEnabled(control);
        intervalButton.setEnabled(control);
        cerrarConexiónButton.setEnabled(control);
    }

    private void limpiarListas(boolean b) {
        model.removeAllElements();
        modelCampos.removeAllElements();
    }
}
