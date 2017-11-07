/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import boofcv.alg.misc.ImageStatistics;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.struct.image.GrayU8;
import boofcv.struct.image.Planar;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author Cristian
 */
public class EstadisticasImagen {
    public final int ROJO = 0;
    public final int VERDE = 1;
    public final int AZUL = 2;
    public final int[] Componentes = {ROJO, VERDE, AZUL};
    public int maximo[] = new int[3];
    public int minimo[] = new int[3];
    public int promedio[] = new int[3];

    public EstadisticasImagen() {
    }
    
        
    public EstadisticasImagen calculaEstadisticas(BufferedImage imagen,Point esqSupIzda,Point esqInfDcha) {
        // convertir BufferedImage a imagen formato BoofCV
        Planar<GrayU8> imagenColor = ConvertBufferedImage.convertFromPlanar(imagen,
                null, true, GrayU8.class);
        // estadisticas
        EstadisticasImagen res = new EstadisticasImagen();
        for (int c : res.Componentes) {
            res.maximo[c] = ImageStatistics.max(imagenColor.getBand(c).subimage(esqSupIzda.x, esqSupIzda.y, esqInfDcha.x, esqInfDcha.y));
            res.minimo[c] = ImageStatistics.min(imagenColor.getBand(c).subimage(esqSupIzda.x, esqSupIzda.y, esqInfDcha.x, esqInfDcha.y));
            res.promedio[c] = (int) ImageStatistics.mean(imagenColor.getBand(0).subimage(esqSupIzda.x, esqSupIzda.y, esqInfDcha.x, esqInfDcha.y));
        }
        return res;
    } 
}
