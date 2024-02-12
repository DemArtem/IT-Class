package IT_Class.M11_OOP;

import IT_Class.M11_OOP.Variety;

class Apple {

    private double weight;
    private Variety variety;

    public Apple(double weight, Variety variety) {
        this.weight = weight;
        this.variety = variety;
    }

    public void setWeight(double weight) { //setter - можем записывать
        this.weight = weight;
    }

    public double getWeight() { //getter - только для чтения
        return weight;
    }

    public Variety getVariety() {
        return variety;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", variety=" + variety +
                '}';
    }
}
