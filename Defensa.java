/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.upb.correcionexamen1;

/**
 *
 * @author Sebastian
 */
class Defensa extends Jugador{
    private int entradas;
    private int falasProvocadas;
    private int penaltisProvocados;
    public Defensa(String nombre, String pais, int edad, int estaturaCms, String pieDiestro, boolean titular, int Entradas, int faltasProvocadas, int penaltisProvocados){
         super(nombre,pais,edad,estaturaCms,pieDiestro,titular);
        this.entradas=Entradas;
        this.falasProvocadas=faltasProvocadas;
        this.penaltisProvocados=penaltisProvocados;      
        
    }
    public int getEntradas(){
        return this.entradas;
    }
    public int getFaltasProvocadas(){
        return this.falasProvocadas;
    }
    public double getProcentajeFaltasProvocadas(){
        return this.entradas/this.falasProvocadas;
    }
    public double getPorcentajePenaltisProvocados(){
        return this.falasProvocadas/this.penaltisProvocados;
    }
}
