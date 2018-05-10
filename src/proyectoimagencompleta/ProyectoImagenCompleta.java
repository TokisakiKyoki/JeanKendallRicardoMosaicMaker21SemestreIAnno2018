/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoimagencompleta;

import Interface.MainFrame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeanp
 */
public class ProyectoImagenCompleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MainFrame mainF = new MainFrame();
            mainF.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ProyectoImagenCompleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
