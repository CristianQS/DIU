
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import java.sql.*;
import java.util.Arrays;
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
public class FrameVIew extends javax.swing.JFrame {

    /**
     * Creates new form FrameVIew
     */
    private DefaultListModel model = new DefaultListModel();
    private DefaultListModel modelCampos = new DefaultListModel();
    private DatabaseMetaData md;
    public FrameVIew() {
        initComponents();
        multipleButton.setSelected(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>(model);
        UsuarioPanel = new javax.swing.JPanel();
        usuarioLabel = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        contraseñaLabel = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        Botones = new javax.swing.JPanel();
        intervalButton = new javax.swing.JToggleButton();
        simpleButton = new javax.swing.JToggleButton();
        multipleButton = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>(modelCampos);
        procesarButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lista1);

        UsuarioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        usuarioLabel.setText("Usuario");

        contraseñaLabel.setText("Contraseña");

        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsuarioPanelLayout = new javax.swing.GroupLayout(UsuarioPanel);
        UsuarioPanel.setLayout(UsuarioPanelLayout);
        UsuarioPanelLayout.setHorizontalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaLabel))
                .addGap(26, 26, 26)
                .addGroup(UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(UsuarioPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(entrarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UsuarioPanelLayout.setVerticalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaLabel)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(entrarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Botones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BotonesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(simpleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(intervalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BotonesLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(multipleButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(simpleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(intervalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(multipleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(lista2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(procesarButton)
                        .addGap(18, 18, 18)
                        .addComponent(limpiarButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(procesarButton)
                            .addComponent(limpiarButton))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2)))
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

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        // TODO add your handling code here:
        conectarUsuario(usuario.getText(),Arrays.toString(contraseña.getPassword()));
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void procesarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarButtonActionPerformed
        // TODO add your handling code here:
        modelCampos.removeAllElements();
        procesar();
    }//GEN-LAST:event_procesarButtonActionPerformed

    private void limpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButtonActionPerformed
        // TODO add your handling code here:
        lista1.clearSelection();
    }//GEN-LAST:event_limpiarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameVIew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel UsuarioPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JButton entrarButton;
    private javax.swing.JToggleButton intervalButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    private javax.swing.JToggleButton multipleButton;
    private javax.swing.JButton procesarButton;
    private javax.swing.JToggleButton simpleButton;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables

    private void conectarUsuario(String usuario, String contraseña) {
        System.out.println(contraseña);
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrameVIew.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db?zeroDateTimeBehavior=convertToNull","root","");
            //Connection con = DriverManager.getConnection("jdbc:mysql://mozart.dis.ulpgc.es/PracticaDIU?useSSL=true","estudiante-DIU","diU-17-18");
            md = con.getMetaData();
            String[] types ={"TABLE"};
            ResultSet rs = md.getTables(null,null,"%",types);
            while(rs.next()){
                String nombreTabla = rs.getString("TABLE_NAME");
                //System.out.println("Tabla:"+nombreTabla);
                model.addElement(nombreTabla);
            }
            //con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FrameVIew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void muestraCampos(String tabla){
        try {
            ResultSet rs2 = md.getColumns(null,null,tabla,null);
            while(rs2.next()){
                String nombreCampo = rs2.getString("COLUMN_NAME");
                //System.out.println("Campo:"+nombreCampo);
                modelCampos.addElement(tabla+"."+nombreCampo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrameVIew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void procesar() {
        List<String> tablas = lista1.getSelectedValuesList();
        for (String tabla : tablas) {
            muestraCampos(tabla);
        }
    }

}