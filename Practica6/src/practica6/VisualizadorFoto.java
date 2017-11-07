package practica6;




import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
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
public class VisualizadorFoto extends JPanel{
    static BufferedImage imagen;
    
    public VisualizadorFoto(){
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
        setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
        revalidate();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
    }
}


