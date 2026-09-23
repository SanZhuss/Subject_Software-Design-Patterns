public class Veterinarian implements Visitor{
    @Override
    public void visitLion(Lion lion){
        IO.println("Checking lion " + lion.getName());
    }

    @Override
    public void visitElephant(Elephant elephant){
        IO.println("Checking elephant " + elephant.getName());
    }

    @Override
    public void visitGiraffe(Giraffe giraffe){
        IO.println("Checking giraffe " + giraffe.getName());
    }
}
