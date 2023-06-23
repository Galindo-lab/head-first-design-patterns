/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfachada;

/**
 *
 * @author galindo
 */
class Amplifier {

    public void on() {
        System.out.println("amplificador apagado");
    }

    public void off() {
        System.out.println("amplificador encendido");
    }

    public void setSurroundSound() {
        System.out.println("audio surround");
    }

    public void setVolume(int level) {
        System.out.println("volumen" + level);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Amplifier{");
        sb.append('}');
        return sb.toString();
    }

    
}
