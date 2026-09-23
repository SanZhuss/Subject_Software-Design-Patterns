public class Elephant implements Animal{
    private String name;

    public Elephant(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitElephant(this);
    }
}
