/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.upb.correcionexamen1;

/**
 *
 * @author Sebastian
 */
class Atacante extends Jugador{
    private int tiro;
    private int tirosAlArco;
    private int goles;
    private int golesPenalti;
    
    public Atacante(String nombre, String pais, int edad, int estaturaCms, String pieDiestro, boolean titular, int tiro,int tiroAlArco, int goles, int golesPenaltis){
        super(nombre,pais,edad,estaturaCms,pieDiestro,titular);
        this.tiro=tiro;
        this.tirosAlArco=tirosAlArco;
        this.goles=goles;
        this.golesPenalti=golesPenalti;
    }
    public int getTiros(){
        return this.tiro;
    }
    public int getTirosAlArco(){
        return this.tirosAlArco;
    }
    public int getGoles(){
        return this.goles;
    }
    public int getGolesPenaltis(){
        return this.golesPenalti;
    }
    public double getPorcenatejTirosAlArco(){
        return this.tiro/this.tirosAlArco;
    }
    public double getPorcentajeGolesPenaltis(){
        return this.goles/this.golesPenalti;
    }
}