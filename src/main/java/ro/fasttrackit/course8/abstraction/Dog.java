package ro.fasttrackit.course8.abstraction;

public class Dog extends AbstractAnimal {
    public Dog(int weight, int noOfLegs) {
        super(weight, noOfLegs);
    }

    public String talk() {
        return "woof";
    }

    public String walk() {
        return "dog-walking";
    }
}
