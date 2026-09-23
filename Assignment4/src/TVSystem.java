public class TVSystem {
    private boolean poweredOn;
    private int volume;

    public void turnOn(){
        this.poweredOn = true;
        IO.println("TV powered on");
    };

    public void turnOff(){
        this.poweredOn = false;
        IO.println("TV turned off");
    };

    public void setVolume(int volume) {
        this.volume = volume;
        IO.println("Volume set to " + volume + ".");
    }

    public void playMovie(){
        IO.println("TV started playing Movie");
    };
}
