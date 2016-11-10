/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfp;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class LFP {
    public static ArrayList<Equipo> equipos=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    
    public static void rellenarDatos()
    {
        for (int i = 0; i < 20; i++) {
            EquipoPrimera prime= new EquipoPrimera();
            prime.setNombre("Equipo");
            prime.setFundacion(i);
            prime.setCapacidad(5000);
            prime.setEstadio("ESTADIO");
            
            Entrenador en = new Entrenador();
            en.setNombre("ENTRENADOR");
            en.setEdad(i);
            en.setNacionalidad("ESPAÑOLA");
            prime.setEntrenador(en);
            
            Masajista ma= new Masajista();
            ma.setNombre("MASAJISTA");
            ma.setEdad(i);
            ma.setNumColegiado(i + 1999);
            prime.setMasajista(ma);
            
            for (int j = 0; j < 22; j++) {
                Jugador jug= new Jugador();
                jug.setNombre("Jugador");
                jug.setEdad(j);
                jug.setAltura(j);
                jug.setPeso(j);
                prime.aniadirJugador(jug);
            }
            equipos.add(prime);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        rellenarDatos();
        System.out.println("hola");
    }
    
}
