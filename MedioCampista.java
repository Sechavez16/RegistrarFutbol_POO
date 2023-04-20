/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.upb.correcionexamen1;

/**
 *
 * @author Sebastian
 */
class MedioCampista extends Jugador{
    private int pases;
    private int pasesAcertados;
    public MedioCampista(String nombre, String pais, int edad, int estaturaCms, String pieDiestro,boolean titular, int pases, int pasesAcertados ){
        super(nombre,pais,edad,estaturaCms,pieDiestro,titular);
        this.pases=pases;
        this.pasesAcertados=pasesAcertados;
        
    }
    public int getPases(){
        return this.pases;
    }
    public int getPasesAcertados(){
        return this.pasesAcertados;
    }
    public double getPorcentajePasesAcertados(){
        return this.pasesAcertados/this.pases;
    }
}

