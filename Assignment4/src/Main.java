public class Main {
    public static void main(String[] args) {

        SmartHomeFacade smartHome = new SmartHomeFacade();

        IO.println("|--- Arriving Home ---|");
        smartHome.arriveHome();

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