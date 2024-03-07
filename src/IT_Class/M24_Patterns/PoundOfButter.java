package IT_Class.M24_Patterns;
//фабричный метод
public class PoundOfButter {
    public static void main(String[] args) {
        IProducer farmer = new Farmer();
        IProducer backer = new Backer();

        IProduct bread = backer.make(1);
        IProduct butter = farmer.make(bread.getWeight());

        IProducer judge = new Judge();
        IProduct decision = judge.make(0);

        System.out.println("A farmer sold butter to a baker");
        System.out.format("The weight of the butter is %.2f pounds \n",butter.getWeight());
        System.out.println("The baker took the farmer to court");
        System.out.println("The farmer put the bread on the scale and weight the bread");
        System.out.format("The weight of the bread is also %.2f pounds \n",bread.getWeight());
        System.out.format(((Decision)decision).getDecision());

    }
}
interface IProduct{
    double getWeight();
    void setWeight(double weight);
}

interface IProducer{
    IProduct make(double weight);
}

class Bread implements IProduct{

    private double weight;
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Butter implements IProduct{

    private double weight;
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Farmer implements IProducer{

    @Override
    public IProduct make(double weight) {
        IProduct butter = new Butter();
        butter.setWeight(weight);
        return butter;
    }
}

class Backer implements IProducer{

    @Override
    public IProduct make(double weight) {
        IProduct bread = new Butter();
        bread.setWeight(Math.random()*0.1+0.9);
        return bread;
    }
}

class Decision implements IProduct{
    private String decision = "Don’t try to cheat others.";
    public String getDecision(){
        return decision;
    }
    public double getWeight(){return 0;}
    public void setWeight(double weight){}
}

class Judge implements IProducer{
    public IProduct make(double weight){
        IProduct decision = new Decision();
        return decision;
    }
}