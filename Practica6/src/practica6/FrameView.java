package practica6;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

import javax.swing.filechooser.FileNameExtensionFilter;



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
    private JScrollBar bHorizontal,bVertical;
    private BufferedImage image;
    private EstadisticasImagen calcular,resultados;
    /**
     * Creates new form FrameView
     */
    public FrameView() {
        initComponents();
        calcular = new EstadisticasImagen();
        bHorizontal = jScrollPane.getHorizontalScrollBar();
        bVertical = jScrollPane.getVerticalScrollBar();
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        bHorizontal.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                calcularValores(ae);
            }
        });

        bVertical.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                calcularValores(ae);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        visualizadorFoto1 = new practica6.VisualizadorFoto();
        jPanel1 = new javax.swing.JPanel();
        labelRojo = new javax.swing.JLabel();
        maximoRojo = new javax.swing.JTextField();
        minimoRojo = new javax.swing.JTextField();
        promedioRojo = new javax.swing.JTextField();
        labelVerde = new javax.swing.JLabel();
        maximoVerde = new javax.swing.JTextField();
        minimoVerde = new javax.swing.JTextField();
        promedioVerde = new javax.swing.JTextField();
        labelAzul = new javax.swing.JLabel();
        maximoAzul = new javax.swing.JTextField();
        minimoAzul = new javax.swing.JTextField();
        promedioAzul = new javax.swing.JTextField();
        labelMaximo = new javax.swing.JLabel();
        labelMinimo = new javax.swing.JLabel();
        labelPromedio = new javax.swing.JLabel();
        copyRight = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout visualizadorFoto1Layout = new javax.swing.GroupLayout(visualizadorFoto1);
        visualizadorFoto1.setLayout(visualizadorFoto1Layout);
        visualizadorFoto1Layout.setHorizontalGroup(
            visualizadorFoto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        visualizadorFoto1Layout.setVerticalGroup(
            visualizadorFoto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jScrollPane.setViewportView(visualizadorFoto1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelRojo.setText("Rojo");

        maximoRojo.setEditable(false);

        minimoRojo.setEditable(false);

        promedioRojo.setEditable(false);

        labelVerde.setText("Verde");

        maximoVerde.setEditable(false);

        minimoVerde.setEditable(false);

        promedioVerde.setEditable(false);

        labelAzul.setText("Azul");

        maximoAzul.setEditable(false);

        minimoAzul.setEditable(false);

        promedioAzul.setEditable(false);

        labelMaximo.setText("Máximo");

        labelMinimo.setText("Minimo");

        labelPromedio.setText("Promedio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVerde)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelRojo)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAzul)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maximoVerde)
                                    .addComponent(maximoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMinimo)
                                    .addComponent(minimoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minimoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(maximoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minimoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(promedioRojo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(promedioVerde, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(promedioAzul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMaximo)
                            .addComponent(labelMinimo)
                            .addComponent(labelPromedio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(minimoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(promedioRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maximoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelRojo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(minimoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(promedioVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maximoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelVerde)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAzul)
                            .addComponent(maximoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minimoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(promedioAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        copyRight.setText("Realizado por Cristian Quevedo Suárez  y Fabio Calandruccio Espino");

        jMenu1.setText("Fichero");

        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        jMenu1.add(abrir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(copyRight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(copyRight)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg,*.png","jpg","png");
        file.addChoosableFileFilter(filtro);
        file.setFileFilter(filtro);
        
        int selection = file.showOpenDialog(null);
        if (selection == JFileChooser.OPEN_DIALOG) loadImage(file.getSelectedFile());
    }//GEN-LAST:event_abrirActionPerformed
    
    private void calcularValores (AdjustmentEvent ae){
        JViewport vista = jScrollPane.getViewport();
        int vierPort_ancho,vierPort_alto,upperCornerX,upperCornerY;
        
        Dimension dVierPort;
        dVierPort=vista.getExtentSize();
        vierPort_ancho = dVierPort.width;
        vierPort_alto = dVierPort.height;
        
        
        Point pUpperLeftCorner,pLowerRightCorner;
        
        pUpperLeftCorner=vista.getViewPosition();
        upperCornerX = pUpperLeftCorner.x;
        upperCornerY = pUpperLeftCorner.y;
       
        pLowerRightCorner = new Point(upperCornerX+vierPort_ancho, upperCornerY+vierPort_alto);

        if(image != null){
            if (pLowerRightCorner.x > image.getWidth() && pLowerRightCorner.y > image.getHeight()) {
               resultados = calcular.calculaEstadisticas(image,new Point(0,0), new Point(image.getWidth(), image.getHeight())); 
            }
            if (pLowerRightCorner.x <= image.getWidth() && pLowerRightCorner.y <= image.getHeight()) {
                resultados = calcular.calculaEstadisticas(image,pUpperLeftCorner, pLowerRightCorner);                
            }
            
            if (pLowerRightCorner.x <= image.getWidth() && pLowerRightCorner.y > image.getHeight()) {
                resultados = calcular.calculaEstadisticas(image,pUpperLeftCorner,  new Point(pLowerRightCorner.x, image.getHeight()));                
            }
            if (pLowerRightCorner.x > image.getWidth() && pLowerRightCorner.y <= image.getHeight()) {
                resultados = calcular.calculaEstadisticas(image,pUpperLeftCorner,  new Point(image.getWidth(), pLowerRightCorner.y));                
            }
            actualizarTextFields(resultados);
        }
    }
    
    private void actualizarTextFields(EstadisticasImagen resultados) {
        maximoRojo.setText(Integer.toString(resultados.maximo[0]));
        minimoRojo.setText(Integer.toString(resultados.minimo[0]));
        promedioRojo.setText(Integer.toString(resultados.promedio[0]));
        
        maximoVerde.setText(Integer.toString(resultados.maximo[1]));
        minimoVerde.setText(Integer.toString(resultados.minimo[1]));
        promedioVerde.setText(Integer.toString(resultados.promedio[1]));
        
        maximoAzul.setText(Integer.toString(resultados.maximo[2]));
        minimoAzul.setText(Integer.toString(resultados.minimo[2]));
        promedioAzul.setText(Integer.toString(resultados.promedio[2]));
    }
      
    private void loadImage(File file) {
        try {
            image = ImageIO.read(file);
            if(image != null){
                visualizadorFoto1.setImagen(image);
                repaint();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Debe introducir"
                    + " una imagen","Error al cargar imagen",
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
    private javax.swing.JMenuItem abrir;
    private javax.swing.JLabel copyRight;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel labelAzul;
    private javax.swing.JLabel labelMaximo;
    private javax.swing.JLabel labelMinimo;
    private javax.swing.JLabel labelPromedio;
    private javax.swing.JLabel labelRojo;
    private javax.swing.JLabel labelVerde;
    private javax.swing.JTextField maximoAzul;
    private javax.swing.JTextField maximoRojo;
    private javax.swing.JTextField maximoVerde;
    private javax.swing.JTextField minimoAzul;
    private javax.swing.JTextField minimoRojo;
    private javax.swing.JTextField minimoVerde;
    private javax.swing.JTextField promedioAzul;
    private javax.swing.JTextField promedioRojo;
    private javax.swing.JTextField promedioVerde;
    private practica6.VisualizadorFoto visualizadorFoto1;
    // End of variables declaration//GEN-END:variables

}
