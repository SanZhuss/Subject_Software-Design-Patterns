public class Giraffe implements Animal{
    private String name;

    public Giraffe(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitGiraffe(this);
    }
}
