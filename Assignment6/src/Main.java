public class Main {
    static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Lion("Alex"));
        zoo.addAnimal(new Giraffe("Melman"));
        zoo.addAnimal(new Elephant("Damba"));

        Feeder feeder = new Feeder();
        Veterinarian veterinarian = new Veterinarian();

        IO.println("******************************");

        zoo.accept(feeder);

        IO.println("----------------------------");

        zoo.accept(veterinarian);

        IO.println("******************************");
    }
}
