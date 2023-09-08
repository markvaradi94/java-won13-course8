package ro.fasttrackit.course8.abstraction;

public class Cat extends AbstractAnimal {
    public Cat(int weight, int noOfLegs) {
        super(weight, noOfLegs);
    }

    public String talk() {
        return "meow";
    }

    public String walk() {
        return "cat-walking";
    }
}
