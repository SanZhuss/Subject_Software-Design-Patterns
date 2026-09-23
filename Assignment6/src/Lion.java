public class Lion implements Animal{
    private String name;

    public Lion(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitLion(this);
    }
}
