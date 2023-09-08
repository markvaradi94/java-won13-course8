package ro.fasttrackit.course8.abstraction;

public abstract class AbstractAnimal {
    private int weight;
    private int noOfLegs;

    public AbstractAnimal(int weight, int noOfLegs) {
        this.weight = weight;
        this.noOfLegs = noOfLegs;
    }

    public abstract String talk();

    public abstract String walk();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
