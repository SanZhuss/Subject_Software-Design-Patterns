public class Main {
    public static void main(String[] args) {

        LightSystem lightSystem = new LightSystem();
        SecuritySystem securitySystem = new SecuritySystem();
        HeatingSystem heatingSystem = new HeatingSystem();
        MusicSystem musicSystem = new MusicSystem();
        CurtainSystem curtainSystem = new CurtainSystem();
        TVSystem tvSystem = new TVSystem();

        SmartHomeFacade smartHome = new SmartHomeFacade(
                        lightSystem,
                        heatingSystem,
                        securitySystem,
                        musicSystem,
                        curtainSystem,
                        tvSystem
                );

        IO.println("|--- Arriving Home ---|");
        smartHome.arriveHome();

        IO.println("\n|--- Vacation Mode ---|");
        smartHome.vacationMode();

        IO.println("\n|--- Watching a Movie ---|");
        smartHome.movieMode();

        IO.println("\n|--- Party Time ---|");
        smartHome.partyMode();

        IO.println("\n|--- Going to Sleep ---|");
        smartHome.sleepMode();

        IO.println("\n|--- Leaving Home ---|");
        smartHome.leaveHome();
    }
}