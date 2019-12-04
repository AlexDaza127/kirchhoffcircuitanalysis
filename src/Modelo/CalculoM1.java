/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.VentanaKirchhoff;
import java.util.Observable;

/**
 *
 * @author Michael
 */
public class CalculoM1{
    private double I1;
    private double M1V1;
    private double M1V2;
    private double M1V3;
    private double resT;
    VentanaKirchhoff objK; 

    public double getM1V1(){
        return M1V1;
    }

    public void setM1V1(double M1V1) {
        this.M1V1 = M1V1;    
    }

    public double getM1V2() {
        return M1V2;
    }

    public void setM1V2(double M1V2) {
        this.M1V2 = M1V2;
    }

    public double getM1V3() {
        return M1V3;
    }

    public void setM1V3(double M1V3) {
        this.M1V3 = M1V3;
    }

    public double getV1() {
        return M1V1;
    }

    public void setV1(double V1) {
        this.M1V1 = V1;
    }

    public double getResT() {
        return resT;
    }

    public void setResT(double resT) {
        this.resT = resT;
    }

    public double getI1() {
        return I1;
    }

    public void setI1(double I1) {
        this.I1 = I1;
    }

    public VentanaKirchhoff getObjK() {
        return objK;
    }

    public void setObjK(VentanaKirchhoff objK) {
        this.objK = objK;
    }

    public CalculoM1(double I1, double resT, double M1V1, double M1V2, double M1V3, VentanaKirchhoff objK) {
        this.I1 = I1;
        this.M1V1 = M1V1;
        this.M1V2 = M1V2;
        this.M1V3 = M1V3;
        this.resT = resT;
        this.objK = objK;
    }
    
    public CalculoM1() {
        this.I1 = 0;
        this.M1V1 = 0;
        this.M1V2 = 0;
        this.M1V3 = 0;
        this.resT = 0;
        this.objK = new VentanaKirchhoff();
    }

        
    @Override
    public String toString() {
        return "Corriente = " + I1 + " A \n"+
               "Voltaje 1(Res 1)= " + M1V1 + " V \n" +
               "Voltaje 2(Res 2)= " + M1V2 + " V \n" +
               "Voltaje 3(Res 3)= " + M1V3 + " V \n" +
               "Resistencia Total = " + resT + " Ohm";
    }
}
