public class Feeder implements Visitor{
    @Override
    public void visitLion(Lion lion){
        IO.println("Feeding lion " + lion.getName() + " with meat.");
    }

    @Override
    public void visitElephant(Elephant elephant){
        IO.println("Feeding elephant " + elephant.getName() + " with fruits.");
    }

    @Override
    public void visitGiraffe(Giraffe giraffe){
        IO.println("Feeding giraffe " + giraffe.getName() + " with leaves.");
    }
}
