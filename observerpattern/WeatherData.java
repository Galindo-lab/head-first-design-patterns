/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author galindo
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        String name = o.toString();

        if (! observers.remove(o)) {
            System.out.println("NO existe el observador: " + name);
            return;
        }

        System.out.println("observador " + name + " eliminado");
    }

    @Override
    public void notifyObservers() {
        observers.forEach((Object e) -> {
            ((Observer) e).update(temperature, humidity, pressure);
        });
    }

    public void measurementsChaged() {
        this.notifyObservers();
    }

    public void setMesurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.measurementsChaged();
    }

}
