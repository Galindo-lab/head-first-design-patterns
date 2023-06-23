/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpattern;

/**
 *
 * @author galindo
*/
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay();
        wd.registerObserver(ccd);
        
        
        wd.setMesurements(1, 3, 2);
    }
    
}

