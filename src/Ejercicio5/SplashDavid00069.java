/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import hola.mundo.Calculadora;
import java.awt.Color;
import static java.awt.Color.yellow;
import static java.awt.Color.red;
import javax.swing.JOptionPane;

/**
 *
 * @author noaus
 */
public class SplashDavid00069 extends javax.swing.JFrame {

    /**
     * Creates new form SplashDavid00069
     */
    public SplashDavid00069() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCargando1 = new javax.swing.JLabel();
        barra1 = new javax.swing.JProgressBar();
        lblValor1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCargando = new javax.swing.JLabel();
        barra2 = new javax.swing.JProgressBar();
        lblValor = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargando1.setForeground(new java.awt.Color(255, 0, 51));
        lblCargando1.setText("Cargando...");
        jPanel1.add(lblCargando1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        barra1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 500, 10));

        lblValor1.setForeground(new java.awt.Color(255, 51, 51));
        lblValor1.setText("0%");
        jPanel1.add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 30, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargando.setText("Cargando...");
        jPanel2.add(lblCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        barra2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(barra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 500, 30));

        lblValor.setText("0%");
        jPanel2.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SplashDavid00069 sp= new SplashDavid00069();
       sp.setVisible(true);
       Calculadora cal= new Calculadora();
        sp.barra2.setForeground(red);//CAMBIAR EL COLOR DE LA BARRA
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(100);//TEMPORIZADOR
                sp.lblValor.setText(i+"%");
                if(i==10){
                    sp.lblCargando.setText("Conectando...");
                }
                if(i==30){
                    sp.lblCargando.setText("Iniciando sesion...");
                }
                if(i==50){
                    sp.lblCargando.setText("Validando datos...");
                }
                if(i==70){
                    sp.lblCargando.setText("Conectando a la base de datos...");
                }
                if(i==90){
                    sp.lblCargando.setText("Conexion exitosa");
                }
                if(i==100){
                    sp.lblCargando.setText("Iniciando calculadora...");
                    cal.setVisible(true);
                    System.out.println("Muestra Calculadora");
                }
                sp.barra2.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        sp.dispose();//CIERRA EL FRONT 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra1;
    private javax.swing.JProgressBar barra2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCargando;
    private javax.swing.JLabel lblCargando1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    // End of variables declaration//GEN-END:variables
}
