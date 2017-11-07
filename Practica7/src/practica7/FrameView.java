/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Cristian
 */
public class FrameView extends javax.swing.JFrame {
    private VentanaInterna ventanainterna;
    private BufferedImage image;
    private String imageName;
    private int numVentanas;
    

    /**
     * Creates new form FrameView
     */
    public FrameView() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        abrirFichero = new javax.swing.JMenuItem();
        cerrarFichero = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenu();
        umbralizarItem = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        menu.setText("Fichero");

        abrirFichero.setText("Abrir ");
        abrirFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirFicheroActionPerformed(evt);
            }
        });
        menu.add(abrirFichero);

        cerrarFichero.setText("Cerrar");
        cerrarFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarFicheroActionPerformed(evt);
            }
        });
        menu.add(cerrarFichero);

        jMenuBar1.add(menu);

        editar.setText("Editar");

        umbralizarItem.setText("umbralizar");
        umbralizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umbralizarItemActionPerformed(evt);
            }
        });
        editar.add(umbralizarItem);

        jMenuBar1.add(editar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirFicheroActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".jpg", "jpg");
        file.addChoosableFileFilter(filtro);
        int open = file.showOpenDialog(null);
        
        if(open == JFileChooser.OPEN_DIALOG)loadImage(file.getSelectedFile());

    }//GEN-LAST:event_abrirFicheroActionPerformed

    private void cerrarFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarFicheroActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(rootPane,"¿Está seguro que desea"
                + " salir de la aplicación?","Salir",JOptionPane.YES_NO_OPTION);
        if(confirmacion == JOptionPane.YES_OPTION)System.exit(0);
    }//GEN-LAST:event_cerrarFicheroActionPerformed

    private void umbralizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umbralizarItemActionPerformed
        // TODO add your handling code here:
        if(image != null){
            String value = (String)JOptionPane.showInputDialog(rootPane,"Intoduzca un "
                    + "valor para el umbralizado","Umbralizar",
                    JOptionPane.YES_NO_CANCEL_OPTION,null,null,100);
            
            BufferedImage imangenUmbralizada = ventanainterna.umbralizar(image, Integer.parseInt(value));
            String umbralTitulo = imageName+"_umbral_"+value;
            crearVentana(imangenUmbralizada,umbralTitulo);
            //repaint();  
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe abrir una imagen "
                    + "primero", "Error al umbralizar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_umbralizarItemActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirFichero;
    private javax.swing.JMenuItem cerrarFichero;
    private javax.swing.JMenu editar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem umbralizarItem;
    // End of variables declaration//GEN-END:variables

    private void loadImage(File selectedFile) {
        try {
            image = ImageIO.read(selectedFile);
            imageName =selectedFile.getName();
            if(image !=null){
                if(escritorio.getAllFrames() != null) cerrarVentanas();
                crearVentana(image,imageName);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una imagen","Error al abrir el fichero",JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearVentana(BufferedImage imagenMuestra, String titulo) {
        ventanainterna = new VentanaInterna();
        escritorio.add(ventanainterna);
        numVentanas++;
        ventanainterna.setClosable(true);
        ventanainterna.setResizable(true);
        ventanainterna.setImagen(imagenMuestra);
        ventanainterna.setTitle(titulo);
        ventanainterna.setLocation(numVentanas*20, numVentanas*20);
        ventanainterna.show();
    }

    private void cerrarVentanas() {
        JInternalFrame[] ventanas = escritorio.getAllFrames();
        for (JInternalFrame ventana : ventanas) {
            ventana.dispose();
        }
        numVentanas=0;
    }
}
