
import java.awt.Color;
import java.awt.Graphics;
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
public class Lienzo extends JPanel {
    private int x,y,cuenta=0;

    private int [] xTrack = new int[5];
    private int [] yTrack = new int[5];
    
    
    public Lienzo(){
        this.setBackground(Color.orange);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        switch(cuenta){
            case 0 :xTrack[0]=x; yTrack[0]=y;cuenta++;
                    break;
            case 1 :xTrack[1]=x; yTrack[1]=y;cuenta++;
                    break;
            case 2 :xTrack[2]=x; yTrack[2]=y;cuenta++;
                    break;
            case 3 :xTrack[3]=x; yTrack[3]=y;cuenta++;
                    break;
            case 4 :xTrack[4]=x; yTrack[4]=y;cuenta=0;
                    break;
        }
        delay(75);
        for (int i = 0; i < 5; i++) {
            g.drawOval(xTrack[i], yTrack[i], 30, 30);
            g.fillOval(xTrack[i], yTrack[i], 30, 30);
        }
    }
    
    public void changeBackgroundColor(String color){
        setBackground(getColor(color));
    }
    public void changePincelColor(String color){
        setForeground(getColor(color));
    }

    private Color getColor(String color) {
        switch (color){
            case "Amarillo": return Color.YELLOW;
            case "Blanco": return Color.WHITE;
            case "Naranja": return Color.ORANGE;
            case "Negro": return Color.BLACK;
            case "Azul": return Color.BLUE;
            case "Verde": return Color.GREEN;
            default:return null;
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void delay(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {}
    }
}
