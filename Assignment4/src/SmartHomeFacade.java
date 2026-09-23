public class SmartHomeFacade {

    private final TVSystem tvSystem;
    private final SecuritySystem securitySystem;
    private final LightSystem lightSystem;
    private final HeatingSystem heatingSystem;
    private final MusicSystem musicSystem;
    private final CurtainSystem curtainSystem;

    public SmartHomeFacade() {
        securitySystem = new SecuritySystem();
        lightSystem = new LightSystem();
        heatingSystem = new HeatingSystem();
        musicSystem = new MusicSystem();
        curtainSystem = new CurtainSystem();
        tvSystem = new TVSystem();
    }

    public void arriveHome() {
        securitySystem.disarmSystem();
        lightSystem.turnOn();
        heatingSystem.turnOn();
        heatingSystem.setTemperature(22);
        curtainSystem.openCurtains();
        musicSystem.playMusic();
    }


    public void leaveHome(){
        lightSystem.turnOff();
        musicSystem.stopMusic();
        tvSystem.turnOff();
        heatingSystem.turnOff();
        securitySystem.armSystem();
        curtainSystem.closeCurtains();
    }

    public void sleepMode(){
        lightSystem.turnOff();
        musicSystem.stopMusic();
        curtainSystem.closeCurtains();
        securitySystem.armSystem();
        heatingSystem.setTemperature(18);
    }

    public void movieMode(){
        curtainSystem.closeCurtains();
        lightSystem.setBrightness(50);
        tvSystem.turnOn();
        tvSystem.playMovie();
    }

    public void partyMode(){
        lightSystem.turnOn();
        lightSystem.setBrightness(100);
        musicSystem.playMusic();
        musicSystem.setVolume(80);
        curtainSystem.openCurtains();
    }
}
