package Interface;

import Domain.showImageCut;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jeanp
 */
public class jp_imageMosaic extends javax.swing.JPanel {
    
    int rows, cols;
    Graphics g;
    Graphics2D graphics2D;
    private Dimension PREF_SIZE;
    protected static final Color SELECTION_COLOR = Color.pink;
    private JPanel selectedPanel = null;
    private Color originalColor = null;

    jp_imageArea imagePanel;

    public jp_imageMosaic() throws IOException {
        this.imagePanel = new jp_imageArea();
        
    }
    
    

    public jp_imageMosaic(int w, int h, int r, int c) throws IOException {
        this.imagePanel = new jp_imageArea();
        initComponents();
        PREF_SIZE = new Dimension(w, h);
        setSize(500, 500);
        rows = r;
        cols = c;

        setLayout(new GridLayout(rows, cols, 1, 1));
        setBackground(Color.black);
        for (int i = 0; i < rows * cols; i++) {
            JPanel panel = new JPanel();
            String name = String.format("[%d, %d]",
                    i / cols, i % rows);
            panel.setName(name);
            if (i == 0) {
                originalColor = panel.getBackground();
            }
            panel.setPreferredSize(PREF_SIZE);
            add(panel);
        }

        /*-------------Obtener coordenadas del mouse-----------------*/
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JPanel panel = (JPanel) getComponentAt(e.getPoint());
                if (panel == null || panel == jp_imageMosaic.this) {
                    return;
                }

                selectedPanel = panel;

                try {
                    selectedPanel = panel;
                    showImageCut showI = new showImageCut(getImageFromClipboard(),selectedPanel.getWidth(), selectedPanel.getHeight());
                    selectedPanel.add(showI);
               } catch (Exception ex) {
                    Logger.getLogger(jp_imageMosaic.class.getName()).log(Level.SEVERE, null, ex);
                }
                selectedPanel.repaint();
            }
        });

    }//constructor

    public Image getImageFromClipboard()
            throws Exception {
        Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.imageFlavor)) {
            return (Image) transferable.getTransferData(DataFlavor.imageFlavor);
        } else {
            return null;
        }
    }
    
    public BufferedImage createImageFromPanel(JPanel panel) {

    int w = panel.getWidth();
    int h = panel.getHeight();
    BufferedImage buffI = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = buffI.createGraphics();
    panel.print(g);
    g.dispose();
    return buffI;
    
    }
    
    public void saveFile(JPanel panel) {
       try {
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION){
                File JFC = fileChooser.getSelectedFile();
                String PATH = JFC.getAbsolutePath();
                File outputfile = new File(PATH+".png");
                ImageIO.write(createImageFromPanel(panel), "png", outputfile);
            }        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                   "Ha ocurrido un error al guardar el archivo",
                   "Advertencia", JOptionPane.WARNING_MESSAGE);
       }
    }

//AutoGeneratedCode
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
