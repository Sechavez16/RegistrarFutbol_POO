/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.upb.correcionexamen1;

/**
 *
 * @author Sebastian
 */
public class CoEduUpbExamenuno {

    public static void main(String[] args) {
        //Creamos los tres jugadores
        
        //Jugador 1 atacante
        Atacante Jugador1 = new Atacante("Benzema", "Francea",34,180,"D",true,56,40,38,5);
        //Jugador 2 Medio Campista.
        
        MedioCampista Jugador2 = new MedioCampista("Kroos", "Alemania", 35, 178,"D", true,890,885);
        //Jugador 3 Defensa
        Defensa Jugador3 = new Defensa("Sergio Ramos","España", 36,199,"D",true,67,60,1);
        
        
        //Agregamos las lesiones
        
        //Jugador 1
        Jugador1.addLesion(new Lesion("Muscular", "Alta", 120));
        Jugador1.addLesion(new Lesion("Muscular", "Baja", 10));
        Jugador1.addLesion(new Lesion("Tendon", "Baja", 6));
        Jugador1.addLesion(new Lesion("Tendon", "Media", 60));
        Jugador1.addLesion(new Lesion("Articulacion", "Gravedad", 89));
        Jugador1.addLesion(new Lesion("Articulacion", "Media", 30));
        
        //Jugador 2
        Jugador2.addLesion(new Lesion("Muscular", "Alta", 189));
        Jugador2.addLesion(new Lesion("Muscular", "Baja", 16));
        Jugador2.addLesion(new Lesion("Tendon", "Baja", 1));
        Jugador2.addLesion(new Lesion("Tendon", "Media", 80));
        Jugador2.addLesion(new Lesion("Articulacion", "Gravedad", 99));
        Jugador2.addLesion(new Lesion("Articulacion", "Media", 60));
        
        //Jugador 3
        Jugador3.addLesion(new Lesion("Muscular", "Baja", 10));
        Jugador3.addLesion(new Lesion("Muscular", "Baja", 16));
        Jugador3.addLesion(new Lesion("Tendon", "Baja", 6));
        Jugador3.addLesion(new Lesion("Tendon", "Media", 60));
        Jugador3.addLesion(new Lesion("Articulacion", "Gravedad", 89));
        Jugador3.addLesion(new Lesion("Articulacion", "Media", 30));
        
        
    }
}
