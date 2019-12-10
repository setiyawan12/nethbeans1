/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splash;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import rojerusan.RSAnimation;

/**
 *
 * @author setiyawan
 */
public class Splash extends javax.swing.JFrame {
    
    private Timer t;
    private int n = 0;
    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        
        progress.setValue(0);
        progress.setColorBackground(new Color(0,0,0,0));
        pnlTexto.setBackground(new Color(0,0,0,0));
        
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        
        
        RSAnimation.setBajar(-200, 60, 2, 2, pnlLogo);
        RSAnimation.setSubir(1000, 400, 2, 2, pnlTexto);
        
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(n <= 100){
                    progress.setValue(n);
                    n = n + 10;
                }else{
                    t.stop();
                    dispose();
                    new app.Login().setVisible(true);
                }
            }
        };
        
        t = new Timer(400, accion);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        pnlLogo = new rspanelcircleborder.RSPanelCircleBorder();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        pnlTexto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        progress = new rojerusan.componentes.RSProgressBarSinText();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo1.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        kGradientPanel1.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 200, 200));

        pnlTexto.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lato Heavy", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME");

        jLabel2.setFont(new java.awt.Font("Lato Heavy", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERPUSTAKAAN");

        javax.swing.GroupLayout pnlTextoLayout = new javax.swing.GroupLayout(pnlTexto);
        pnlTexto.setLayout(pnlTextoLayout);
        pnlTextoLayout.setHorizontalGroup(
            pnlTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextoLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(pnlTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)))
                .addGap(251, 251, 251))
        );
        pnlTextoLayout.setVerticalGroup(
            pnlTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        kGradientPanel1.add(pnlTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        progress.setForeground(new java.awt.Color(51, 255, 204));
        progress.setValue(20);
        progress.setGrosorBorde(0);
        kGradientPanel1.add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 830, 20));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private java.awt.Panel panel1;
    private rspanelcircleborder.RSPanelCircleBorder pnlLogo;
    private javax.swing.JPanel pnlTexto;
    private rojerusan.componentes.RSProgressBarSinText progress;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables
}