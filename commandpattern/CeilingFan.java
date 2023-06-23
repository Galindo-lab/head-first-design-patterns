package commandpattern;

public class CeilingFan {

    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
    }

    public void medium() {
        level = MEDIUM;
    }

    public void low() {
        level = LOW;
    }

    public void off() {
        level = 0;
    }

    public int getSpeed() {
        return level;
    }
}
