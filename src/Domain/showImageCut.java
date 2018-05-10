/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jeanp
 */
public class showImageCut extends javax.swing.JPanel{

    String filePath;//direccion string del archivo seleccionado
    private FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Archivo de imagen", "jpg");
    private BufferedImage image;
    private Graphics2D graphics2D;
    int width,height;

    public showImageCut(Image imageCut, int w, int h) {
        this.setSize(w, h); //se selecciona el tamaño del panel
        image= (BufferedImage)imageCut;
        width=w;
        height=h;
    }

    JFileChooser chooser = new JFileChooser();

    

    @Override
    public void paint(Graphics gfx) {
        super.paintComponent(gfx);
        setBackground(Color.GRAY);
        
        //Se selecciona la imagen que tenemos en el paquete de la ruta del programa
        
        
        //se dibuja la imagen que tenemos en el paquete Images dentro de un panel
        gfx.drawImage(image, 0, 0, width, height, null);
        
    }
    
    

}
