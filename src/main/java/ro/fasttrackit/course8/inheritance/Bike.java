package ro.fasttrackit.course8.inheritance;

public class Bike extends Object {  // Bike() {}
    private static final int MAX_PRESSURE = 10;
    private int tyrePressure;
    private int speed;

    // default
    // protected

    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public void increaseSpeed(int amount) {
        speed += amount;
    }

    public void stop() {
        speed = 0;
    }

    public void inflateTyre(int amount) {
        if (amount + tyrePressure > MAX_PRESSURE) {
            flatTyre();
        } else {
            tyrePressure += amount;
        }
    }

    private void flatTyre() {
        System.out.println("Bike got a flat tyre");
        tyrePressure = 0;
    }

    public final void bikeMessage() {
        System.out.println("This is a good bike");
    }

    public int getTyrePressure() {
        return tyrePressure;
    }

    protected void protectedMethod() {
        System.out.println("This is protected");
    }

    void defaultMethod() {
        System.out.println("This is default");
    }

    public int getSpeed() {
        return speed;
    }


}
