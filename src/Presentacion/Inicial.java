package Presentacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.MouseInfo;
import javax.swing.JFrame;
import static org.math.array.DoubleArray.*;
import static java.lang.Math.*;
import javax.swing.JFrame;
import org.math.plot.Plot3DPanel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;
import java.io.IOException;


import java.awt.Event;
import java.awt.Point;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.math.plot.Plot3DPanel;
import org.sf.surfaceplot.SurfaceCanvas;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class Inicial extends javax.swing.JFrame{

    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private JPanel PanelGrafico;
    private JPanel PanelInteraccion;
    private JLabel LBLImagen;
    private JTextField TXTFrecuencia;
    private JTextField TXTCarga;
    private JLabel jLabel1;
    private JPanel PanelDatos;
    private JButton BTNreiniciar;
    private JTable Tabladatos;
    private JScrollPane Scroll;
    private JButton BTNFrecuencia;
    private JButton BTNExportar;
    private JButton BTN3D;
    private JLabel Seleccion;
    private JLabel LBLCarga;
    private JButton btnAyuda;
    private JLabel INFO;
    private String seleccionada = "NO";
    private double Carga;
    private int carga1;
    private int frecuencia = 1;

    /**
     *
     */
    public JLabel l1;

    /**
     * Auto-generated main method to display this JFrame
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                Inicial inst = new Inicial();
                inst.setLocationRelativeTo(null);
                inst.setVisible(true);
                inst.setBounds(1, 1, 1000, 520);
                


            }
        });
    }

    /**
     *
     */
    public Inicial() {
        super();
        initGUI();
    }
    /*
    * Creacion de Vista, inmediantamente al ejecutarse el programa
    */
    private void initGUI() {
        try {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            this.setTitle(" Potencial Electrico");//Nombre del JFrame
            getContentPane().setBackground(new java.awt.Color(214, 214, 214));
            this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Carga Positiva.JPG")).getImage());
            getContentPane().setLayout(null);
            this.addMouseListener(new MouseAdapter() {
            });
            {
                PanelGrafico = new JPanel();
                BorderLayout PanelGraficoLayout = new BorderLayout();
                PanelGrafico.setLayout(PanelGraficoLayout);
                getContentPane().add(PanelGrafico);
                PanelGrafico.setBounds(12, 12, 460, 460);
                PanelGrafico.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
                
                PanelGrafico.addMouseListener(new MouseAdapter() {

                    public void mouseClicked(MouseEvent evt) {
                        PanelGraficoMouseClicked(evt);
                    }
                });

            }
            {
                PanelInteraccion = new JPanel();
                getContentPane().add(PanelInteraccion);
                PanelInteraccion.setBounds(484, 12, 294, 460);
                PanelInteraccion.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
                PanelInteraccion.setLayout(null);

                {
                    INFO = new JLabel();
                    PanelInteraccion.add(INFO);
                    INFO.setText("Datos de Interes");
                    INFO.setBounds(13, 34, 182, 18);
                    INFO.setFont(new java.awt.Font("Algerian", 0, 12));
                }

                {
                    Scroll = new JScrollPane();
                    PanelInteraccion.add(Scroll);
                    Scroll.setBounds(13, 60, 268, 236);
                    {
                        TableModel TabladatosModel =
                                new DefaultTableModel(
                                new String[][]{{"0", "0", "0", "0"}},
                                new String[]{"#", "Carga", "Posicion X", "Posicion Y"});
                        Tabladatos = new JTable();
                        Scroll.setViewportView(Tabladatos);
                        Tabladatos.setModel(TabladatosModel);
                    }
                }
            }
            {
                PanelDatos = new JPanel();
                getContentPane().add(PanelDatos);
                PanelDatos.setBounds(790, 12, 185, 460);
                PanelDatos.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
                PanelDatos.setLayout(null);
                {
                }
                {
                    TXTCarga = new JTextField();
                    PanelDatos.add(TXTCarga);
                    TXTCarga.setBounds(13, 66, 159, 21);
                    TXTCarga.setEditable(true);
                }
                {
                    LBLCarga = new JLabel();
                    PanelDatos.add(LBLCarga);
                    LBLCarga.setText("Frecuencia ");
                    LBLCarga.setBounds(13, 100, 106, 18);
                    LBLCarga.setFont(new java.awt.Font("Algerian", 0, 14));
                }
                {
                    Seleccion = new JLabel();
                    PanelDatos.add(Seleccion);
                    Seleccion.setText("Carga");
                    Seleccion.setBounds(13, 34, 178, 26);
                    Seleccion.setFont(new java.awt.Font("Algerian", 0, 14));
                }
                {
                    BTNreiniciar = new JButton();
                    PanelDatos.add(BTNreiniciar);
                    BTNreiniciar.setText("Reiniciar");
                    BTNreiniciar.setBounds(74, 200, 98, 32);
                    BTNreiniciar.setEnabled(true);
                    BTNreiniciar.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent evt) {
                            BTNreiniciarActionPerformed(evt);
                        }
                {
                    btnAyuda = new JButton();
                    PanelDatos.add(btnAyuda);
                    btnAyuda.setText("Ayuda");
                    btnAyuda.setBounds(74,380,98,32);
                    btnAyuda.setEnabled(true);
                   // btnAyuda.setFont(new java.awt.Font("Algerian", 0, 14));
                    btnAyuda.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                        }
                    });
                }        
                
                    });
                }

                {
                    TXTFrecuencia = new JTextField();
                    PanelDatos.add(TXTFrecuencia);
                    TXTFrecuencia.setText("1");
                    TXTFrecuencia.setBounds(13, 130, 159, 21);
                }
                {
                    BTNFrecuencia = new JButton();
                    PanelDatos.add(BTNFrecuencia);
                    BTNFrecuencia.setText("Refrescar");
                    BTNFrecuencia.setBounds(74, 153, 98, 32);
                    BTNFrecuencia.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent evt) {
                            BTNFrecuenciaActionPerformed(evt);
                        }
                    });
                }
                {
                    BTNExportar = new JButton();
                    PanelDatos.add(BTNExportar);
                    BTNExportar.setText("Exportar");
                    BTNExportar.setBounds(74, 260, 98, 32);
                    
                     
                }
                {
                    BTN3D = new JButton();
                    PanelDatos.add(BTN3D);
                    BTN3D.setText("Vista en 3D");
                    BTN3D.setBounds(74, 300, 98, 32);
                    BTN3D.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent evt) {
                            
                        }
                    });
                }
                {
                    LBLImagen = new JLabel();
                    PanelDatos.add(LBLImagen);
                    LBLImagen.setBounds(13, 321, 159, 120);
                    LBLImagen.setIcon(new ImageIcon(getClass().getClassLoader().getResource("")));
                }
            }
            pack();
            this.setSize(1000, 530);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param evento
     */
    public void addEventos(MouseEvent evento) {


        l1.setText(String.format("coordenadas [%d, %d]", evento.getX(), evento.getY()));


    }
    /*
    * Funcion que se encarga de manejar el panel de la grafica, con el fin de dibujar los puntos cliqueados
    */
    private void PanelGraficoMouseClicked(MouseEvent evt) {

        try {
            if (Double.parseDouble(this.TXTCarga.getText()) < 0) {
                this.carga1 = 1;
            } else {
                this.carga1 = 0;
            }
            Guardar();

            this.TXTCarga.setEditable(true);



            if (this.seleccionada.equals("SI")) {
                Seleccion.setText("Seleccion de Cargas");

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valor de la carga");
        }
    }
    /*
    * Eventos de los Botones
    */
    private void BTNFrecuenciaActionPerformed(ActionEvent evt) {
        this.frecuencia = Integer.parseInt(this.TXTFrecuencia.getText());
        this.LBLCarga.setText("Frecuencia " + this.frecuencia);
        
    }

    private void BTNreiniciarActionPerformed(ActionEvent evt) {
        TableModel TabladatosModel = new DefaultTableModel(new String[][]{{"0", "0", "0", "0"}}, new String[]{"#", "Carga", "Posicion X", "Posicion Y"});
        Tabladatos.setModel(TabladatosModel);
        
    }

    

    
    
 /*
    * Fin eventos de los botones
    */
    private void Guardar() {

        if (this.carga1 == 1) {
            this.Carga = (-1) * (Math.abs(Double.parseDouble(this.TXTCarga.getText())));
            this.seleccionada = "SI";
        } else {
            this.Carga = Math.abs(Math.abs(Double.parseDouble(this.TXTCarga.getText())));
            this.seleccionada = "SI";
        }

    }

    

   
}