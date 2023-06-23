/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronfachada;

/**
 *
 * @author galindo
 */
public class PatronFachada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        CdPlayer dvd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector, screen, lights, popper);

        System.out.println(
                "*********\n" +
                "Iniciando home theater\n" + 
                "*********\n"
        );
        homeTheater.watchMovie("Raiders of the Lost Ark");
        
        System.out.println(
                "*********\n" +
                "apagando home theater\n" + 
                "*********\n"
        );
        homeTheater.endMovie();
    }

}
