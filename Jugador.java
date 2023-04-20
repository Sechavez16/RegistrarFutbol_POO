/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.upb.correcionexamen1;

/**
 *
 * @author Sebastian
 */
class Jugador{
    String nombre;
    String pais;
    int edad;
    int esataturaCms;
    String pieDiestro;
    boolean titular;
    Lesion [] lesiones = new Lesion[20];
    int contador=0;
    public Jugador(String nombre, String pais, int edad, int estaturaCms, String pieDiestro, boolean titular){
        this.nombre=nombre;
        this.pais=pais;
        this.edad=edad;
        this.esataturaCms=estaturaCms;
        this.pieDiestro=pieDiestro;
        this.titular=titular;
        
    }
    public void addLesion(Lesion lesion){
        this.lesiones[contador] = lesion;
	contador ++;
    }
    public int getNumeroLesiones(){
        return contador;
    }
    public String getNombre(){
        return this.nombre;
    }
     public String getPais(){
        return this.pais;
    }
     public int getEdad(){
        return this.edad;
    }
     public int getEstaturaCms(){
        return this.esataturaCms;
    }
    public String getPieDiestri(){
        return this.pieDiestro;
    }
    public boolean getTitular(){
        return this.titular;
    }
    public Lesion[] getLesionesPorTipo(String Tipo){
        Lesion[] resultados = new Lesion[contador];
	int contadorResultados = 0;
	for (int i=0;i<contador;i++){
            if(lesiones[i].getTipoLesion()==Tipo){
                resultados[contadorResultados] = lesiones[i];
		contadorResultados ++;
            }
        }
        return resultados;
        
    }
    public Lesion[] getLesionesPorGravedad(String Tipo){
        Lesion[] resultados = new Lesion[contador];
	int contadorResultados = 0;
	for (int i=0;i<contador;i++){
            if(lesiones[i].getGravedadLesion()==Tipo){
                resultados[contadorResultados] = lesiones[i];
		contadorResultados ++;
            }
        }
        return resultados;
        
    }
    
}