public class LightSystem {

    private boolean lightsOn;
    private int brightness;

    public void turnOn() {
        lightsOn = true;
        IO.println("Lights are turned on.");
    }

    public void turnOff() {
        lightsOn = false;
        IO.println("Lights are turned off.");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        IO.println("Brightness set to " + brightness + "%.");
    }
}