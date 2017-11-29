/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author mjper
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jddiagramaflujo = new javax.swing.JDialog();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        codigogenerado = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_codigo = new javax.swing.JTextArea();
        jpp_paralelogramo = new javax.swing.JPopupMenu();
        jpp_texto_paralelogramo = new javax.swing.JMenuItem();
        jpp_color_paralelogramo = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_diagramaflujo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jddiagramaflujo.setTitle("Diagrama de flujo");
        jddiagramaflujo.setPreferredSize(new java.awt.Dimension(1670, 865));
        jddiagramaflujo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Figuras");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/Circulo.jpg"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 30, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/Ovalo.jpg"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 60, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/Paralelogramo.jpg"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 50, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/flecha.jpg"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        panel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 20, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/Rombo.jpg"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        panel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 30, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/Rectangulo.jpg"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        panel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 40, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/figuraproceso.jpg"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        panel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 40, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FigurasDiagramaFlujo/flechaderecha.jpg"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        panel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 40, -1));

        jddiagramaflujo.getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 710));

        jButton9.setText("Generar codigo");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jddiagramaflujo.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 750, -1, -1));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(500, 500));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(null);
        jTabbedPane1.addTab("Diagrama de flujo", panel);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.addTab("Codigo C++", jPanel1);

        jddiagramaflujo.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 1310, 830));

        codigogenerado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_codigo.setColumns(20);
        ta_codigo.setRows(5);
        jScrollPane2.setViewportView(ta_codigo);

        codigogenerado.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 580, 530));

        jpp_texto_paralelogramo.setText("Texto");
        jpp_texto_paralelogramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpp_texto_paralelogramoActionPerformed(evt);
            }
        });
        jpp_paralelogramo.add(jpp_texto_paralelogramo);

        jpp_color_paralelogramo.setText("Color");
        jpp_color_paralelogramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpp_color_paralelogramoActionPerformed(evt);
            }
        });
        jpp_paralelogramo.add(jpp_color_paralelogramo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eleccion de diagramas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagrama-de-flujo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 607));

        jMenu1.setText("Diagramas");

        jmi_diagramaflujo.setText("Diagrama de Flujo");
        jmi_diagramaflujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_diagramaflujoMouseClicked(evt);
            }
        });
        jmi_diagramaflujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_diagramaflujoActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_diagramaflujo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_diagramaflujoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_diagramaflujoMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jmi_diagramaflujoMouseClicked

    private void jmi_diagramaflujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_diagramaflujoActionPerformed
        // TODO add your handling code here:
        
        this.jddiagramaflujo.setModal(true);
        jddiagramaflujo.pack();
        jddiagramaflujo.setLocationRelativeTo(this);
        jddiagramaflujo.setVisible(true);
    }//GEN-LAST:event_jmi_diagramaflujoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       JLabel circulo = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(circulo,new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 640, 760));
        circulo.setLocation(10, 200);
        circulo.setIcon(new javax.swing.ImageIcon("./src/FigurasDiagramaFlujo/Circulo.jpg") );
         circulo.setOpaque(true);
        circulo.setMaximumSize(new java.awt.Dimension(50, 50));
        circulo.setMinimumSize(new Dimension(50, 10));
        circulo.setLocation(new Point(20, 20));
        circulo.setPreferredSize(new Dimension(50, 50));
        circulo.setSize(50, 50);
         circulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if ((circulo.getLocation().x + evt.getX() - circulo.getWidth() / 2) >= 0
                        && (circulo.getLocation().x + evt.getX() - circulo.getWidth() / 2) <= 1200) {
                    
                    circulo.setLocation(circulo.getLocation().x + evt.getX() - circulo.getWidth() / 2,
                            circulo.getLocation().y + evt.getY() - circulo.getHeight() / 2);

                   
                }// para que no se salga del rango

            }
        });
        
         circulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evtr) {
                if(evtr.isMetaDown()){
                    System.out.println("hola");
                }
            }
        });
         
        /*
          Ovalo.setBackground(Color.red);
        
        Ovalo.setHorizontalTextPosition(SwingConstants.CENTER);
       
       Ovalo.setOpaque(true);
      
        
       
        
       Ovalo.setBounds(360, 150, 150, 50);
         */
       
   
       
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        JLabel Ovalo = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(Ovalo,new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 500, 760));
       Ovalo.setLocation(20, 210);
       Ovalo.setIcon(new javax.swing.ImageIcon("./src/Iconitos/Ovalo.png") );
       
       //Ovalo.setBackground(Color.red);
        
        Ovalo.setHorizontalTextPosition(SwingConstants.CENTER);
       
       Ovalo.setOpaque(true);
      
        
       
        
       
       
        Ovalo.setMaximumSize(new java.awt.Dimension(30, 30));
        Ovalo.setMinimumSize(new Dimension(60, 20));
        Ovalo.setLocation(new Point(30, 30));
        Ovalo.setPreferredSize(new Dimension(40, 40));
        Ovalo.setSize(50, 50);
        Ovalo.setBackground(Color.cyan);
        Ovalo.setBounds(440, 320, 100, 50);
         Ovalo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if ((Ovalo.getLocation().x + evt.getX() - Ovalo.getWidth() / 2) >= 0
                        && (Ovalo.getLocation().x + evt.getX() - Ovalo.getWidth() / 2) <= 1200) {
                    
                    Ovalo.setLocation(Ovalo.getLocation().x + evt.getX() - Ovalo.getWidth() / 2,
                           Ovalo.getLocation().y + evt.getY() - Ovalo.getHeight() / 2);

                   
                }// para que no se salga del rango

            }
        });
         
         Ovalo.addMouseMotionListener(l);
         
         /*
          Paralelogramo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evtr) {
                if(evtr.isMetaDown()){
                    //javax.swing.JPopupMenu jpp_paralelogramo1 = new javax.swing.JPopupMenu();
                    
                    jpp_paralelogramo.show(evtr.getComponent(), evtr.getX(), evtr.getY());
                    templabel=Paralelogramo;
                    
                }
            }
        });
         
          Paralelogramo.setText(templabel.getText());
          Paralelogramo.setBackground(templabel.getBackground());
        
       
        
       
        
       polla.setBounds(360, 150, 150, 50);
         */
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
        JLabel Paralelogramo = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(Paralelogramo,new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 500, 760));
        Paralelogramo.setLocation(20, 210);
        //Paralelogramo.setBackground(Color.red);
        
        Paralelogramo.setHorizontalTextPosition(SwingConstants.CENTER);
       Paralelogramo.setIcon(new javax.swing.ImageIcon("./src/Iconitos/paralelogramo_p.png") );
       Paralelogramo.setOpaque(true);
      Paralelogramo.setMaximumSize(new java.awt.Dimension(30, 30));
       Paralelogramo.setMinimumSize(new Dimension(60, 20));
        Paralelogramo.setLocation(new Point(30, 30));
       Paralelogramo.setPreferredSize(new Dimension(40, 40));
        //Paralelogramo.setSize(180, 200);
        Paralelogramo.setBackground(Color.cyan);
       Paralelogramo.setBounds(440, 320, 100, 67);
       
       
       
         Paralelogramo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if ((Paralelogramo.getLocation().x + evt.getX() - Paralelogramo.getWidth() / 2) >= 0
                        && (Paralelogramo.getLocation().x + evt.getX() - Paralelogramo.getWidth() / 2) <= 1200) {
                    
                    Paralelogramo.setLocation(Paralelogramo.getLocation().x + evt.getX() - Paralelogramo.getWidth() / 2,
                            Paralelogramo.getLocation().y + evt.getY() - Paralelogramo.getHeight() / 2);

                    
                }// para que no se salga del rango

            }
        });
         
          Paralelogramo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evtr) {
                if(evtr.isMetaDown()){
                    //javax.swing.JPopupMenu jpp_paralelogramo1 = new javax.swing.JPopupMenu();
                    
                    jpp_paralelogramo.show(evtr.getComponent(), evtr.getX(), evtr.getY());
                    templabel=Paralelogramo;
                    
                }
            }
        });
         
          Paralelogramo.setText(templabel.getText());
          Paralelogramo.setBackground(templabel.getBackground());
          
        
        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        
        
        JLabel name = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(name,new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 300, 600));
        name.setLocation(20, 210);
        name.setIcon(new javax.swing.ImageIcon("./src/FigurasDiagramaFlujo/Flecha.jpg") );
        name.setMaximumSize(new java.awt.Dimension(30, 30));
        name.setMinimumSize(new Dimension(60, 20));
        name.setLocation(new Point(30, 30));
        name.setPreferredSize(new Dimension(40, 40));
        name.setSize(50, 50);
         name.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if ((name.getLocation().x + evt.getX() - name.getWidth() / 2) >= 0
                        && (name.getLocation().x + evt.getX() - name.getWidth() / 2) <= 1200) {
                    
                    name.setLocation(name.getLocation().x + evt.getX() - name.getWidth() / 2,
                            name.getLocation().y + evt.getY() - name.getHeight() / 2);

                    
                }// para que no se salga del rango

            }
        });
        
        
        
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
        
        JLabel rombo = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(rombo,new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 600, 600));
        rombo.setLocation(20, 210);
        
        rombo.setBackground(Color.cyan);
        rombo.setHorizontalTextPosition(SwingConstants.CENTER);
       
       rombo.setOpaque(true);
        rombo.setIcon(new javax.swing.ImageIcon("./src/Iconitos/rombo_p.png") );
        rombo.setMaximumSize(new java.awt.Dimension(30, 30));
        rombo.setMinimumSize(new Dimension(60, 20));
        rombo.setLocation(new Point(30, 30));
        rombo.setPreferredSize(new Dimension(40, 40));
        rombo.setSize(50, 50);
        rombo.setBounds(440, 320, 100, 67);
         rombo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if ((rombo.getLocation().x + evt.getX() - rombo.getWidth() / 2) >= 0
                        && (rombo.getLocation().x + evt.getX() - rombo.getWidth() / 2) <= 1200) {
                    
                    rombo.setLocation(rombo.getLocation().x + evt.getX() -rombo.getWidth() / 2,
                            rombo.getLocation().y + evt.getY() - rombo.getHeight() / 2);

                    
                }// para que no se salga del rango

            }
        });
        
        
        /*
        rombo.setBackground(Color.red);
        
        rombo.setHorizontalTextPosition(SwingConstants.CENTER);
       
       rombo.setOpaque(true);
      
        
       
        
      rombo.setBounds(360, 150, 150, 50);
        
       */ 
        
        
        
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        
        
        
        JLabel rectangulo = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(rectangulo,new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 550, 600));
        rectangulo.setLocation(20, 210);
        rectangulo.setBackground(Color.cyan);
        rectangulo.setForeground(Color.BLACK);
        
       rectangulo.setOpaque(true);
        rectangulo.setIcon(new javax.swing.ImageIcon("./src/Iconitos/Rectangulo_p.png") );
        rectangulo.setHorizontalTextPosition(SwingConstants.CENTER);
       
        rectangulo.setMaximumSize(new java.awt.Dimension(30, 30));
        rectangulo.setMinimumSize(new Dimension(60, 20));
        rectangulo.setLocation(new Point(30, 30));
        rectangulo.setPreferredSize(new Dimension(40, 40));
        //name.setSize(70, 50);
         rectangulo.setBounds(440, 320, 100, 67);
        
         rectangulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if ((rectangulo.getLocation().x + evt.getX() - rectangulo.getWidth() / 2) >= 0
                        && (rectangulo.getLocation().x + evt.getX() - rectangulo.getWidth() / 2) <= 1200) {
                    
                    rectangulo.setLocation(rectangulo.getLocation().x + evt.getX() - rectangulo.getWidth() / 2,
                            rectangulo.getLocation().y + evt.getY() - rectangulo.getHeight() / 2);

                   
                }// para que no se salga del rango

            }
        });
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        
        JLabel resultado = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(resultado,new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 330, 600));
         resultado.setLocation(20, 210);
         resultado.setIcon(new javax.swing.ImageIcon("./src/Iconitos/resultado.png") );
         resultado.setMaximumSize(new java.awt.Dimension(30, 30));
         resultado.setMinimumSize(new Dimension(60, 20));
         resultado.setLocation(new Point(30, 30));
         resultado.setPreferredSize(new Dimension(40, 40));
        resultado.setBackground(Color.cyan);
        resultado.setBounds(420, 300, 100, 67);
          resultado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if (( resultado.getLocation().x + evt.getX() -  resultado.getWidth() / 2) >= 0
                        && ( resultado.getLocation().x + evt.getX() -  resultado.getWidth() / 2) <= 1200) {
                    
                     resultado.setLocation( resultado.getLocation().x + evt.getX() -  resultado.getWidth() / 2,
                             resultado.getLocation().y + evt.getY() -  resultado.getHeight() / 2);

                    
                }// para que no se salga del rango

            }
        });
        
        
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
         JLabel derecha = new JLabel();
       // name.setPreferredSize(new Dimension(50, 100));
        panel.add(derecha,new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 330, 600));
        derecha.setLocation(20, 210);
        derecha.setIcon(new javax.swing.ImageIcon("./src/FigurasDiagramaFlujo/flechaderecha.jpg") );
        derecha.setMaximumSize(new java.awt.Dimension(30, 30));
        derecha.setMinimumSize(new Dimension(60, 20));
        derecha.setLocation(new Point(30, 30));
        derecha.setPreferredSize(new Dimension(40, 40));
        derecha.setSize(50, 50);
       
         derecha.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if ((derecha.getLocation().x + evt.getX() - derecha.getWidth() / 2) >= 0
                        && (derecha.getLocation().x + evt.getX() - derecha.getWidth() / 2) <= 1200) {
                    
                    derecha.setLocation(derecha.getLocation().x + evt.getX() - derecha.getWidth() / 2,
                            derecha.getLocation().y + evt.getY() - derecha.getHeight() / 2);

                   
                }// para que no se salga del rango

            }
        });
        
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        /*this.codigogenerado.setModal(true);
        codigogenerado.pack();
        codigogenerado.setLocationRelativeTo(this);
        codigogenerado.setVisible(true);*/
        
        System.out.println(codigo);
        
        
    }//GEN-LAST:event_jButton9MouseClicked

    private void jpp_texto_paralelogramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpp_texto_paralelogramoActionPerformed
        // TODO add your handling code here:
        String texto=JOptionPane.showInputDialog(this, "Ingrese un texto");
        templabel.setText(texto);
        codigo+="\n"
                  + "printf("+templabel.getText()+")";
        
        
        
    }//GEN-LAST:event_jpp_texto_paralelogramoActionPerformed

    private void jpp_color_paralelogramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpp_color_paralelogramoActionPerformed
        // TODO add your handling code here:
        Color cl = JColorChooser.showDialog(this, "Seleccione Color ", Color.yellow);
        
        
        templabel.setBackground(cl);
    }//GEN-LAST:event_jpp_color_paralelogramoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog codigogenerado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jddiagramaflujo;
    private javax.swing.JMenuItem jmi_diagramaflujo;
    private javax.swing.JMenuItem jpp_color_paralelogramo;
    private javax.swing.JPopupMenu jpp_paralelogramo;
    private javax.swing.JMenuItem jpp_texto_paralelogramo;
    private javax.swing.JPanel panel;
    private java.awt.Panel panel1;
    private javax.swing.JTextArea ta_codigo;
    // End of variables declaration//GEN-END:variables
int cont=0;
String labelname="h",
       codigo = "Programa\n"
        + "#include <stdio.h>\n\n"
        + "int main(){\n" 
        
        
        ;
JLabel templabel = new JLabel();



}
