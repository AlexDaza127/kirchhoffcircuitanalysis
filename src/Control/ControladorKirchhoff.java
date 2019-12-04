/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.CalculoM1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Vista.VentanaKirchhoff;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class ControladorKirchhoff implements ActionListener {

    VentanaKirchhoff objV;
    CalculoM1 objM1;

    public ControladorKirchhoff(VentanaKirchhoff objV, CalculoM1 objM1) {
        this.objV = objV;
        this.objM1 = objM1;
        /////primer malla
        objV.getCmbM1RV1().addActionListener(this);
        objV.getCmbM1RV2().addActionListener(this);
        objV.getCmbM1RV3().addActionListener(this);
        objV.getBtnM1Result().addActionListener(this);
        objV.getLblM1Res1().setVisible(true);
        objV.getLblM1Res2().setVisible(true);
        objV.getLblM1Res3().setVisible(true);
        //////segunda malla
        objV.getCmbM2RV1().addActionListener(this);
        objV.getCmbM2RV2().addActionListener(this);
        objV.getCmbM2RV3().addActionListener(this);
        objV.getCmbM2RV4().addActionListener(this);
        objV.getCmbM2RV5().addActionListener(this);
        objV.getCmbM2RV6().addActionListener(this);
        objV.getLblM2Res1().setVisible(true);
        objV.getLblM2Res2().setVisible(true);
        objV.getLblM2Res3().setVisible(true);
        objV.getLblM2Res4().setVisible(true);
        objV.getLblM2Res5().setVisible(true);
        objV.getLblM2Res6().setVisible(true);
        //////tercera malla
        objV.getCmbM3RV1().addActionListener(this);
        objV.getCmbM3RV2().addActionListener(this);
        objV.getCmbM3RV3().addActionListener(this);
        objV.getCmbM3RV4().addActionListener(this);
        objV.getCmbM3RV5().addActionListener(this);
        objV.getCmbM3RV6().addActionListener(this);
        objV.getCmbM3RV7().addActionListener(this);
        objV.getCmbM3RV8().addActionListener(this);
        objV.getCmbM3RV9().addActionListener(this);
        objV.getLblM3Res1().setVisible(true);
        objV.getLblM3Res2().setVisible(true);
        objV.getLblM3Res3().setVisible(true);
        objV.getLblM3Res4().setVisible(true);
        objV.getLblM3Res5().setVisible(true);
        objV.getLblM3Res6().setVisible(true);
        objV.getLblM3Res7().setVisible(true);
        objV.getLblM3Res8().setVisible(true);
        objV.getLblM3Res9().setVisible(true);
    }

    public ControladorKirchhoff() {
        this.objV = new VentanaKirchhoff();
        this.objM1 = new CalculoM1();
        /////primer malla
        objV.getCmbM1RV1().addActionListener(this);
        objV.getCmbM1RV2().addActionListener(this);
        objV.getCmbM1RV3().addActionListener(this);
        objV.getBtnM1Result().addActionListener(this);
        objV.getLblM1Res1().setVisible(true);
        objV.getLblM1Res2().setVisible(true);
        objV.getLblM1Res3().setVisible(true);
        //////segunda malla
        objV.getCmbM2RV1().addActionListener(this);
        objV.getCmbM2RV2().addActionListener(this);
        objV.getCmbM2RV3().addActionListener(this);
        objV.getCmbM2RV4().addActionListener(this);
        objV.getCmbM2RV5().addActionListener(this);
        objV.getCmbM2RV6().addActionListener(this);
        objV.getLblM2Res1().setVisible(true);
        objV.getLblM2Res2().setVisible(true);
        objV.getLblM2Res3().setVisible(true);
        objV.getLblM2Res4().setVisible(true);
        objV.getLblM2Res5().setVisible(true);
        objV.getLblM2Res6().setVisible(true);
        //////tercera malla
        objV.getCmbM3RV1().addActionListener(this);
        objV.getCmbM3RV2().addActionListener(this);
        objV.getCmbM3RV3().addActionListener(this);
        objV.getCmbM3RV4().addActionListener(this);
        objV.getCmbM3RV5().addActionListener(this);
        objV.getCmbM3RV6().addActionListener(this);
        objV.getCmbM3RV7().addActionListener(this);
        objV.getCmbM3RV8().addActionListener(this);
        objV.getCmbM3RV9().addActionListener(this);
        objV.getLblM3Res1().setVisible(true);
        objV.getLblM3Res2().setVisible(true);
        objV.getLblM3Res3().setVisible(true);
        objV.getLblM3Res4().setVisible(true);
        objV.getLblM3Res5().setVisible(true);
        objV.getLblM3Res6().setVisible(true);
        objV.getLblM3Res7().setVisible(true);
        objV.getLblM3Res8().setVisible(true);
        objV.getLblM3Res9().setVisible(true);
    }

    public void iniciar() {
        objV.setTitle("Ley de Kirchhoff (Nodos y Mallas)");
        objV.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == objV.getCmbM1RV1()) {
            switch (objV.getCmbM1RV1().getSelectedIndex()) {
                case 0:
                    objV.getLblM1Res1().setVisible(true);
                    objV.getLblM1R1().setVisible(true);
                    objV.getLblVAlM1R1().setText(objV.getTxtM1RV1().getText());
                    break;
                case 1:
                    objV.getLblM1Res1().setVisible(false);
                    objV.getLblM1R1().setVisible(false);
                    if(objV.getTxtM1RV1().getText() == " "){
                        objV.getLblVAlM1R1().setVisible(false);
                    }
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM1RV2()) {
            switch (objV.getCmbM1RV2().getSelectedIndex()) {
                case 0:
                    objV.getLblM1Res2().setVisible(true);
                    objV.getLblM1R2().setVisible(true);
                    objV.getLblVAlM1R2().setText(objV.getTxtM1RV2().getText());
                    break;
                case 1:
                    objV.getLblM1Res2().setVisible(false);
                    objV.getLblM1R2().setVisible(false);
                     if(objV.getTxtM1RV2().getText() == " "){
                        objV.getLblVAlM1R2().setVisible(false);
                    }
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM1RV3()) {
            switch (objV.getCmbM1RV3().getSelectedIndex()) {
                case 0:
                    objV.getLblM1Res3().setVisible(true);
                    objV.getLblM1R3().setVisible(true);
                    objV.getLblVAlM1R3().setText(objV.getTxtM1RV3().getText());
                    break;
                case 1:
                    objV.getLblM1Res3().setVisible(false);
                    objV.getLblM1R3().setVisible(false);
                     if(objV.getTxtM1RV3().getText() == " "){
                        objV.getLblVAlM1R3().setVisible(false);
                    }
                    break;
            }

        }

        if (e.getSource() == objV.getBtnM1Result() && objV.getCmbM1V1().getSelectedIndex() == 0) {

            objM1.setResT(((Double.parseDouble(objV.getTxtM1RV1().getText()))
                    + (Double.parseDouble(objV.getTxtM1RV2().getText()))
                    + (Double.parseDouble(objV.getTxtM1RV3().getText()))));
            //Corriente del circuito
            objM1.setI1(((Double.parseDouble(objV.getTxtM1V1().getText())) / objM1.getResT()));
            ////Voltajes de las resistencias 
            objM1.setM1V1((Double.parseDouble(objV.getTxtM1RV1().getText())) * objM1.getI1());
            objM1.setM1V2((Double.parseDouble(objV.getTxtM1RV2().getText())) * objM1.getI1());
            objM1.setM1V3((Double.parseDouble(objV.getTxtM1RV3().getText())) * objM1.getI1());

            JOptionPane.showMessageDialog(objV, "Resultados: \n " + objM1.toString() + "\nMalla = - "
                    + objV.getTxtM1V1().getText() + "V + " + objM1.getM1V1() + "V + " + objM1.getM1V2() + "V + "
                    + objM1.getM1V3() + "V = 0");
        }

        ////////////seguna malla 
        if (e.getSource() == objV.getCmbM2RV1()) {
            switch (objV.getCmbM2RV1().getSelectedIndex()) {
                case 0:
                    objV.getLblM2Res1().setVisible(true);
                    break;
                case 1:
                    objV.getLblM2Res1().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM2RV2()) {
            switch (objV.getCmbM2RV2().getSelectedIndex()) {
                case 0:
                    objV.getLblM2Res2().setVisible(true);
                    break;
                case 1:
                    objV.getLblM2Res2().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM2RV3()) {
            switch (objV.getCmbM2RV3().getSelectedIndex()) {
                case 0:
                    objV.getLblM2Res3().setVisible(true);
                    break;
                case 1:
                    objV.getLblM2Res3().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM2RV4()) {
            switch (objV.getCmbM2RV4().getSelectedIndex()) {
                case 0:
                    objV.getLblM2Res4().setVisible(true);
                    break;
                case 1:
                    objV.getLblM2Res4().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM2RV5()) {
            switch (objV.getCmbM2RV5().getSelectedIndex()) {
                case 0:
                    objV.getLblM2Res5().setVisible(true);
                    break;
                case 1:
                    objV.getLblM2Res5().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM2RV6()) {
            switch (objV.getCmbM2RV6().getSelectedIndex()) {
                case 0:
                    objV.getLblM2Res6().setVisible(true);
                    break;
                case 1:
                    objV.getLblM2Res6().setVisible(false);
                    break;
            }

        }

        ///////// tercera malla
        if (e.getSource() == objV.getCmbM3RV1()) {
            switch (objV.getCmbM3RV1().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res1().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res1().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV2()) {
            switch (objV.getCmbM3RV2().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res2().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res2().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV3()) {
            switch (objV.getCmbM3RV3().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res3().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res3().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV4()) {
            switch (objV.getCmbM3RV4().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res4().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res4().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV5()) {
            switch (objV.getCmbM3RV5().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res5().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res5().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV6()) {
            switch (objV.getCmbM3RV6().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res6().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res6().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV7()) {
            switch (objV.getCmbM3RV7().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res7().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res7().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV8()) {
            switch (objV.getCmbM3RV8().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res8().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res8().setVisible(false);
                    break;
            }

        }

        if (e.getSource() == objV.getCmbM3RV9()) {
            switch (objV.getCmbM3RV9().getSelectedIndex()) {
                case 0:
                    objV.getLblM3Res9().setVisible(true);
                    break;
                case 1:
                    objV.getLblM3Res9().setVisible(false);
                    break;
            }

        }
    }
}
