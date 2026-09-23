public class MusicSystem {

    private boolean playing;
    private int volume;

    public void playMusic() {
        playing = true;
        IO.println("Music started.");
    }

    public void stopMusic() {
        playing = false;
        IO.println("Music stopped.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        IO.println("Volume set to " + volume + ".");
    }
}