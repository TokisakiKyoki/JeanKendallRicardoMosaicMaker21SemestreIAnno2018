/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.CopyImagetoClipBoard;
import Domain.showImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
/**
 *
 * @author jeanp
 */
public class MainFrame extends javax.swing.JFrame {

    showImage showI = new showImage(1440, 1080);
    Graphics g;
    JFileChooser jfc;
    BufferedImage image, bufferSubimage;
    jp_imageMosaic iM;
    
    int x, y;
    boolean clicked = false;
    
    CopyImagetoClipBoard copyImage = new CopyImagetoClipBoard();
    
    jp_imageMosaic imgMosaic;
    jp_imageArea iA = new jp_imageArea();
    
    
    public MainFrame() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        jb_addImage.setEnabled(false);
        jb_saveImage.setEnabled(false);
        
    }
    
    
    //Autgenerated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_imageMosaic = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jp_imageArea = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jb_newSub = new javax.swing.JButton();
        jtf_getWidth = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jb_addImage = new javax.swing.JButton();
        jb_exitOp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jb_saveImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MosaicMaker");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_imageMosaic.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp_imageMosaicLayout = new javax.swing.GroupLayout(jp_imageMosaic);
        jp_imageMosaic.setLayout(jp_imageMosaicLayout);
        jp_imageMosaicLayout.setHorizontalGroup(
            jp_imageMosaicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jp_imageMosaicLayout.setVerticalGroup(
            jp_imageMosaicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jp_imageMosaic, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 40, -1, -1));

        jp_imageArea.setPreferredSize(new java.awt.Dimension(1440, 1080));
        jp_imageArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_imageAreaMouseClicked(evt);
            }
        });
        jp_imageArea.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jp_imageAreaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jp_imageAreaLayout = new javax.swing.GroupLayout(jp_imageArea);
        jp_imageArea.setLayout(jp_imageAreaLayout);
        jp_imageAreaLayout.setHorizontalGroup(
            jp_imageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
        );
        jp_imageAreaLayout.setVerticalGroup(
            jp_imageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jp_imageArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 500, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_newSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Registry_Editor_50px.png"))); // NOI18N
        jb_newSub.setBorderPainted(false);
        jb_newSub.setContentAreaFilled(false);
        jb_newSub.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_newSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_newSubActionPerformed(evt);
            }
        });
        jPanel1.add(jb_newSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 50, 50));
        jPanel1.add(jtf_getWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 40, 35));

        jLabel1.setText("Tamaño");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, -1, -1));

        jb_addImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_Image_50px.png"))); // NOI18N
        jb_addImage.setBorderPainted(false);
        jb_addImage.setContentAreaFilled(false);
        jb_addImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_addImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_addImageMouseClicked(evt);
            }
        });
        jPanel1.add(jb_addImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 40));

        jb_exitOp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_30px.png"))); // NOI18N
        jb_exitOp.setBorderPainted(false);
        jb_exitOp.setContentAreaFilled(false);
        jb_exitOp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_exitOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_exitOpActionPerformed(evt);
            }
        });
        jPanel1.add(jb_exitOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 50, 40));

        jLabel3.setText("Establece el grid para pegar las imagenes!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 280, -1));

        jb_saveImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Save_50px.png"))); // NOI18N
        jb_saveImage.setBorderPainted(false);
        jb_saveImage.setContentAreaFilled(false);
        jb_saveImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_saveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saveImageActionPerformed(evt);
            }
        });
        jPanel1.add(jb_saveImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_addImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_addImageMouseClicked
        try {
            this.jfc = showI.showChooser();
            image = ImageIO.read(jfc.getSelectedFile());
            jp_imageArea.repaint();
            jp_imageArea.add(showI);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jb_addImageMouseClicked

    private void jp_imageAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_imageAreaMouseClicked
        try {
            x = evt.getX();
            y = evt.getY();
            image = ImageIO.read(jfc.getSelectedFile());

            bufferSubimage = image.getSubimage(x, y, 100, 100);
            copyImage.copyImage(bufferSubimage);
        g = jp_imageArea.getGraphics();
        g.setColor(Color.YELLOW);
        g.drawRect(x, y, 100, 100);
            String name = String.format("[%d, %d]", y, x);
            System.out.println(name);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jp_imageAreaMouseClicked

    private void jp_imageAreaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jp_imageAreaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_imageAreaPropertyChange

    private void jb_newSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_newSubActionPerformed
        try {
            jp_imageMosaic.removeAll();
            imgMosaic = new jp_imageMosaic(500, 500, Integer.parseInt(jtf_getWidth.getText()), Integer.parseInt(jtf_getWidth.getText()));
            jp_imageMosaic.add(imgMosaic);
            jb_addImage.setEnabled(true);
            jb_saveImage.setEnabled(true);
            pack();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_newSubActionPerformed

    private void jb_exitOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_exitOpActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_exitOpActionPerformed

    private void jb_saveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saveImageActionPerformed
        try {
            iM = new jp_imageMosaic();
            iM.saveFile(jp_imageMosaic);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_saveImageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_addImage;
    private javax.swing.JButton jb_exitOp;
    private javax.swing.JButton jb_newSub;
    private javax.swing.JButton jb_saveImage;
    private javax.swing.JPanel jp_imageArea;
    private javax.swing.JPanel jp_imageMosaic;
    private javax.swing.JTextField jtf_getWidth;
    // End of variables declaration//GEN-END:variables
}
