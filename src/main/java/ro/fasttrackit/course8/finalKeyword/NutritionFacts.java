package ro.fasttrackit.course8.finalKeyword;

public class NutritionFacts {
    private final int servings;
    private final int servingSize;
    private final int fat;
    private final int sodium;

    public NutritionFacts(int servings, int servingSize) {
        this(servings, servingSize, 0);
    }

    public NutritionFacts(int servings, int servingSize, int fat) {
        this(servings, servingSize, fat, 0);
    }

    public NutritionFacts(int servings, int servingSize, int fat, int sodium) {
        this.servings = servings;
        this.servingSize = servingSize;
        this.fat = fat; // init cu 0
        this.sodium = sodium; // init cu 0
    }
}
