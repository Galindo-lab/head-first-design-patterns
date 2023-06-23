/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author galindo
 */
class Stereo {

    void on() {
        System.out.println("Estereo encendido");
    }

    void setCD() {
        System.out.println("Disco cambiado");
    }

    void setVolume(int volume) {
        System.out.println("Volumen cambiado a " + volume);
    }

    void off() {
        System.out.println("Estereo apagado");
    }
    
}
