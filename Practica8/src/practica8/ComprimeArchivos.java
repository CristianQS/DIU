/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

import java.util.zip.*; 
import java.util.List; 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;


/**
 *
 * @author Cristian
 */
public class ComprimeArchivos extends SwingWorker <Void,Integer> {
    private  List<String> files;
    private int BUFFER_SIZE;
    private final String rutaDestino,rutaOrigen;
    private JButton destinoButton,origenButton,cancelarButton;
    private JProgressBar barra;
//La prueba que va a hacer es una caperta con 10 ficheros y ningun directorio.
    public ComprimeArchivos(List<String> ficheros,String rutaDestino, String 
        rutaOrigen, JButton destino, JButton origen,JButton cancelar, JProgressBar barra) {
        
        files = new ArrayList<String>();
        this.rutaDestino=rutaDestino;
        this.rutaOrigen=rutaOrigen;
        this.origenButton=origen;
        this.destinoButton=destino;
        this.cancelarButton=cancelar;
        this.barra=barra;
        this.files=ficheros;
        BUFFER_SIZE=files.size();
    }
    
    @Override
    public Void doInBackground() {
        barra.setMaximum(BUFFER_SIZE);
        comprimir();
        return null;
    }

    @Override
    protected void done() {
        try {
           System.out.println("Se ha comprimido");
           origenButton.setEnabled(true);
           destinoButton.setEnabled(true);
           cancelarButton.setEnabled(false);
        } catch (Exception ignore) {
        }
    }

    @Override
    protected void process(List<Integer> list) {
        for (Integer integer : list) {
            barra.setValue(integer);
        }
    }
    
    public void comprimir(){
        try {
            // Objeto para referenciar a los archivos que queremos comprimir 
            BufferedInputStream origin = null; 
            // Objeto para referenciar el archivo zip de salida 
            FileOutputStream dest = new FileOutputStream(rutaDestino+"\\folder.zip"); 
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest)); 
            // Buffer de transferencia para mandar datos a comprimir 
            byte[] data = new byte[BUFFER_SIZE]; 
            Iterator i = files.iterator(); 
            int countFile = 1;
            while(i.hasNext()) {
                String filename = (String)i.next(); 
                FileInputStream fi = new FileInputStream(rutaOrigen+"\\"+filename); 
                origin = new BufferedInputStream(fi,BUFFER_SIZE); 
                System.out.println("Ha pasado");
                ZipEntry entry = new ZipEntry( filename ); 
                out.putNextEntry( entry ); 
                // Leemos datos desde el archivo origen y los mandamos al archivo destino 
                int count;
                while((count = origin.read(data, 0, BUFFER_SIZE)) != -1) {
                  out.write(data, 0, count); 
                }
              // Cerramos el archivo origen, ya enviado a comprimir origin.close(); 
                publish(countFile++);
                origin.close();
            }
            // Cerramos el archivo zip 
            out.close(); 
        }catch( Exception e ) {   
            e.printStackTrace(); 
        }   
    }
}
