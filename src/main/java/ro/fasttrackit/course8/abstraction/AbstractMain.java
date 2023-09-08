package ro.fasttrackit.course8.abstraction;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = new AbstractAnimal[]{new Dog(5, 4), new Cat(2, 4)};

        for (AbstractAnimal animal : animals) {
            System.out.println(animal.talk());
        }

    }
}
