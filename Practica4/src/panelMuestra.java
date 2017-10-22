
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class panelMuestra extends JPanel {
    private BufferedImage imagen = null;
    private BufferedImage imagenOriginal = null;

    public panelMuestra() {
        setBackground(Color.white);
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
        this.imagenOriginal = imagen;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        
    }
    
    public void difuminar(){
        float[] difuminar = {
            0.111f, 0.111f, 0.111f,
            0.111f, 0.111f, 0.111f,
            0.111f, 0.111f, 0.111f,};
        Kernel sharpkernel = new Kernel(3, 3, difuminar);
        ConvolveOp sop = new ConvolveOp(sharpkernel, ConvolveOp.EDGE_NO_OP, null);
        imagen = sop.filter(imagen, null);
    }
    
    public void desDifuminar(boolean b){
        imagen=imagenOriginal;
        if(!b){
            resaltar(); 
        }
    }
    
    public void resaltar (){
        float [] resaltar = {
            0.f, -1.f, 0.f,
            -1.f, 5.0f, -1.f,
            0.f, -1.f, 0.f};
        Kernel sharpkernel = new Kernel(3, 3, resaltar);
        ConvolveOp sop = new ConvolveOp(sharpkernel, ConvolveOp.EDGE_NO_OP, null);
        imagen = sop.filter(imagen, null);
    }
    
    public void desResaltar(boolean b){
        imagen=imagenOriginal;
        if(!b){
            difuminar(); 
        }
    }
}


    
    
    

