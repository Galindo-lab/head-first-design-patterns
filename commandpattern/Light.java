    package commandpattern;

public class Light {

    String place = "";

    public Light(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println("la luz de " + this.place + " esta encendida");
    }

    public void off() {
        System.out.println("la luz de " + this.place + " esta apagada");
    }
}
