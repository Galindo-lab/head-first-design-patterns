/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfachada;

/**
 *
 * @author galindo
 */
class CdPlayer {


    void on() {
        System.out.println("CD player encendido");
    }

    void play(String movie) {
        System.out.println("reproduciendo " + movie);
    }

    void stop() {
        System.out.println("Pelicula detenida");
    }

    void off() {
        System.out.println("reproductor de dvd apagado");
    }
    
}
