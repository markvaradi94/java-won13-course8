package ro.fasttrackit.course8.inheritance;

public class MountainBike extends Bike {
    private int suspensionStrength;

    public MountainBike(int suspensionStrength) {
        super(8);
        this.suspensionStrength = suspensionStrength;
    }

    //    public MountainBike() {
//        super();
//    }

    public void testAccess() {
        defaultMethod();
        super.defaultMethod();
        protectedMethod();
    }

    @Override
    void defaultMethod() {
        super.defaultMethod();
        System.out.println("Mountain bike default");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "suspensionStrength=" + suspensionStrength +
                '}';
    }
}
