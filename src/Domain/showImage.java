/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jeanp
 */
public class showImage extends javax.swing.JPanel{

    String filePath;//direccion string del archivo seleccionado
    private FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Archivo de imagen", "jpg");
    private BufferedImage image;
    private Graphics2D graphics2D;

    public showImage(int w, int h) {
        this.setSize(w, h); //se selecciona el tamaño del panel
    }

    JFileChooser chooser = new JFileChooser();

    public JFileChooser showChooser() {
        chooser.setFileFilter(fileFilter);//filtro
        int returnName = chooser.showOpenDialog(this);
        String url="";
        
        if (returnName == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
             url = file.getPath();
            if (file != null) { // Make sure the user didn't choose a directory.
                try {
                    image = ImageIO.read(new File(url));
                   
                } catch (IOException ex) {
                    // handle exception...
                }
            }
        }
        return chooser;
    }

    @Override
    public void paint(Graphics gfx) {
        super.paintComponent(gfx);
        setBackground(Color.GRAY);
        
        //Se selecciona la imagen que tenemos en el paquete de la ruta del programa
        
        
        //se dibuja la imagen que tenemos en el paquete Images dentro de un panel
        gfx.drawImage(image, 0, 0, null);
        

    }
    
    void clearRect(int x, int y, int width, int height){
        
    }

}
