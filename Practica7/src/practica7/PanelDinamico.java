/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author Cristian
 */
public class PanelDinamico extends JScrollPane{
    private JScrollBar vertical,horizontal;
    Point upperLeftCorner,lowerRightCorner;
    
    public PanelDinamico(){
        vertical=getVerticalScrollBar();
        horizontal=getHorizontalScrollBar();
        setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    public JScrollBar getVertical() {
        return vertical;
    }

    public JScrollBar getHorizontal() {
        return horizontal;
    }

    public Point getUpperLeftCorner() {
        return upperLeftCorner;
    }

    public Point getLowerRightCorner() {
        return lowerRightCorner;
    }
    
}
