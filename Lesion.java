/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.upb.correcionexamen1;

/**
 *
 * @author Sebastian
 */
class Lesion{
    String tipoLesion;
    String gravedadLesion;
    int diasIncapacidad;
    public Lesion(String tipoLesion, String gravedadLesion, int diasIncapacidad){
        this.tipoLesion=tipoLesion;
        this.gravedadLesion=gravedadLesion;
        this.diasIncapacidad=diasIncapacidad;
    }
    public String getTipoLesion(){
        return this.tipoLesion;
    }
    public String getGravedadLesion(){
        return this.gravedadLesion;
    }
    public int getDiasIncapacidad(){
        return this.diasIncapacidad;
    }
}
